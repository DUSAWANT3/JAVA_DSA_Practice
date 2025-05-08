package Ex04_Star_Patterns;

public class Ex03_Right_Angle_Triangle {
    // *
    // * *
    // * * *
    // * * * *
    public static void main(String[] args) {
       int n = 4;  //row no = total Coloum

        for(int i=1; i<=n; i++){
            for(int j=1; j <=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
