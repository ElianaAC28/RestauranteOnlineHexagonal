package co.edu.unicauca.restaurantehexagonal.access;


import co.edu.unicauca.restaurantehexagonal.dominio.entities.Componente;
import co.edu.unicauca.restaurantehexagonal.dominio.infra.Utilities;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IComponenteRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SoftwareTeam
 */
public class ComponenteRepositoryImplMysql implements IComponenteRepository {

    /**
     * Objeto de tipo Connection, encargado de realizar la Conexion con Mysql.
     */
    public Connection conn;

    /**
     * Metodo encargado de crear un componente.
     *
     * @param parComponente Objeto de tipo Dish.
     * @return cadena de texto con el valor de platoId.
     */
    @Override
    public String createComponente(Componente parComponente) {
        try {
            this.connect();
            String sql = "INSERT INTO componente(COMPID,RESTID, COMPNOMBRE, COMPTIPO, COMPIDTIPO) VALUES (?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, parComponente.getIdComponente()+"");
            pstmt.setString(2, parComponente.getIdRestaurante()+"");
            pstmt.setString(3, parComponente.getNombreComponente());
            pstmt.setString(4, parComponente.getTipoComponente());
            pstmt.setString(5, parComponente.getIdtipoComponente()+"");
            pstmt.executeUpdate();

            pstmt.close();

            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al insertar el registro", ex);
        }
        return (parComponente.getNombreComponente());
    }

    /**
     * Metodo encargado de sacar el tipo de componente.

     */




    @Override
    public String contarComponente(int almuid, int idtipocom) {
        int cont=0;
        try {
            this.connect();
            String sql = "select count(comptipo) from tiene inner join componente on tiene.compid = componente.compid where almuid ="+almuid+" and compidtipo ="+idtipocom+";";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet comp = pstmt.executeQuery();
            if(comp.next()){
                cont = comp.getInt(1);
            }
            pstmt.close();

            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al insertar el registro", ex);
        }
        return cont+"";    
    
    }
    
    @Override
    public String contarComponentex(int almuid, String nomComp) {
        int cont=0;
        try {
            this.connect();
            String sql = "select count(*) from componente where compid = "+almuid+" or compnombre = '"+ nomComp+ "';";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet comp = pstmt.executeQuery();
            if(comp.next()){
                cont = comp.getInt(1);
            }
            pstmt.close();

            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al insertar el registro", ex);
        }
        return cont+"";    
    
    }
    
    
    public String buscarComponente(int almuid, int idComp) {
        int cont=0;
        try {
            this.connect();
            String sql = "select count(*) from tiene where almuid = "+almuid+" and compid = '"+ idComp+ "';";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet comp = pstmt.executeQuery();
            if(comp.next()){
                cont = comp.getInt(1);
            }
            pstmt.close();

            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al insertar el registro", ex);
        }
        return cont+"";    
    
    }        
    /**
     * Metodo encargado de obtener una lista de todos los componentes .
     * Sin mostrar el componente con el id seleccionado
     * @return Se retorna una lista con los resultados de la busqueda.
     */
    @Override
    public List<Componente> findAllComponentes(String idcomp) {
        List<Componente> objList = new ArrayList<Componente>();
        this.connect();
        Componente objComponente = new Componente();
        try {
            String sql = "SELECT * FROM componente where restid != "+idcomp+" ;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet comp = pstmt.executeQuery();
            while (comp.next()) {
                objComponente.setIdComponente(comp.getInt("COMPID"));
                objComponente.setNombreComponente(comp.getString("COMPNOMBRE"));
                objComponente.setTipoComponente(comp.getString("COMPTIPO"));
                objList.add(objComponente);
                objComponente = new Componente();
            }
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar el restaurante de la base de datos", ex);
        }
        return objList;
    }
    /**
     * Metodo encargado de obtener una lista de todos los componentes.
     *
     * @return Se retorna una lista con los resultados de la busqueda.
     */
    @Override
    public List<Componente> findAllComponentes() {
        List<Componente> objList = new ArrayList<Componente>();
        this.connect();
        Componente objComponente = new Componente();
        try {
            String sql = "SELECT * FROM componente;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet comp = pstmt.executeQuery();
            while (comp.next()) {
                objComponente.setIdComponente(comp.getInt("COMPID"));
                objComponente.setNombreComponente(comp.getString("COMPNOMBRE"));
                objComponente.setTipoComponente(comp.getString("COMPTIPO"));
                objList.add(objComponente);
                objComponente = new Componente();
            }
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar el restaurante de la base de datos", ex);
        }
        return objList;
    }
    
    @Override
    public List<Componente> almuerzoComponentes(int almuerzo) {
        List<Componente> objList = new ArrayList<Componente>();
        this.connect();
        Componente objComponente = new Componente();
        try {
            String sql = "SELECT tiene.COMPID, COMPNOMBRE,COMPTIPO FROM componente inner join tiene on tiene.COMPID = componente.COMPID where tiene.ALMUID ="+ almuerzo+";";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet comp = pstmt.executeQuery();
            while (comp.next()) {
                objComponente.setIdComponente(comp.getInt("COMPID"));
                objComponente.setNombreComponente(comp.getString("COMPNOMBRE"));
                objComponente.setTipoComponente(comp.getString("COMPTIPO"));
                objList.add(objComponente);
                objComponente = new Componente();
            }
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar el restaurante de la base de datos", ex);
        }
        return objList;
    }

    /**
     * Metodo que se encarga de realizar la conexion con la base de datos.
     *
     * @return 1, si la conexion fue exitosa, -1 si la conexion fue fallida.
     */
    public int connect() {
        try {
            Class.forName(Utilities.loadProperty("server.db.driver"));
            //crea una instancia de la controlador de la base de datos
            String url = Utilities.loadProperty("server.db.url");
            //String url = "jdbc:mysql://localhost:3306/bdrestauranteonline?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String username = Utilities.loadProperty("server.db.username");
            //String username = "root";
            String pwd = Utilities.loadProperty("server.db.password");
            //String pwd = "admin";
            conn = DriverManager.getConnection(url, username, pwd);
            return 1;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar Componente de la base de datos", ex);
        }
        return -1;
    }

    /**
     * Metodo encargado de desconectar la aplicacion de la base de datos.
     */
    private void disconnect() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.FINER, "Error al cerrar Connection", ex);
        }
    }

}
