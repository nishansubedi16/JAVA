import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        scan.nextLine(); 
        System.out.println("Enter your email:");
        String email = scan.nextLine();
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("Email is: " + email);
    }
}