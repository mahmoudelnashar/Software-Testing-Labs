import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class coffee_machineTest {
    coffee_machine coffee_machine1;
    stock stock1;
    coins coins1;
    String check;

    @BeforeEach
    public void init() {
        coffee_machine1 = new coffee_machine(3);
        stock1 = new stock();
        coins1 = new coins();
        String check;
    }
    public class put_coin{
        int insert_coin(int c){
            if(c>0)
                return c;
            else
                return 0;
        }
    }
    @Test
    public void coffee_stub(){
        put_coin p = new put_coin();
        coffee_machine1.giving_coffee(p.insert_coin(3));
        assertEquals(coffee_machine1.stock1.stock,3);
    }

    public class buythree{
        String check(int x){
            if (x>=3)
                return "you can buy three drinks";
                else
                    return "not enough drinks available";
        }
    }

    @Test
    public void stock_driver(){
        buythree b = new buythree();
        check=b.check(stock1.get_stock());
        assertEquals(check,"you can buy three drinks");
        stock1.buy();
        check=b.check(stock1.get_stock());
        assertEquals(check,"not enough drinks available");

    }

    @AfterEach
    public void clean(){
        coffee_machine1=null;
    }
}