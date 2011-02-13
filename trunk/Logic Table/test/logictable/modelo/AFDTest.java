
package logictable.modelo;

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
public class AFDTest {

    public AFDTest() {
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
     * Test of verificaTexto method, of class AFD.
     */
    @Test
    public void testVerificaTexto() {
        System.out.println("verificaTexto");
        String texto = "p+q";
        AnalizadorLexico lex = new AnalizadorLexico();
        AFD instance = new AFD();
        instance.verificaTexto(texto, lex);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of validaToken method, of class AFD.
     */
    @Test
    public void testValidaToken() {
        System.out.println("validaToken");
        String str = "<=>";
        int expResult = 7;
        int result = AFD.validaToken(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}