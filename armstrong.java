import java.util.Scanner;
class Armstrong{
public static void main (String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n =sc.nextInt();
int n1,rev=0,rem;
 n1=n;
while(n>0){
rem = n%10;
rev=rem*rem*rem+rev;
n=n/10;
}
if(n1==rev){
System.out.println("Given number is a armstrong");
}
else{
System.out.println("Given number is not a armstrong");
}
}
}