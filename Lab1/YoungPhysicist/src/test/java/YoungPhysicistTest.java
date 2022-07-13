import org.junit.Test;
import static org.junit.Assert.*;


public class YoungPhysicistTest {
    @Test
    public void is_valid() {
        int[] testcases = {-200,-100,-5, 0, 1, 2, 8, 55, 100, 105};
        boolean valid = true;
        for (int i = 0; i <= 7; i++) {
            YoungPhysicist physicist = new YoungPhysicist();
            if (physicist.is_valid(testcases[i]) == true && (testcases)[i] < 1 || testcases[i] > 100)
                valid = false;
            break;
        }
        assertTrue(valid);
    }
}
