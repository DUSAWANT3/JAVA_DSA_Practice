package Ex05_Advance_Stat_Pattern;
//            *  *  *  *  *
//          *  *  *  *  *
//       *  *  *  *  *
//    *  *  *  *  *
// *  *  *  *  *
public class Ex02_Solid_Rhombus_Pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println();//move to new line
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&7");
        //hollow Rhombus_Pattern
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();//move to new line
        }
    }
}
