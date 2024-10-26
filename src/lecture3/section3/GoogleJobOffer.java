package lecture3.section3;

import java.util.Scanner;

public class GoogleJobOffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();
        String jobTitle = scanner.nextLine();
        double salary = scanner.nextDouble();

        System.out.printf("Dear %s,\n" +
                "Welcome to Google!\n" +
                "We are delighted to have you as a %s. Your starting salary is $%.2f\n" +
                "\n" +
                "Sincerely,\n" +
                "Google HR Representative" , fullName , jobTitle , salary);
    }
}
