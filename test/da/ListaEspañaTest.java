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
public class ListaEspañaTest {
    
    public ListaEspañaTest() {
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
     * Test of getCabeza method, of class ListaEspaña.
     */
    @Test
    public void testGetCabeza() {
        System.out.println("getCabeza");
        ListaEspaña instance = new ListaEspaña();
        Nodo expResult = null;
        Nodo result = instance.getCabeza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCabeza method, of class ListaEspaña.
     */
    @Test
    public void testSetCabeza() {
        System.out.println("setCabeza");
        Nodo cabeza = null;
        ListaEspaña instance = new ListaEspaña();
        instance.setCabeza(cabeza);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of Size method, of class ListaEspaña.
     */
    @Test
    public void testSize() {
        System.out.println("Size");
        ListaEspaña instance = new ListaEspaña();
        int expResult = 0;
        int result = instance.Size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ListaEspaña.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaEspaña instance = new ListaEspaña();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class ListaEspaña.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Jugador player = null;
        ListaEspaña instance = new ListaEspaña();
        boolean expResult = false;
        boolean result = instance.add(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of printLineUp method, of class ListaEspaña.
     */
    @Test
    public void testPrintLineUp() {
        System.out.println("printLineUp");
        String lineUp = "";
        ListaEspaña instance = new ListaEspaña();
        String expResult = "";
        String result = instance.printLineUp(lineUp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimeConMarca method, of class ListaEspaña.
     */
    @Test
    public void testImprimeConMarca() {
        System.out.println("imprimeConMarca");
        ListaEspaña instance = new ListaEspaña();
        String expResult = "";
        String result = instance.imprimeConMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
