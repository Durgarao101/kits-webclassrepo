public class EvenOddCheck {
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
