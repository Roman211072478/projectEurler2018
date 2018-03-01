

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import project.euler.exercises.Exercise1;

public class TestExer1 {

    private Exercise1 object;

    public TestExer1() {
    }

    @Before
    public void setUp() throws Exception {
        object =  new Exercise1();
    }


    @Test
    public void TestThis() {

        Assert.assertEquals(object.checkMultiples(5), true);
        Assert.assertEquals(object.checkMultiples(3), true);
        Assert.assertEquals(object.checkMultiples(12), true);

    }
}

