package Ex04_Star_Patterns;

public class Ex05_left_right_angle_triangle {
    public static void main(String[] args) {
        //        *
        //      * *
        //    * * *
        //  * * * *
        //* * * * *

        int n =5;
        for(int i=1; i<=n; i++ ){
            // Print spaces (n - i) times
            for(int j=1; j<=n-i; j++){//inner loop for print space
                System.out.print("   ");
            }
            for(int j =1; j<=i; j++){//inner loop for print *
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
