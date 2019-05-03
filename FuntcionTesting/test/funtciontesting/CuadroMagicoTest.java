/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funtciontesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jgome
 */
public class CuadroMagicoTest {
    private static CuadroMagico DiagonalCero;
    private static CuadroMagico FilasCero;
    private static CuadroMagico ColumnasCero;
    public CuadroMagicoTest() {
    }
    
    @Before
    public void setUp() {
        int[][] matrizD={{1, 2, 3},
                         {1, 0, 9},
                         {2, -1, -1}};
        DiagonalCero=new CuadroMagico(3, matrizD);
        int[][] matrizC={{1, 1, 1},
                         {5, 9, 0},
                         {-6, 0, 3}};
        ColumnasCero=new CuadroMagico(3, matrizC);
        int[][] matricF={{5, -2, -3},
                         {10, -15, 5},
                         {2, 7, -9}};
        FilasCero=new CuadroMagico(3, matricF);
    }
    
    @After
    public void tearDown() {
        DiagonalCero=null;
        FilasCero=null;
        ColumnasCero=null;
    }
    @Test
    //Test of the SumaFila with the variable FilasCero
    public void testSumanFila() {
        System.out.println("sumanFila");
        int n = 0;
        CuadroMagico instance = null;
        int expResult = 0;
        int result = FilasCero.sumanFila(0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of the SumaFila with the variable ColumnasCero
     */
    @Test
    public void testSumanFila2() {
        System.out.println("sumanFila");
        CuadroMagico instance = null;
        int expResult = 3;
        int result = ColumnasCero.sumanFila(0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
      * Test of the SumaFila with the variable DiagonalCero
    */
    @Test
    public void testSumanFila3() {
        System.out.println("sumanFila");
        CuadroMagico instance = null;
        int expResult = 6;
        int result = DiagonalCero.sumanFila(0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of the SumaColumna with the variable ColumnasCero.
     */
    @Test
    public void testSumanColumna() {
        System.out.println("sumanColumna");
        int n = 0;
        CuadroMagico instance = null;
        int expResult = 0;
        int result = ColumnasCero.sumanColumna(0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of the SumaColumna with the variable FilasCero
     */
    @Test
    public void testSumanColumna2() {
        System.out.println("sumanColumna");
        CuadroMagico instance = null;
        int expResult = 17;
        int result = FilasCero.sumanColumna(0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of the SumaColumna with the variable DiagonalCero
     */
    @Test
    public void testSumanColumna3() {
        System.out.println("sumanColumna");
        CuadroMagico instance = null;
        int expResult = 4;
        int result = DiagonalCero.sumanColumna(0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of the SumaDiagonal1 with the variable DiagonalCero
     */
    @Test
    public void testSumanDiagonal1_1() {
        System.out.println("sumanDiagonal1");
        CuadroMagico instance = null;
        int expResult = 0;
        int result = DiagonalCero.sumanDiagonal1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of the SumaDiagonal1 with the variable ColumnasCero
     */
    @Test
    public void testSumanDiagonal1_2() {
        System.out.println("sumanDiagonal1");
        CuadroMagico instance = null;
        int expResult = 13;
        int result = ColumnasCero.sumanDiagonal1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of the SumaDiagonal1 with the variable FilasCero
     */
    @Test
    public void testSumanDiagonal1_3() {
        System.out.println("sumanDiagonal1");
        CuadroMagico instance = null;
        int expResult = -19;
        int result = FilasCero.sumanDiagonal1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of SumaDiagonal2 method with the variable DiagonalCero
     */
    @Test
    public void testSumanDiagonal2() {
        System.out.println("sumanDiagonal2");
        CuadroMagico instance = null;
        int expResult = 5;
        int result = DiagonalCero.sumanDiagonal2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    
}
