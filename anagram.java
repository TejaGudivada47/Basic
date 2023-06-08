import java.util.Scanner;
class Anagram{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter first word : ");
String s1 = sc.nextLine();
System.out.print("Enter second word : ");
String s2 = sc.nextLine();
System.out.print("Both are anagrams"+anagramCheck(s1,s2));
}
public static boolean anagramCheck(String s1,String s2){
char[] charArrayFromString1=s1.toCharArray();
char[] charArrayFromString2=s2.toCharArray();
Arrays.sort(charArrayFromString1);
Arrays.sort(charArrayFromString2);
return Arrays.equals(charArrayFromString1,charArrayFromString2);
}
}