import java.util.Scanner;
public Class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int absoluteNumber = Math.abs(number);
        System.out.println("The absolute value of " + number + " is " + absoluteNumber);

        input.close();
    }
}