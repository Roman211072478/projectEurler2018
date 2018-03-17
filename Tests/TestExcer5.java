import org.junit.Assert;
import org.junit.Test;
import project.euler.exercises.Exercise5;

public class TestExcer5 {

    private Exercise5 object = new Exercise5();

    @Test
    public void testMultipliersUnder10() throws Exception {
        Assert.assertEquals(object.getSmallestMultiplier(10),2520);
    }
    @Test
    public void testMultipliersUnder20() throws Exception {
        Assert.assertEquals(object.getSmallestMultiplier(20),232792560);
    }
    @Test
    public void testMultipliersUnder5() throws Exception {
        Assert.assertEquals(object.getSmallestMultiplier(5),60);
    }
}
