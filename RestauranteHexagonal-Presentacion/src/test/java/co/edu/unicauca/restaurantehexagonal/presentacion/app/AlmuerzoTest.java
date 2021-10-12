/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.restaurantehexagonal.presentacion.app;

import co.edu.unicauca.restaurantehexagonal.access.Factory;
import co.edu.unicauca.restaurantehexagonal.dominio.entities.Almuerzo;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IAlmuerzoRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.services.AlmuerzoService;
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
public class AlmuerzoTest {
    
    public AlmuerzoTest() {
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
     * Test of mostrar method, of class AdminAlmuerzo.
     */
    @Test
    public void testCreateAlmuerzo() {
//        System.out.println("createAlmuerzo");
//        Almuerzo parAlmuerzo = null;
//        AlmuerzoService instance = new AlmuerzoService();
//        String expResult = "";
//        String result = instance.createAlmuerzo(parAlmuerzo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        System.out.println("CreateAlmuerzo");
        Almuerzo parAlmuerzo = new Almuerzo();
        parAlmuerzo.setIdAlmuerzo("122");
        parAlmuerzo.setRestId("1");
        parAlmuerzo.setCostoAlm("10000");

        IAlmuerzoRepository repo = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService instance = new AlmuerzoService(repo);
        String expResult = "122";
        String result = instance.createAlmuerzo(parAlmuerzo);
        assertEquals(expResult, result);

        // Validar un dato erroneo
        parAlmuerzo.setIdAlmuerzo("");
        result = instance.createAlmuerzo(parAlmuerzo);
        assertEquals("", result);
    }
    
    /**
     * Test of updateAlmuerzo method, of class AlmuerzoService.
     */
    @Test
    public void testUpdateAlmuerzo() {
        
        System.out.println("updateAlmuerzo");
        Almuerzo parAlmuerzo = new Almuerzo();
        parAlmuerzo.setIdAlmuerzo("1");
        parAlmuerzo.setCostoAlm("18"); //utilizamos para enviar el id del componente nuevo
        parAlmuerzo.setRestId("4"); // utilizamos para enviar el id del componente viejo
        
        
        
        IAlmuerzoRepository repo = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService instance = new AlmuerzoService(repo);
        String expResult = "1";
        String result = instance.updateAlmuerzo(parAlmuerzo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateCosto method, of class AlmuerzoService.
     */
        @Test
        public void testUpdateCosto() {
            System.out.println("updateCosto");
            Almuerzo parAlmuerzo = new Almuerzo();
            parAlmuerzo.setIdAlmuerzo("122");
            parAlmuerzo.setCostoAlm("50000"); 
            parAlmuerzo.setRestId("1"); //
            
            IAlmuerzoRepository repo = Factory.getInstance().getRepositoryAlmuerzo();
            AlmuerzoService instance = new AlmuerzoService(repo);
            String expResult = "122";
            String result = instance.updateCosto(parAlmuerzo);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
           // fail("The test case is a prototype.");
        }

    /**
     * Test of deleteCompAlmuerzo method, of class AlmuerzoService.
     */
    @Test
    public void testDeleteCompAlmuerzo() {
        System.out.println("deleteCompAlmuerzo");
        Almuerzo parAlmuerzo = new Almuerzo();
        parAlmuerzo.setIdAlmuerzo("1");
        parAlmuerzo.setRestId("1"); // id del componente

        IAlmuerzoRepository repo = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService instance = new AlmuerzoService(repo);
        String expResult = "1";
        String result = instance.deleteCompAlmuerzo(parAlmuerzo);
        assertEquals(expResult, result);
    }

    /**
     * Test of contarAlmu method, of class AlmuerzoService.
     */
    @Test
    public void testContarAlmu() {
        System.out.println("contarAlmu");
        Almuerzo parAlmuerzo = new Almuerzo();
        parAlmuerzo.setIdAlmuerzo("133");
        parAlmuerzo.setRestId("1"); // id del componente

        IAlmuerzoRepository repo = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService instance = new AlmuerzoService(repo);
        String expResult = "0";
        String result = instance.contarAlmu(parAlmuerzo);
        
        assertEquals(expResult, result);
        

    }

    /**
     * Test of asociarComp method, of class AlmuerzoService.
     */
    @Test
    public void testAsociarComp() {
        System.out.println("asociarComp");
        String almuid = "122"; // id almuerzo
        String compid = "3"; // id componente asociar
        IAlmuerzoRepository repo = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService instance = new AlmuerzoService(repo);
        String expResult = "122";
        String result = instance.asociarComp(almuid, compid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        // Dato erroneo
    }

    
}
