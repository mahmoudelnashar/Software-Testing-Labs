import java.util.*;
public class YoungPhysicist {
    public static boolean is_valid(int force){
        if(force >=-100 && force <=100)
                return true;
            else return false;
    }

        public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [][]forces= new int[n][3];
        int []equilibrium_check= new int[3];
        boolean valid=true;
        for (int i=0;i<n;i++){
            for (int j=0;j<3;j++){
                forces[i][j]=sc.nextInt();
                if (!is_valid(forces[i][j]))
                    valid=false;
                equilibrium_check[j]+=forces[i][j];
            }
        }
    if((equilibrium_check[0]==0)&&(equilibrium_check[1]==0)&&(equilibrium_check[2]==0)&&(valid))
        System.out.println("YES");
    else
        System.out.println("NO");
}
}


