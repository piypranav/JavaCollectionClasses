package JavaStringPractice;

import java.util.Scanner;

public class ReverseANumber {

    public void reverseNumber(int iNumber) {
        int reminder, temp=0;
        while(iNumber > 0) {
            reminder = iNumber%10;
            iNumber = iNumber/10;
            temp = temp * 10 + reminder;
            System.out.println("iNumber is: " + iNumber);
        }
        System.out.println("Number is: " + temp);
    }

    public static void main(String[] args) {
        ReverseANumber iReverse = new ReverseANumber();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number to get reverse: ");
//        int iNumber = scan.nextInt();
        iReverse.reverseNumber(1204);
    }
}
