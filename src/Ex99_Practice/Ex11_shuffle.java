package Ex99_Practice;

public class Ex11_shuffle {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "123";
        String result = "a1b2c3";

        //check s1 +s2 = result
        boolean isShuffle = true;
        if(s1.length()+s2.length() != result.length()){
            isShuffle = false;
        }else {
            int i=0, j=0, k=0;
            while (k < result.length()){
                char c = result.charAt(k);
                if(i<s1.length() && s1.charAt(i) == c){
                    i++;
                } else if(j<s2.length() && s2.charAt(j) == c) {
                    j++;

                }else {
                    isShuffle = false;
                    break;
                }
                k++;
            }
            //final check
            if(i != s1.length() || j != s2.length()){
                isShuffle =false;
            }
        }
        System.out.println(isShuffle);
    }
}
