import javax.naming.InitialContext;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;



public class readit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What is your SID: ");
        String SID = reader.nextLine();
        System.out.print("Hello " + SID + ": Please select a command: \n\n\n>Wrekt\n\n\n");
        ArrayList<String> words = new ArrayList<String>();

        persons a = new persons(SID);

        a.printPerson();
        a.becomeOlder();
        a.printPerson();
        a.becomeOlder();
        a.printPerson();
        bark();
        bark();
        bark();
        bark();
        bark();
        bark();
        bark("aaaaa");
        Random rand = new Random();
        int n = rand.nextInt(25);
        char symbol = ("a" + "bcdefghijklmnopqrstuvwxyz").charAt(n);
        System.out.println("Random Character: " + symbol + "    number: " + (n + 1));
        int[] numbers = {13, 10, 4, 1};
        int i = 0;
        while (i < numbers.length) {
            bark(numbers[i]);
            i++;
        }
    }

    public static void bark() {

        System.out.print(" WOOF! ");


    }

    public static void bark(String whattobark) {
        System.out.println(" WOOF! " + whattobark);
    }

    public static void bark(int numberoftimes) {
        int number = 1;
        while (number < numberoftimes + 1) {
            System.out.print("WOOOF!!!# " + number + "\n");
            number++;
        }
    }
}