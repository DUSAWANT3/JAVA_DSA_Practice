package Ex99_Practice;

public class Ex05_Patterns {
    public static void main(String[] args) {
        int n=4;
        for(int i =1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j =1; j<=n; j++){
               if(i==1 || j==1 || i==n || j==n){
                   System.out.print(" * ");
               }else {
                   System.out.print("   ");
               }
            }
            System.out.println();
        }

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        //Ex1_Butterfly_Pattern

        for(int i =1; i <=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            int spaces =2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i =n; i >=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            int spaces =2*(n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        //number pyramid
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@22");
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
