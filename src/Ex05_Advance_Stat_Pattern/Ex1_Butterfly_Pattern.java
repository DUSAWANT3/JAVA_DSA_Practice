package Ex05_Advance_Stat_Pattern;
// *                    *
// *  *              *  *
// *  *  *        *  *  *
// *  *  *  *  *  *  *  *
// *  *  *  *  *  *  *  *
// *  *  *        *  *  *
// *  *              *  *
// *                    *
public class Ex1_Butterfly_Pattern {
    public static void main(String[] args) {
        int n =4;
        //First half -upper
        for(int i=1; i<=n; i++){
            //1st part
            for(int j=1; j<=i;j++){
                System.out.print(" * ");
            }
            //space
            int spaces =2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("   ");
            }
            //2nd part
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println(); // Move to next line
        }
        //lower part half
        for(int i=n; i>=1; i--){ //same of above code only this loop reverse
            //1st part
            for(int j=1; j<=i;j++){
                System.out.print(" * ");
            }
            //space
            int spaces =2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("   ");
            }
            //2nd part
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println(); // Move to next line
        }
    }
}
