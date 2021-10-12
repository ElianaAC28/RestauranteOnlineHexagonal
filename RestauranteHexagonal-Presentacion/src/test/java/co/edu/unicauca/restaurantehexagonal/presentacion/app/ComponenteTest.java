/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.restaurantehexagonal.presentacion.app;

import co.edu.unicauca.restaurantehexagonal.access.Factory;
import co.edu.unicauca.restaurantehexagonal.dominio.entities.Componente;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IComponenteRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.services.ComponenteService;
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
public class ComponenteTest {
    
    public ComponenteTest() {
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
     * Test of createComponente method, of class ComponenteService.
     */
    @Test
    public void testCreateComponente() {
        System.out.println("crearComponente");
        Componente comp = new Componente();

        comp.setIdComponente(1112);
        comp.setIdRestaurante(1);
        comp.setNombreComponente("Arveja");
        comp.setTipoComponente("Entrada");
        comp.setIdtipoComponente(1);
        
        
        IComponenteRepository repo = Factory.getInstance().getRepositoryComponente();
        ComponenteService instance = new ComponenteService(repo);
        String expResult = "Arveja";
        String result = instance.createComponente(comp);
        assertEquals(expResult, result);

        // Validar un dato erroneo
        comp.setNombreComponente("");
        result = instance.createComponente(comp);
        assertTrue(result.contains("BAD_REQUEST"));
    }
    
    /**
     * Test of contarComponente method, of class ComponenteService.
     */
    @Test
    public void testContarComponente() {
        System.out.println("contarComponente");
        int almuid = 1;
        int idtipocom = 1; //tipo de componente en este caso el 1 es entrada

        IComponenteRepository repo = Factory.getInstance().getRepositoryComponente();
        ComponenteService instance = new ComponenteService(repo);

        String expResult = "2";
        String result = instance.contarComponente(almuid, idtipocom);
        assertEquals(expResult, result);

        // Dato erroneo
        result = instance.contarComponente(55, 22);
        assertEquals("0", result);
    }
    
    /**
     * Test of contarComponentex method, of class ComponenteService.
     */
    @Test
    public void testContarComponentex() {
        System.out.println("contarComponentex");
        int almuid = 2;
        String nomComp = "Croqueta";

        IComponenteRepository repo = Factory.getInstance().getRepositoryComponente();
        ComponenteService instance = new ComponenteService(repo);

        String expResult = "2";
        String result = instance.contarComponentex(almuid, nomComp);
        assertEquals(expResult, result);

        // Dato erroneo
        result = instance.contarComponentex(7, "Guayaba");
        assertEquals("1", result);
    }

    /**
     * Test of buscarComponente method, of class ComponenteService.
     */
    @Test
    public void testBuscarComponente() {
        System.out.println("buscarComponente");
        int almuid = 1;
        int nomComp = 2;

        IComponenteRepository repo = Factory.getInstance().getRepositoryComponente();
        ComponenteService instance = new ComponenteService(repo);

        String expResult = "1";
        String result = instance.buscarComponente(almuid, nomComp);
        assertEquals(expResult, result);

        // Dato erroneo
        //result = instance.buscarComponente(1,1);
        //assertEquals("0", result);
    }
}
