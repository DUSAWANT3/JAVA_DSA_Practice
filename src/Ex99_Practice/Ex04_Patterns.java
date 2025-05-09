package Ex99_Practice;

public class Ex04_Patterns {
    public static void main(String[] args) {
        //4 * 5 rectangle pattern

        int n =4;
        int m =5;
        for(int i =1; i <=n; i++ ){
            for(int j=1; j<=m; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

    //Hollow Rectangle
        for(int i =1; i <=n; i++ ) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print(" * ");
                } else
                    System.out.print("   ");
            }
            System.out.println();
        }

            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

      //Right angle triangle
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();;
            }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
     //Inverted Right Triangle
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        }
    }

