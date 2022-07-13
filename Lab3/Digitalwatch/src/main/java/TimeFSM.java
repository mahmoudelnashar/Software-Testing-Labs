public class TimeFSM {
    private int m;
    private int h;
    private int D;
    private int M;
    private int Y;
    public char input;
    boolean alarm;
    private String state;
    private String state1;
    private String state2;

    public TimeFSM() {
        m = 0;
        h = 0;
        D = 1;
        M = 1;
        Y = 2000;
        state = "NORMAL";
        state1 = "TIME";
        state2 = "min";
        alarm = false;
    }

    public void switch_state() {
        switch (state) {
            case "NORMAL":
                if (input == 'c') state = "UPDATE";
                if (input == 'b') state = "ALARM";
                if (input == 'a') {

                    if (state1.equals("TIME")) state1 = "DATE";
                    else
                        state1 = "TIME";
                }
                break;
            case "UPDATE":
                if (input == 'd') state = "NORMAL";
                if (input == 'b') {
                    switch (state2) {
                        case "min":
                            if (m == 59)
                                m = 0;
                            else
                                m++;
                            break;
                        case "hour":
                            if (h == 23)
                                h = 0;
                            else
                                h++;
                            break;
                        case "day":
                            if (D == 31)
                                D = 1;
                            else
                                D++;
                            break;
                        case "month":
                            if (M == 12)
                                M = 1;
                            else
                                M++;
                            break;
                        case "year":
                            if (Y == 100)
                                Y = 1;
                            else
                                Y++;
                            break;
                    }

                }
                if (input == 'a') {
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
                if (input == 'd') state = "NORMAL";
                if (input == 'a') alarm = !alarm;
                break;
        }


    }

    public String Display_Date(String s) {
        s = "date is: " + Y + "-" + M + "-" + D;
        return s;
    }

    public String Display_Time(String s) {
        s = "time is: " + h + ":" + m;
        return s;
    }

    public String Alarm_Status(String s) {
        if (alarm) s = "alarm is on";
        else
            s = ("alarm is off");
        return s;
    }
}
