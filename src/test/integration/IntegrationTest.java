package test.integration;

import java.util.Random;

public class IntegrationTest extends junit.framework.TestCase {

    public void testNothing() {
    }
    
    public void testWillAlwaysFail() {
	Random rnd = new Random();
	if (rnd.nextInt(100) > 50) {
       		fail("An error message");
	}
    }
    
}
