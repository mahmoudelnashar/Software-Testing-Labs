import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ATMTest {
ATM atm;
withdraw w;
deposit d;
String check;

    @BeforeEach
    public void init() {
        atm = new ATM();
        w = new withdraw();
        d = new deposit(); }

    public class test_money{
        float put_money(float m){
            if (m>0)
                return m;
            else
                return 0;
        }
    }

    @Test
    public void atmstub(){
        test_money t = new test_money();
        atm.transaction(2,t.put_money(133));
        assertEquals(atm.balance,133);
    }
    @Test
    public void withdrawstub(){
        test_money t = new test_money();
        float x =w.withdraw_money(100,t.put_money(133));
        assertEquals(x,33);
    }
    @Test
    public void depositstub(){
        test_money t = new test_money();
        float x =d.deposit_money(100,t.put_money(133));
        assertEquals(x,233);
    }
    @AfterEach
    public void clean(){
        atm=null ;
    }
}