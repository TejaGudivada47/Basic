import java.util.Scanner;
class EvenOddPrime{
public static void main(String[]args){
int num[]=new int[5];
Scanner sc = new Scanner(System.in);
for(int i=0;i<num.length;i++){
System.out.println("Enter a number");
num[i]=sc.nextInt();
}
System.out.println("Even numbers :");
for(int i=0;i<num.length;i++){
if (num[i]%2==0){
System.out.print(" "+num[i]);
}
}
System.out.println("odd numbers :");
for(int i=0;i<num.length;i++){
if (num[i]%2!=0){
System.out.print(" "+num[i]);
}
}
System.out.println("prime numbers :");
for(int i=0;i<num.length;i++){
int count=0;
for(int j = 2;i<num[i];j++){
if(num[i]%j==0){
count++;
}
if(count==2){
System.out.print(" "+num[i]);
}
}
}
}
}