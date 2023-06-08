import java.util.Scanner;
class Swap{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n =sc.nextInt();
int a,b=0;
a = n%10;
while(n>=10){
n=n/10;
b=n;
}
System.out.print(a);
System.out.print(b);
}
}