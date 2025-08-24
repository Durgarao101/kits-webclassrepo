public class EvenOddCheck
 {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

        // Extra: check if number is positive or negative
        if (num > 0) {
            System.out.println("It is Positive.");
        } else if (num < 0) {
            System.out.println("It is Negative.");
        } else {
            System.out.println("It is Zero.");
        }

        sc.close();
    }
}
 feature102
 #feature102 code changes by the Ayyappa on us usermodule on Octerber 2024
public class Sample
 {

    // main method - entry point of Java program
    public static void main(String[] args) {
        System.out.println("This is a sample Java file!");

        // Example: calling another method
        int sum = addNumbers(10, 20);
        System.out.println("Sum of 10 and 20 is: " + sum);
    }

    // A method that adds two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
end of the feature102.
  
#features101 changes by durga on Reports Module on oct 2024
// Application.java
public class Application {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        // Example usage of another method
        greet("Durga Rao");
    }

    // A sample method
    public static void greet(String name) {
        System.out.println("Welcome, " + name + "!");
    }
}
End of feature101
main
