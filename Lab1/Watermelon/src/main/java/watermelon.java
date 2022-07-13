import java.util.*;
public class watermelon {
    public static boolean is_valid(int weight){
        if(weight >=1 && weight <=100){
            if (weight % 2 == 0 && weight !=2)
            return true;
            else return false;
        }
        else return false;
    }
        public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int weight = sc.nextInt();
    if (is_valid(weight))
            System.out.print("YES");
    else
            System.out.println("NO");
}
}


