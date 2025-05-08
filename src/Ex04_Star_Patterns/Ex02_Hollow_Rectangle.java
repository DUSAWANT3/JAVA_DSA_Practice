package Ex04_Star_Patterns;

public class Ex02_Hollow_Rectangle {
    public static void main(String[] args) {
        //* * * * *
        //*       *
        //*       *
        //* * * * *
        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++) { // Outer loop - rows
            for (int j = 1; j <= m; j++) { // Inner loop - columns
                // Print '*' on the border cells
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Space for hollow part
                }
            }
            System.out.println(); // Move to next row
        }
    }
}

