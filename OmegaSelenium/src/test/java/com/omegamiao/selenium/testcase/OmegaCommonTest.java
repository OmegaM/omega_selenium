/**
 *
 */
package com.omegamiao.selenium.testcase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Lei Miao
 */
public class OmegaCommonTest {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() {
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() {
    }

    @Test
    public void testTwoIntEquals() {
        Assert.assertEquals(3, 3);
    }

    @Test
    public void testTwoStringEuals() {
        Assert.assertEquals("Selenium", "Selenium");
    }

}
