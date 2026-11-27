import java.util.Scanner;
public class student {
public static void main (String[] args){
    Scanner sc =new Scanner (System.in);
    System.out.println("Enter a Character");
    char d=sc.next().charAt(0);
     System.out.println("Enter an Integer");
    int a=sc.nextInt();
    System.out.println("Enter a decimal number");
    float b=sc.nextFloat();
    System.out.println("Enter a double number");
        double c=sc.nextDouble();
        System.out.println("Enter True or False");
    boolean e=sc.nextBoolean();
    System.out.println("Enter a name");
String f=sc.next();
System.out.println("\n The entered values are");
System.out.println("Integer:"+a);
System.out.println("Float:"+b);
System.out.println("Double:"+c);
System.out.println("Character:"+d);
System.out.println("Boolean:"+e);
System.out.println("String:"+f);
}
}
