package co.edu.unicauca.restaurantehexagonal.dominio.entities;

import java.util.Date;

/**
 * Cliente del restaurante
 *
 * @author Libardo, Julio
 */
public class Usuario {

    private int userId;
    private String userName;
    /**
     * Nombre Cliente
     */
    private String userPassword;
    /**
     * Nombre Cliente
     */
    private String userNombre;
    /**
     * Apellido Cliente
     */
    private String userApellido;
    /**
     * Fecha Nacimiento
     */
    private Date userFechaNac;
    /**
     * Genero
     */
    private String userGenero;
    /**
     * Nombre Cliente
     */
    private String userCelular;
    /**
     * Email
     */
    private String userEmail;

    public Usuario(int userId, String userName, String userPassword, String userNombre, String userApellido, Date userFechaNac, String userGenero, String userCelular, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userNombre = userNombre;
        this.userApellido = userApellido;
        this.userFechaNac = userFechaNac;
        this.userGenero = userGenero;
        this.userCelular = userCelular;
        this.userEmail = userEmail;
    }
    //CONSTRUCTOR POR DEFECTO
    public Usuario() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    
    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserNombre() {
        return userNombre;
    }

    public String getUserApellido() {
        return userApellido;
    }

    public Date getUserFechaNac() {
        return userFechaNac;
    }

    public String getUserGenero() {
        return userGenero;
    }

    public String getUserCelular() {
        return userCelular;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserNombre(String userNombre) {
        this.userNombre = userNombre;
    }

    public void setUserApellido(String userApellido) {
        this.userApellido = userApellido;
    }

    public void setUserFechaNac(Date userFechaNac) {
        this.userFechaNac = userFechaNac;
    }

    public void setUserGenero(String userGenero) {
        this.userGenero = userGenero;
    }

    public void setUserCelular(String userCelular) {
        this.userCelular = userCelular;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
