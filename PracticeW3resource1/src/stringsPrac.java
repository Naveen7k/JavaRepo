import java.util.Scanner;
public class stringsPrac {
public static void main(String[] args) {
	String temp;
	Scanner sc=new Scanner(System.in);
	System.out.print("no.of strings:");
	int count=sc.nextInt();
	String s1[]=new String[count];
	Scanner sc2=new Scanner(System.in);
	System.out.print("enter strings:");
	for(int i=0;i<count;i++) {
		s1[i]=sc2.nextLine();
	}
	for(int i=0;i<count;i++) {
		for(int j=i+1;j<count;j++) {
			if(s1[i].compareTo(s1[j])>0) {
				temp=s1[i];
				s1[i]=s1[j];
				s1[j]=temp;
			}
		}
	}
	System.out.println("ordered strings:");
	for(int i=0;i<count;i++) {
		System.out.print(s1[i]+", ");
	}
}
}
