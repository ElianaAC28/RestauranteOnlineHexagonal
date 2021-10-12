/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.restaurantehexagonal.presentacion.app;

import co.edu.unicauca.restaurantehexagonal.access.Factory;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IUsuarioRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.services.UsuarioService;
import co.edu.unicauca.restaurantehexagonal.dominio.entities.Usuario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class IniciarSesion.
     */
    @Test
    public void testAutenticarUsuario() {

        System.out.println("autenticarCustomer");
        String username = "mezcly08";
        String userpassword = "12345678";
        IUsuarioRepository repo = Factory.getInstance().getRepositoryUsuario();
        UsuarioService instance = new UsuarioService(repo);
        String expResult = "admin";
        String result = instance.autenticarUsuario(username, userpassword);
        assertEquals(expResult, result);

        // Datos que no existen
        result = instance.autenticarUsuario("lma", "453");
        assertEquals("", result);
    }
    
    @Test
    public void testCreateUsuario() {

        System.out.println("createCustomer");
        Usuario user = new Usuario();
 
        user.setUserId(1);
        user.setUserCelular("3134564852");
        user.setUserEmail("mezcly08@gmail.com");
        user.setUserFechaNac(null);
        user.setUserGenero(null);
        user.setUserApellido("Hoyos Joiro");
        user.setUserName("Carlos Enrique");
        user.setUserNombre("mezcly08");
        user.setUserPassword("12345678");
        
        IUsuarioRepository repo = Factory.getInstance().getRepositoryUsuario();
        UsuarioService instance = new UsuarioService(repo);
        
        String result = instance.createUsuario(user);
        String expResult = "[{\"code\":\"400\",\"error\":\"BAD_REQUEST\",\"message\":\"La cedula o el nombre de usuario ya existen \"}]";
        assertEquals(expResult, result);
        
//        user.setUserName("mezcly08");
//        result = instance.createUsuario(user);
//        assertEquals("", result);
    }
    
}
