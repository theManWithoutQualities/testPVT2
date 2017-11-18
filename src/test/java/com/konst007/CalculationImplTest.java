package com.konst007;

import junit.framework.TestCase;

/**
 * Created by x on 18.11.17.
 */
public class CalculationImplTest extends TestCase {

    CalculationImpl calculation = new CalculationImpl();

    public void testCalculateSteps() throws Exception {

        assertEquals(4, calculation.calculateSteps(2, 0, 7));
        assertEquals(4, calculation.calculateSteps(2, 2, 1));
        assertEquals(-1, calculation.calculateSteps(2, 1, 1));

    }

}