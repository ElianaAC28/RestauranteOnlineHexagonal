/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.restaurantehexagonal.presentacion.app;

import co.edu.unicauca.restaurantehexagonal.access.Factory;
import co.edu.unicauca.restaurantehexagonal.dominio.entities.Restaurante;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IRestauranteRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.services.RestauranteService;
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
public class RestauranteTest {
    
    public RestauranteTest() {
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

        @Test
    public void testBuscarRestauarante() {
        System.out.println("buscarRestaurant");
        String restID = "1";
        IRestauranteRepository repo = Factory.getInstance().getRepositoryRestaurante();
        RestauranteService instance = new RestauranteService(repo);
        
        String expResult = "1";
        String result = instance.findRestaurante(restID).getNit();
        assertEquals(expResult, result);

        // Datos que no existen
        result = instance.findRestaurante("3").getNit();
        assertEquals("3", result);
    }
        @Test
    public void testBuscarRestauaranteUser() {
        System.out.println("buscarRestaurantUser");
        String restUser = "mezcly08";
        IRestauranteRepository repo = Factory.getInstance().getRepositoryRestaurante();
        RestauranteService instance = new RestauranteService(repo);
        
        String expResult = "1";
        String result = instance.findRestauranteUser(restUser).getNit();
        assertEquals(expResult, result);

        // Datos que no existen
        result = instance.findRestaurante("lm").getNit();
        assertEquals(null, result);
    }
    
}
