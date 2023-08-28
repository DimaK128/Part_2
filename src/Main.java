import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hey! What is your name? :)");
        String name = in.nextLine();
        System.out.println("Wow,your name sounds awesome :0" );

        System.out.println("How old are you ? :)");
        int n = in.nextInt();
        in.nextLine();

        System.out.println("You are quiet young" );


        System.out.println("What program do you study on?");
        String specialty = in.nextLine();

        System.out.println("Your program sounds quiet interesting for nowadays" );

        System.out.println("What do you like most about your program?");
        String program = in.nextLine();
        System.out.println("Great,you was choosing your program wisely.");

        System.out.println("Well,i get so much information about you.Good luck ;)");



    }
}