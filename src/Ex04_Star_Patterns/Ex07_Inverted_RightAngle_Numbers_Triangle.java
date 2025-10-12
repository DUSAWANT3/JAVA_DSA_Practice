package Ex04_Star_Patterns;

import java.util.Arrays;
import java.util.List;

public class Ex07_Inverted_RightAngle_Numbers_Triangle {

    public static void main(String[] args) {

        List<String> days = Arrays.asList("Sunday", "Monday", "Tuesday", "Wedenday", "Thursday", "Friday", "Saturday", "Nilesh");

       for(String day : days){
       if(day.startsWith("S") || day.startsWith("T"))

           if(day.startsWith("S"))
          System.out.println(day);
       }


      /*  for(String day : days) {

            if(day.length()>3){
                String modidiyday = day.charAt(0) + day.substring(3);

                System.out.println(modidiyday);

            } else {
                System.out.println(day.charAt(0));
            }
 */
     //   }
    }
}
