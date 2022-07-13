public class evenorodd {

    private int variable;

    public String check(){
        if (variable%2==0)
            return "Even";
        else
            return"Odd";
    }

    public void initVariable(int var){

        variable=var;
    }
}
