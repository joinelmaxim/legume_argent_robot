package com.joinel.test2.adneom.nombre.premier.addition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    
	 @Test
	    public void test_nombre_premiers_true() {
	    	int nombres_nbr_premiers = 5;
	    	App ap = new App();
	    	assertTrue(ap.test_nombre_premiers(nombres_nbr_premiers));
	    }
	
    @Test
    public void test_nombre_premiers_false() {
    	int nombres_nbr_premiers = 4;
    	App ap = new App();
    	assertFalse(ap.test_nombre_premiers(nombres_nbr_premiers));
    }
    
    @Test
    public void test_conditions_addition() {
    	int nombres_nbr_premiers = 0;
    	App ap = new App();
    	assertEquals(0, ap.somme_nombre_premiers(nombres_nbr_premiers));
    }
    
    @Test
    public void test_conditions_bonnes_addition() {
    	int nombres_nbr_premiers = 2;
    	App ap = new App();
    	assertEquals(5, ap.somme_nombre_premiers(nombres_nbr_premiers));
    }
    
    @Test
    public void test_nombres_premier_stream_0() {
    	int nombres_nbr_premiers = 0;
    	App ap = new App();
    	assertFalse( ap.test_nombre_premiers_stream(nombres_nbr_premiers));
    }
    
    @Test
    public void test_nombres_pas_premier_stream_() {
    	int nombres_nbr_premiers = 4;
    	App ap = new App();
    	assertFalse( ap.test_nombre_premiers_stream(nombres_nbr_premiers));
    }
    
    @Test
    public void test_nombres_premiers_stream() {
    	int nombres_nbr_premiers = 11;
    	App ap = new App();
    	assertTrue( ap.test_nombre_premiers_stream(nombres_nbr_premiers));
    }
   
}
