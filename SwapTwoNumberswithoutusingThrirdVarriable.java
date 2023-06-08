import java.util.Scanner;
class Swap{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number");
int x = sc.nextInt();
System.out.println("Enter second number");
int y = sc.nextInt();
System.out.println("Before Swapping");
System.out.println("a : "+x);
System.out.println("b : "+y);
x=x+y;
y=x-y;
x=x-y;
System.out.println("After Swapping");
System.out.println("a : "+x);
System.out.println("b : "+y);
}
}