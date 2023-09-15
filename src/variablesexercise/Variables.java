package variablesexercise;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        /*
        String firstName = "Clara";
        String lastName = "Nimmo";
        String name = firstName + " " + lastName;
        System.out.println(name);
         */
        /*
        int num1 = 4;
        int num2 = 2;
        System.out.println(num1 + num2);
        int result = num1 / num2;
        System.out.println(result);
        int num3 = 8;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name?");
        String firstName = scanner.nextLine();
        System.out.println("please enter your last name?");
        String secondName = scanner.next();
        System.out.println("hi " + firstName + " " + secondName);
        System.out.println("what is your age?");
        int age = scanner.nextInt();
        System.out.println("what is your height in cm?");
        double height = scanner.nextInt();
        System.out.println(age + height);
    }
}
