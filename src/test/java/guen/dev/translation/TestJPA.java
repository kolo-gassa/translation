package guen.dev.translation;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJPA {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void test1() {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                    new String[] { "applicationContext.xml" } );
            assertTrue( true );
        } catch ( Exception e ) {
            assertTrue( e.getMessage(), false );
        }
    }

}
