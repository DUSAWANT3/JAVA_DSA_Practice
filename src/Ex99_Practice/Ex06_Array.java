package Ex99_Practice;

public class Ex06_Array {
    public static void main(String[] args) {

        int[] arr1 = {34,56,75,3,2,87,9,76,42,98};

        int max = arr1[0];
        int min = arr1[0];
        for(int i=0; i<arr1.length; i++){
            if(max < arr1[i]){
                max = arr1[i];
            } else if (min> arr1[i]) {
              min  = arr1[i];
            }
        }
        System.out.println(max + " max no");
        System.out.println(min+" min no");
    }
}
