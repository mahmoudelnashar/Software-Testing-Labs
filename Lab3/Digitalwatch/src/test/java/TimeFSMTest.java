import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeFSMTest {
    TimeFSM f;
    String s;

    @BeforeEach
    public void init(){
        f=new TimeFSM();
    }

    @Test
    public void display_date1(){
        s=("date is: 2000-1-1");
        String s2="date";
        assertEquals(s,f.Display_Date(s2));
    }

    @Test
    public void display_time1(){
        s=("time is: 0:0");
        String s2="time";
        assertEquals(s,f.Display_Time(s2));
    }

    @Test
    public void alarm_time1(){
        s=("alarm is off");
        String s2="alarm";
        assertEquals(s,f.Alarm_Status(s2));
    }

    @Test
    public void display_date2(){
        char []edge_test={'a' ,'a', 'b', 'a', 'd', 'c', 'd', 'c', 'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a'};
        for (char c : edge_test) {
            f.input = c;
            f.switch_state();
        }
        s=("date is: 2001-2-2");
        String s2="date";
        assertEquals(s,f.Display_Date(s2));
    }

    @Test
    public void display_time2(){
        char []edge_test={'a' ,'a', 'b', 'a', 'd', 'c', 'd', 'c', 'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a'};
        for (char c : edge_test) {
            f.input = c;
            f.switch_state();
        }
        s=("time is: 1:1");
        String s2="time";
        assertEquals(s,f.Display_Time(s2));
    }

    @Test
    public void alarm_time2(){
        char []edge_test={'a' ,'a', 'b', 'a', 'd', 'c', 'd', 'c', 'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a'};
        for (char c : edge_test) {
            f.input = c;
            f.switch_state();
        }
        s=("alarm is on");
        String s2="alarm";
        assertEquals(s,f.Alarm_Status(s2));
    }


    @AfterEach
    public void clean(){
        f=null;
    }


}