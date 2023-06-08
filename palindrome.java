import java.util.Scanner;
class Palindrome{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n =sc.nextInt();
int n1,rev=0,rem;
 n1=n;
while(n>0){
rem = n%10;
rev=rev*10+rem;
n=n/10;
}
if(n1==rev){
System.out.println("Given number is a palindrome");
}
else{
System.out.println("Given number is not a palindrome");
}
}
}