import org.junit.Test;
import static org.junit.Assert.*;

public class watermelontest {
    @Test
    public void is_valid() {
        int[] testcases = {-1, 0, 1, 2, 8, 55, 100, 105};
        boolean valid = true;
        for (int i = 0; i <= 7; i++) {
            watermelon melon = new watermelon();
            if (melon.is_valid(testcases[i]) == true && (testcases[i] < 1 || testcases[i] > 100))
                valid = false;
            break;
        }
        assertTrue(valid);
    }
}

