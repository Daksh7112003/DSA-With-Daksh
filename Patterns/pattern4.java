import java.util.*;

public class pattern4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println();

        int star = n ; 
        int space= 0 ;
         


        for(int i = 0  ; i<n ; i++ ){


            for(int j = 0 ; j<space;j++){
                System.out.print("\t");

            }

            for(int j = 0 ; j<star;j++){
                System.out.print("*\t");
            }


            star--;
            space++;
            System.out.println();

        }




        
    }
}