import org.junit.jupiter.api.Test;
import project.euler.exercises.Exer2;

public class TestExerc2 {

    @Test
    void TestMethodExerc2() {

        Exer2 object  = new Exer2();

        object.fibnacci2(4000000);
    }
}
