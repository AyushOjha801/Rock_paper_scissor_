import java.util.Scanner;
//imported random util it can be self imported just like scanner write in main code random then a variable =
// it will automatically come
import java.util.Random ;
public class  Main {
    public static void main(String[] args) {
        //taking user input
        Scanner s = new Scanner(System.in);
        //rand variable made for random
        Random rand = new Random();
        //gave random a range bound of upto 3 numbers only
        int a = rand.nextInt(3);
        //said user about which number is what and asked to choose his number
        System.out.println("Welcome hero : Let's start our ROCK,PAPER AND SCISSOR GAME :) ");
        System.out.println("For Rock the number is 0 ,\n For Paper the number is 1 ,\n For Scissor the number is 2");
        System.out.println("Please choose your number");
        int i = s.nextInt();
        //if both of the number matches it will give a tie
        if (i == a) {
            System.out.println("Its a tie boy :) Computer also choose the same ");
            //if user entered o which is rock and computer generated 1 which is paper it will show u lost
        } else if (i == 0 && a == 1) {
            System.out.println("Computer generated Paper and you Rock.\n You lost boy :( ");
            //if user entered 1 which is paper and computer generated 2 which is scissor it will show u lost

        } else if (i == 1 && a == 2) {
            System.out.println("Computer generated Scissor.\n You lost boy :( ");
            //if user entered 2 which is scissor and computer generated 0 which is rock it will show u lost

        } else if (i == 2 && a == 0) {
            System.out.println("Computer generated Rock.\n You lost boy :( ");
            //now from here generating a user win scenario
        } else if (i == 2 && a == 1) {
            System.out.println("Computer generated paper.\n You won boy");
        } else if (i == 1 && a == 0) {
            System.out.println("Computer generated rock.\n You won boy");


        } else if (i == 0 && a == 2) {
            System.out.println("Computer generated scissor.\n You won boy");
//       if user gives a number which is not from 0-2 it will show please select from given numbers only
        }else {
            System.out.println("Please enter a number from the given options only");
        }
        //and at last a thankyou play again message quoted
        System.out.println("Thankyou play again soon");
    }
}
//in future will add while loop to make it a 5 point or 10 point game