import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Kilometer to Miles Converter");
    System.out.print("Enter value in kilometers : ");
    double km = sc.nextDouble();
    double miles = km/1.6;
    System.out.print("Miles : "+ miles);
    
    }
}
