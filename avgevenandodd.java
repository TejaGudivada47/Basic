import java.util.Scanner;
class Print{
public static void main(String [] args){
int sum1=0;
int sum2=0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter first limit : ");
int x=sc.nextInt();
System.out.print("Enter second limit : ");
int y=sc.nextInt();
for(int i=x;i<=y;i++){
if(i%2==0){
sum1=sum1+i;
}
}
for(int i=x;i<=y;i++){
if(i%2!=0){
sum2 = sum2+i;
}
}
int sum=sum1-sum2;
System.out.print(sum);
}
}