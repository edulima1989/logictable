/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logictable.modelo;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EDÚ
 */
public class AnalizadorSintacticoTest {

    public AnalizadorSintacticoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of comprobarSintaxis method, of class AnalizadorSintactico.
     */
    @Test
    public void testComprobarSintaxis() {
        System.out.println("comprobarSintaxis");
        List<Lexico> lex = new ArrayList<Lexico>();
        boolean expResult = false;
        boolean result = AnalizadorSintactico.comprobarSintaxis(lex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}