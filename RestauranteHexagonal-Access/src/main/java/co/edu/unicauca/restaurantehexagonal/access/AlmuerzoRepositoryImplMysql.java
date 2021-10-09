package co.edu.unicauca.restaurantehexagonal.access;



import co.edu.unicauca.restaurantehexagonal.dominio.entities.Almuerzo;
import co.edu.unicauca.restaurantehexagonal.dominio.entities.Restaurante;
import co.edu.unicauca.restaurantehexagonal.dominio.infra.Utilities;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IAlmuerzoRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Repositorio de Almuerzo en MySQL
 *
 * @author SoftwareTeam
 */
public class  AlmuerzoRepositoryImplMysql implements IAlmuerzoRepository {

    /**
     * Conección con Mysql
     */
    public Connection conn;
 public Connection conn2;

  /*  public String findAlmuerzo(Almuerzo parAlmuerzo) {
        return "s";
    }
     public String createAlmuerzoID(Almuerzo parAlmuerzo){
        return "a";
    }
   */

    /**
     * Lista almuerzo en la base de datos
     *
     * @return
     */
    public List<Almuerzo> findAllAlmuerzos() {
        List<Almuerzo> objList = new ArrayList<Almuerzo>();
        this.connect();
        Almuerzo objAlmuerzo = new Almuerzo();
        try {

            String sql = "SELECT * FROM ALMUERZO ;";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet res = pstmt.executeQuery();
            while (res.next()) {

                objAlmuerzo.setIdAlmuerzo(res.getString("ALMUID"));
                objAlmuerzo.setRestId(res.getString("RESTID"));
                objAlmuerzo.setCostoAlm(res.getString("ALMUCOSTO"));

                objList.add(objAlmuerzo);
                objAlmuerzo = new Almuerzo();

            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar el restaurante de la base de datos", ex);
        }
        return objList;
    }
    
    /**
     * Lista almuerzo de un restaurante en la base de datos
     *
     * @param restId id del restaurante
     * @return
     */
    public List<Almuerzo> findAllAlmuerzosRest(String restId) {
        List<Almuerzo> objList = new ArrayList<Almuerzo>();
        this.connect();
        Almuerzo objAlmuerzo = new Almuerzo();
        try {

            String sql = "SELECT * FROM ALMUERZO WHERE restid = " + restId + ";";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet res = pstmt.executeQuery();
            while (res.next()) {

                objAlmuerzo.setIdAlmuerzo(res.getString("ALMUID"));
                objAlmuerzo.setRestId(res.getString("RESTID"));
                objAlmuerzo.setCostoAlm(res.getString("ALMUCOSTO"));

                objList.add(objAlmuerzo);
                objAlmuerzo = new Almuerzo();

            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar el restaurante de la base de datos", ex);
        }
        return objList;
    }

    /**
     * Se conecta a la base de datos
     */
    public int connect() {
        try {
            Class.forName(Utilities.loadProperty("server.db.driver"));
            //crea una instancia de la controlador de la base de datos
            String url = Utilities.loadProperty("server.db.url");
            String username = Utilities.loadProperty("server.db.username");
            String pwd = Utilities.loadProperty("server.db.password");
            conn = DriverManager.getConnection(url, username, pwd);
            conn2 = DriverManager.getConnection(url, username, pwd);

            return 1;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar almuerzo de la base de datos", ex);
        }
        return -1;
    }

    /**
     * Metodo encargado de desconectar la aplicacion de la base de datos.
     */
    private void disconnect() {
        try {
            conn.close();
            conn2.close();

        } catch (SQLException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.FINER, "Error al cerrar Connection", ex);
        }
    }

@Override
public String createAlmuerzo(Almuerzo parAlmuerzo) {

try {
            this.connect();

            String sql2 = "INSERT INTO ALMUERZO (ALMUID, RESTID, ALMUCOSTO) VALUES (?,?,?)";
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setString(1, parAlmuerzo.getIdAlmuerzo());
            pstmt2.setString(2, parAlmuerzo.getRestId());
            pstmt2.setString(3, parAlmuerzo.getCostoAlm());

            pstmt2.executeUpdate();

            pstmt2.close();
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al insertar el registro", ex);
        }
        return (parAlmuerzo.getIdAlmuerzo());
    }
@Override
public String updateAlmuerzo(Almuerzo parAlmuerzo) {

try {
            this.connect();

            String sql2 = "UPDATE TIENE SET COMPID = ? WHERE ALMUID = ? AND COMPID = ?;";
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setString(1, parAlmuerzo.getCostoAlm());
            pstmt2.setString(2, parAlmuerzo.getIdAlmuerzo());
            pstmt2.setString(3, parAlmuerzo.getRestId());

            pstmt2.executeUpdate();

            pstmt2.close();
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al actualizar el registro", ex);
        }
        return (parAlmuerzo.getIdAlmuerzo());
    }

@Override
public String updateCosto(Almuerzo parAlmuerzo) {

try {
            this.connect();

            String sql2 = "UPDATE AlMUERZO SET ALMUCOSTO = ?, ALMUFOTO = ? WHERE ALMUID = ? AND RESTID = ?;";
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setString(1, parAlmuerzo.getCostoAlm());
            pstmt2.setString(3, parAlmuerzo.getIdAlmuerzo());
            pstmt2.setString(4, parAlmuerzo.getRestId());
            pstmt2.setBytes(2, parAlmuerzo.getFoto());

            pstmt2.executeUpdate();

            pstmt2.close();
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al actualizar el registro", ex);
        }
        return (parAlmuerzo.getIdAlmuerzo());
    }
@Override
public String updateFoto(Almuerzo parAlmuerzo) {

try {
            this.connect();

            String sql2 = "UPDATE AlMUERZO SET ALMUFOTO = ? WHERE ALMUID = ? AND RESTID = ?;";
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setBytes(1, parAlmuerzo.getFoto());
            pstmt2.setString(2, parAlmuerzo.getIdAlmuerzo());
            pstmt2.setString(3, parAlmuerzo.getRestId());

            pstmt2.executeUpdate();

            pstmt2.close();
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al actualizar el registro", ex);
        }
        return (parAlmuerzo.getIdAlmuerzo());
    }

@Override
    public String contarAlmu(Almuerzo parAlmuerzo) {
        int cont=0;
        try {
            this.connect();
            String sql = "select count(*) from Almuerzo where almuid ="+parAlmuerzo.getIdAlmuerzo()+" and restid ="+parAlmuerzo.getRestId()+";";
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

    public String asociarComp(String almuid, String compid){
        try {
            this.connect();

            String sql2 = "INSERT INTO TIENE (ALMUID, COMPID) VALUES (?,?);";
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setString(1, almuid);
            pstmt2.setString(2, compid);

            pstmt2.executeUpdate();

            pstmt2.close();
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al actualizar el registro", ex);
        }
        return (almuid+"");
    }
    
public String deleteCompAlmuerzo(Almuerzo parAlmuerzo) {

try {
            this.connect();

            String sql2 = "DELETE FROM TIENE WHERE ALMUID = ? AND COMPID = ?;";
            PreparedStatement pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setString(1, parAlmuerzo.getIdAlmuerzo());
            pstmt2.setString(2, parAlmuerzo.getRestId());

            pstmt2.executeUpdate();

            pstmt2.close();
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al actualizar el registro", ex);
        }
        return (parAlmuerzo.getIdAlmuerzo());
    }

@Override
    public Almuerzo buscaralmu(String restId) 
    {
        Almuerzo restaurante = new Almuerzo();
        this.connect();
        try {
            String sql = "SELECT ALMUDESCRIPCION FROM almuerzo WHERE restId='" + restId +"';";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rest = pstmt.executeQuery();
            while (rest.next()) {
                restaurante.setDescripcion(rest.getString("ALMUDESCRIPCION"));
                //restaurante.setIdAlmuerzo(rest.getString("ALMUID"));
                //restaurante.setCostoAlm(rest.getString("ALMUCOSTO"));
            }
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar el restaurante de la base de datos", ex);
        }
        return restaurante;
    }

    @Override
    public List<Almuerzo> foto(String idAlmu) {
        List<Almuerzo> objList = new ArrayList<Almuerzo>();
        this.connect();
        Almuerzo objAlmuerzo = new Almuerzo();
        try {

            String sql = "SELECT ALMUFOTO FROM ALMUERZO WHERE ALMUID = "+ idAlmu +";";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet res = pstmt.executeQuery();
            while (res.next()) {

                objAlmuerzo.setFoto(res.getBytes("AlmuFoto"));
                objList.add(objAlmuerzo);

            }
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(AlmuerzoRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar el restaurante de la base de datos", ex);
        }
        return objList;
    }        
    
}
