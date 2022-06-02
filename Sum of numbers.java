import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Values - ");
    System.out.print("Enter Value 1 : ");
    int a = sc.nextInt();
    System.out.print("Enter Value 2 : ");
    int b = sc.nextInt();
    System.out.print("Enter Value 3 : ");
    int c = sc.nextInt();
    int sum = a + b + c;
    System.out.print("Sum : ");
    System.out.print(sum);
    }
}
