import java.util.Scanner;
public class reverseString {
public static void main(String[] args) {
	Scanner s2=new Scanner(System.in);
	String str;
	str=s2.nextLine();
	StringBuffer sbf=new StringBuffer(str);
	sbf.reverse();
	System.out.println(sbf);
}
}
