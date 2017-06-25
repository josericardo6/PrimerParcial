/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joser
 */
public class ListaChileTest {
    
    public ListaChileTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCabeza method, of class ListaChile.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        ListaChile instance = new ListaChile();
        Nodo expResult = null;
        Nodo result = instance.getCabeza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCabeza method, of class ListaChile.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        Nodo cabeza = null;
        ListaChile instance = new ListaChile();
        instance.setCabeza(cabeza);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Size method, of class ListaChile.
     */
    @Test
    public void testSize() {
        System.out.println("Size");
        ListaChile instance = new ListaChile();
        int expResult = 0;
        int result = instance.Size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaChile.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaChile instance = new ListaChile();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of ordernaEdad method, of class ListaChile.
     */
    @Test
    public void testOrdernaEdad() {
        System.out.println("ordernaEdad");
        ListaChile instance = new ListaChile();
        boolean expResult = false;
        boolean result = instance.ordernaEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class ListaChile.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        String nombre = "";
        ListaChile instance = new ListaChile();
        boolean expResult = false;
        boolean result = instance.remove(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ListaChile.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Jugador player = null;
        ListaChile instance = new ListaChile();
        boolean expResult = false;
        boolean result = instance.add(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of printLineUp method, of class ListaChile.
     */
    @Test
    public void testPrintLineUp() {
        System.out.println("printLineUp");
        String lineUp = "";
        ListaChile instance = new ListaChile();
        String expResult = "";
        String result = instance.printLineUp(lineUp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
