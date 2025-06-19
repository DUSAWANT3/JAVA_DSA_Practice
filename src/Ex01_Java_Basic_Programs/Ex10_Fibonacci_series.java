package Ex01_Java_Basic_Programs;

public class Ex10_Fibonacci_series {
    public static void main(String[] args) {
        //The Fibonacci series is a series of elements where the previous two elements are added to generate the next term.
        // It starts with 0 and 1, for example, 0, 1, 1, 2, 3, 5, 8 ..and so on.
        //F(n) = F(n-1) + F(n-2)
        int n =10;
        int firstNum=0, secondNum=1;
        int nextNum;

       for(int i=0; i<=n; i++){
           System.out.print(firstNum + ", ");
           nextNum = firstNum + secondNum;

           firstNum = secondNum;
           secondNum = nextNum;
       }
    }
}
//