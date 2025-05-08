package Ex04_Star_Patterns;

public class Ex04_Inverted_Right_Angle_Triangle {
//*  *  *  *
// *  *  *
// *  *
// *
    public static void main(String[] args) {
        int n = 4;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
