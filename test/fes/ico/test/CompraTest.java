/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.ico.test;

import fes.ico.clases.Comprar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lester
 */
public class CompraTest {
    
    public CompraTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testCalcular() {// Prueba de el metodo Calcular de la clase Comprar
        
         System.out.println("Comprobacion de el metodo Calcular de la clase Comprar");
         
         int numCamisa1=3,numCamisa2=2,numCamisa3=4;
         int totalCamisas =numCamisa1+numCamisa2+numCamisa3;
         
         float resultadoEsperado= 2088.4f;
         
         Comprar compraTest=new Comprar();
         
         float resultadoObtenido= compraTest.calculos(totalCamisas, numCamisa1, numCamisa2, numCamisa3);
         
         assertEquals(resultadoEsperado, resultadoObtenido,0.0f);
         
         System.out.println(resultadoEsperado+" "+resultadoObtenido);
    
    
    }
}
