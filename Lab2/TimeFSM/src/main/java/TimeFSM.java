public class TimeFSM {
    private int m;
    private int h;
    private int D;
    private int M;
    private int Y;
    private char input;
    boolean alarm;
    private String state;
    private String state1;
    private String state2;

public TimeFSM(){
    m=0;
    h=0;
    D=1;
    M=1;
    Y=2000;
    state="NORMAL";
    state1="TIME";
    state2="min";
    alarm=false;
}

    public void switch_state(){
        switch (state){
            case "NORMAL":
                if (input == 'c') state="UPDATE";
                if (input == 'b') state="ALARM";
                if (input == 'a') {

                    if (state1.equals("TIME")) state1 = "DATE";
                    else
                        state1 = "TIME";
                }
                break;
            case "UPDATE":
                if (input == 'd') state="NORMAL";
                if (input == 'b') {
                    switch (state2){
                        case"min":
                            if (m==59)
                                m=0;
                            else
                                m++;
                            break;
                        case"hour":
                            if (h==23)
                                h=0;
                            else
                                h++;
                            break;
                        case"day":
                            if (D==31)
                                D=1;
                            else
                                D++;
                            break;
                        case"month":
                            if (M==12)
                                M=1;
                            else
                                M++;
                            break;
                        case"year":
                            if (Y==100)
                                Y=1;
                            else
                                Y++;
                            break;
                    }

                }
                if (input=='a') {
                    switch (state2) {
                        case "min" -> state2 = "hour";
                        case "hour" -> state2 = "day";
                        case "day" -> state2 = "month";
                        case "month" -> state2 = "year";
                        case "year" -> {
                            state2 = "min";
                            state = "NORMAL";
                        }
                    }
                }
                break;
            case "ALARM":
                if (input == 'd') state="NORMAL";
                if (input == 'a') alarm=!alarm;
                break;
        }


    }

    public void Display_Date(){
        System.out.println("date is: "+Y+"-"+M+"-"+D);
}
    public void Display_Time(){
        System.out.println("time is: "+h+":"+m);
    }
    public void Alarm_Status(){
        if (alarm) System.out.println("alarm is on");
        else
            System.out.println("alarm is off");
    }

    public static void main(String[] args){
    System.out.println("edge coverage test suite: (a a b a d c d c b a b a b a b a b a)");
    System.out.println("initial");
    TimeFSM watch_edge= new TimeFSM();
    watch_edge.Display_Date();
    watch_edge.Display_Time();
    watch_edge.Alarm_Status();
    char []edge_test={'a' ,'a', 'b', 'a', 'd', 'c', 'd', 'c', 'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a', 'b', 'a'};
        for (char c : edge_test) {
            watch_edge.input = c;
            watch_edge.switch_state();
        }
    System.out.println("final");
        watch_edge.Display_Date();
        watch_edge.Display_Time();
        watch_edge.Alarm_Status();
    }
}
