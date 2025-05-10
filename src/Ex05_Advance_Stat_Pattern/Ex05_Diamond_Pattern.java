package Ex05_Advance_Stat_Pattern;
//          *
//       *  *  *
//    *  *  *  *  *
// *  *  *  *  *  *  *
// *  *  *  *  *  *  *
//    *  *  *  *  *
//       *  *  *
//          *
public class Ex05_Diamond_Pattern {
    public static void main(String[] args) {
        int n =4;
        //upper half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){  //spaces
                System.out.print("   ");
            }
            for(int j=1; j<=2*i-1; j++){ //stat = 2 * i-1
                System.out.print(" * ");
            }
            System.out.println();
        }
        //Lower half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){  //spaces
                System.out.print("   ");
            }
            for(int j=1; j<=2*i-1; j++){ //stat = 2 * i-1
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
