import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.println("Welcome to CGPA Calculator");
    System.out.println("Enter Values");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value 1 : ");
    double val1 = sc.nextDouble();
    System.out.print("Enter value 2 : ");
    double val2 = sc.nextDouble();
    System.out.print("Enter value 3 : ");
    double val3 = sc.nextDouble();
    
    int total = 3;
    double CGPA = (((val1 + val2 + val3)/total)/10);
    System.out.print("CGPA : ");
    System.out.print(CGPA);
    
    }
}
