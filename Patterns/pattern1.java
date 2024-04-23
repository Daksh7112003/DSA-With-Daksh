import java.util.*;

public class pattern1 {
    public static void main(String[] args) {


        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        for (int i = 0 ; i<n; i++){
            for(int j=0;j<=i;j++){
                System.out.print("*\t");

            }
            System.out.println();
        }
        
    }

    
}
