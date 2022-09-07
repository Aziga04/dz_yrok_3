import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] word = {3.6, 6.0, -5.8, 75.8, 64.0, -34.8, 7.55, 56.69, 66.0, 43.67, 45.76, 89.55, 96.99,-78.9, 54.9,};
           double MUN = 0;
           int NUM  = 0;

           boolean enter = false;
           for (double address : word){
               if (address < 0) {
                   enter = true;
               }else if (address > 0 && enter){
                   System.out.println(address);
                   if (address > 0){
                       MUN = MUN + address;
                       NUM++;
                   }

               }
           }

    }
}