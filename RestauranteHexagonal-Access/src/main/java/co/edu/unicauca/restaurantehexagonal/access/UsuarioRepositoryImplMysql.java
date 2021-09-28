package co.edu.unicauca.restaurantehexagonal.access;


import co.edu.unicauca.restaurantehexagonal.dominio.entities.Usuario;
import co.edu.unicauca.restaurantehexagonal.dominio.infra.Utilities;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IUsuarioRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Repositorio de Clientes en MySWL
 *
 * @author SoftwareTeam
 */
public class UsuarioRepositoryImplMysql implements IUsuarioRepository {

    /**
     * Conección con Mysql
     */
    private Connection conn;

    public UsuarioRepositoryImplMysql() {

    }

    /**
     * Busca cliente en la base de datos
     *
     * @param userId
     * @return
     */
    public Usuario findUsuario(String userId) {
        Usuario usuario = null;

        this.connect();
        try {
            String sql = "SELECT * FROM usuario WHERE username=? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, userId);
            ResultSet res = pstmt.executeQuery();
            if (res.next()) {
                usuario = new Usuario();
                usuario.setUserId(res.getString("userId"));
                usuario.setUserName(res.getString("userName"));
                usuario.setUserPassword(res.getString("userPassword"));
                usuario.setUserNombre(res.getString("userNombre"));
                usuario.setUserApellido(res.getString("userApellido"));
                usuario.setUserCelular(res.getString("userCelular"));
                usuario.setUserEmail(res.getString("userEmail"));

            }
            pstmt.close();
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar Customer de la base de datos", ex);
        }
        return usuario;
    }

    /**
     * Autentica al usuario
     *
     * @param username
     * @param userpassword
     * @return
     */
    public String autenticarUsuario(String username, String userpassword) {
        //Usuario usuario = null;
        String ingreso = "";
        this.connect();
        try {
            String sql2 = "SELECT * "
                    + "from restaurante a INNER JOIN usuario b on a.restadmin = b.userid "
                    + "where username='" + username + "' and  userpassword='" + userpassword + "'";
            Statement pstmt2 = conn.createStatement();
            ResultSet res2 = pstmt2.executeQuery(sql2);
            if (res2.next()) {
                ingreso = "admin";
                return ingreso;
            }
            String sql = "SELECT * "
                    + "from restaurante a RIGHT JOIN usuario b on a.restadmin = b.userid "
                    + "where username='" + username + "' and  userpassword='" + userpassword + "'";
            Statement pstmt = conn.createStatement();
            ResultSet res = pstmt.executeQuery(sql);
            if (res.next()) {
                ingreso = "usuario";
                return ingreso;
            }
            pstmt.close();
            this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar Customer de la base de datos", ex);
        }
        return ingreso;
    }

    /**
     * Crea un usuario
     *
     * @param customer
     * @return
     */
    @Override
    public String createUsuario(Usuario usuario) {

        try {

            this.connect();
            String sql = "INSERT INTO usuario(userId, userName, userPassword, userNombre, userApellido, userCelular, userEmail) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, usuario.getUserId());
            pstmt.setString(2, usuario.getUserName());
            pstmt.setString(3, usuario.getUserPassword());
            pstmt.setString(4, usuario.getUserNombre());
            pstmt.setString(5, usuario.getUserApellido());
            pstmt.setString(6, usuario.getUserCelular());
            pstmt.setString(7, usuario.getUserEmail());
            pstmt.executeUpdate();
            pstmt.close();
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al insertar el registro", ex);
        }
        String e = usuario.getUserId();
        return e;

    }

    /**
     * Permite hacer la conexion con la base de datos
     *
     * @return
     */
    public int connect() {
        try {
            Class.forName(Utilities.loadProperty("server.db.driver"));
            //crea una instancia de la controlador de la base de datos
            String url = Utilities.loadProperty("server.db.url");
            String username = Utilities.loadProperty("server.db.username");
            String pwd = Utilities.loadProperty("server.db.password");
            conn = DriverManager.getConnection(url, username, pwd);
            return 1;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UsuarioRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar Customer de la base de datos", ex);
        }
        return -1;
    }

    /**
     * Cierra la conexion con la base de datos
     *
     */
    public void disconnect() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioRepositoryImplMysql.class.getName()).log(Level.FINER, "Error al cerrar Connection", ex);
        }
    }

}
