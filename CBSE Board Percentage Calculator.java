import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CBSE Board Percentage Calculator");
        System.out.println("Please enter your Marks");
        Scanner S = new Scanner(System.in);
        System.out.print("Subject 1 : ");
        Double sub1 = S.nextDouble();
        System.out.print("Subject 2 : ");
        Double sub2 = S.nextDouble();
        System.out.print("Subject 3 : ");
        Double sub3 = S.nextDouble();
        System.out.print("Suject 4 : ");
        Double sub4 = S.nextDouble();
        System.out.print("Suject 5 : ");
        Double sub5 = S.nextDouble();
        Double marks = sub1 + sub2 + sub3 + sub4 +sub5;
        int totalSubs = 5;

        Double percentage = marks/totalSubs;
        System.out.print("Percentage : ");
        System.out.print(percentage);




    }
}
