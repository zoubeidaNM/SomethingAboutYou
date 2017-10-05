import java.util.Scanner;

public class SomethingAboutYou {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String answer = "";

        do {

            String firstName;
            int age;
            String height;
            double gpa;

            System.out.println("What is your first name? ");
            firstName = sc.nextLine();

            System.out.println("How old are you? ");
            age = sc.nextInt();
            sc.nextLine();

            System.out.println("How tall are you? ");
            height = sc.next();
            sc.nextLine();

            System.out.print("What is your GPA? ");
            gpa = sc.nextDouble();
            sc.nextLine();

            System.out.println("\n--------------------------------------------------------------");
            System.out.println("First name  :" + firstName);
            System.out.println("Age         :" + age);
            System.out.println("Height      :" + height);
            System.out.println("GPA         :" + gpa);
            System.out.println("\n--------------------------------------------------------------\n");


            do {
                System.out.println("Do you want to enter another record?  ");
                answer = sc.next();
            } while ( checkInvalidAnswer(answer));

            //return to a new line
            sc.nextLine();
            System.out.println("");


        } while (answer.equalsIgnoreCase("n") == false);

        System.out.println("Thank you!");

    }

    public static boolean checkInvalidAnswer(String answer) {
        if ((answer.equalsIgnoreCase("y") == false) && (answer.equalsIgnoreCase("n") == false)) {
            System.out.println("\n***********Invalid option.**************");
            System.out.println("Please, answer [y]or[Y] for Yes or [n]or[N] for No.\n");
            return true;
        } else {
            return false;
        }
    }
}