package Ex02_Arrays;

import java.util.stream.IntStream;

public class Ex16_Concatenate_Two_Arrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};

        int al = a.length;
        int bl = b.length;
        int cl = al + bl;

        int[] c = new int[cl];

        for(int i = 0; i < al; i++){
            c[i] = a[i];
        }
        for(int i = 0; i < bl; i++){
            c[al + i] = b[i];
        }
        for(int i = 0; i < cl; i++){
            System.out.print(c[i] + ", ");
        }
     //1, 2, 3, 4, 5, 6, 7, 8, 9, 10,

 //Using java8
        int[] d = IntStream.concat(IntStream.of(a), IntStream.of(b)).toArray();
        for (int i : d) {
            System.out.print(i + ", ");
        }
    }
}
