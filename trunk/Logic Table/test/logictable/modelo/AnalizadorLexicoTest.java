/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logictable.modelo;

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
public class AnalizadorLexicoTest {

    public AnalizadorLexicoTest() {
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
     * Test of crearTokens method, of class AnalizadorLexico.
     */
    @Test
    public void testCrearTokens() {
        System.out.println("crearTokens");
        String texto = "<=>";
        AnalizadorLexico instance = new AnalizadorLexico();
        instance.crearTokens(texto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addLexico method, of class AnalizadorLexico.
     */
    @Test
    public void testAddLexico() {
        System.out.println("addLexico");
        Lexico lexico = null;
        AnalizadorLexico instance = new AnalizadorLexico();
        instance.addLexico(lexico);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLexicos method, of class AnalizadorLexico.
     */
    @Test
    public void testGetLexicos() {
        System.out.println("getLexicos");
        AnalizadorLexico instance = new AnalizadorLexico();
        List<Lexico> expResult = null;
        List<Lexico> result = instance.getLexicos();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLexicos method, of class AnalizadorLexico.
     */
    @Test
    public void testSetLexicos() {
        System.out.println("setLexicos");
        List<Lexico> lexicos = null;
        AnalizadorLexico instance = new AnalizadorLexico();
        instance.setLexicos(lexicos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}