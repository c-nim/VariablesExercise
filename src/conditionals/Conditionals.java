package conditionals;

public class Conditionals {

    public static void main(String[] args) {
     /*
        int x = 3, y = 5;
        if (x >= 0){
            System.out.println("x is greater than 0");
            }
        else if (y < x) {
             System.out.println("y is less than x");
        }else{
             System.out.println("x is negative");
                }
        */

        /*
        int x = 7;
        if (x == 0) {
            System.out.println("x is zero");
        } else {
            System.out.println("x is not zero");
        }
        */
         int x = 15, y = 24;
         if(x % 2 == 0) {
             System.out.println("x is an even number");
         } else if ((y % 2)== 0) {
             System.out.println("y is an even number");
         } else {
             System.out.println("x and y are not even numbers");
         }

    }
}
