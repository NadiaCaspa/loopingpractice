import java.util.Scanner;

public class loopingpractice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        System.out.println("Enter the positive integer number: ");
        int input = in.nextInt();


        int count = 1;
        int sum = 0;
        while (count <= input) {
            if (input % count == 0) {
             sum = sum + count ;
             count ++;

            }
            else {
                count ++;
            }

        }
        System.out.printf("Sum of all the factors %d is %d",input, sum);
    }

}
