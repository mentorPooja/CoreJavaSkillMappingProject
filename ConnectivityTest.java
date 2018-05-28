package com.niit.JUnitTestCases;
import com.niit.utility.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class ConnectivityTest {
	
	Connectivity connect;
    @Before
    public void setUp() throws Exception {
    connect=new Connectivity();
    }

    @Test
    public void test() {
            assertEquals("Connection Failed","Connection Established",connect.getConection());    
    }
}
