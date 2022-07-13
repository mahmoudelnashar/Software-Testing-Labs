import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maxminarrayTest {
    maxminarray a;

    @Nested
    class MaximumTest{
        @BeforeEach
        public void innit(){
            a = new maxminarray();
        }

        @Test
        public void Maximum103(){
            a.initArray(new int[]{103, 4, 51, 23, -5, 0, -2, 5});
            assertEquals(103, a.max());
        }
        @Test
        public void Maximum51(){
            a.initArray(new int[]{7, 4, 51, 23, 29, 3, 44, 5});
            assertEquals(51, a.max());
        }

        @AfterEach
        public void clear(){

            a=null;
        }
    }

    @Nested
    class MinimumTest {
        @BeforeEach
        public void innit() {

            a = new maxminarray();
        }

        @Test
        public void MinimumNegative5() {
            a.initArray(new int[]{1, 4, 51, 23, -5, 0, -2, 103});
            assertEquals(-5, a.min());
        }

        @Test
        public void MinimumNegative3() {
            a.initArray(new int[]{7, 4, 51, 23, 29, 3, 44, 5});
            assertEquals(3, a.min());
        }

        @AfterEach
        public void clear() {

            a = null;
        }

    }
}