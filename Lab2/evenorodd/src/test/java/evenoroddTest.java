import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class evenoroddTest {
    evenorodd t;

    @Nested
    class EvenTest{
        @BeforeEach
        public void innit(){
            t= new evenorodd();
        }

        @Test
        public void ZeroExpectedEven(){
            t.initVariable(0);
            assertEquals("Even",t.check());
        }
        @Test
        public void NegativeEightExpectedEven(){
            t.initVariable(-8);
            assertEquals("Even",t.check());
        }

        @AfterEach
        public void clear(){

            t=null;
        }
    }

    @Nested
    class OddTest {
        @BeforeEach
        public void innit() {

            t = new evenorodd();
        }

        @Test
        public void OneExpectedOdd() {
            t.initVariable(1);
            assertEquals("Odd", t.check());
        }

        @Test
        public void NegativeFiveExpectedOdd() {
            t.initVariable(-5);
            assertEquals("Odd", t.check());
        }

        @AfterEach
        public void clear() {

            t = null;
        }

    }
}