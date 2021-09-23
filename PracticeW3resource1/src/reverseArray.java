import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class reverseArray {
public static void main(String[] args) {
	int temp;
	int arr[]=new int[100];
	Scanner s=new Scanner(System.in);
	System.out.print("array size:");
	int count=s.nextInt();
	for(int i=0;i<count;i++) {
		arr[i]=s.nextInt();
	}
	int j=count;
	for(int i=0;i<count;i++) { // 1st method
		temp=arr[count-1];
		arr[count-1]=arr[i];
		arr[i]=temp;
		count--;
	}
	/*int j=i-1;         2nd method
	int i=0;
	while(i<j) {
		temp=arr[count-1];
		arr[count-1]=arr[i];
		arr[i]=temp;
		i++;
		j--;
	}*/
	for(int i=0;i<j;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	// sorting array
	System.out.print("array size:");
	Scanner s2=new Scanner(System.in);
	int count2=s2.nextInt();
	int arr2[]=new int[count2]; //{2,6,9,4,6,8,5,7,6,9,2,3};
	for(int i=0;i<count2;i++) {
		arr2[i]=s2.nextInt();
	}
	Arrays.sort(arr2);
	for(int i=0;i<count2;i++) {
		System.out.print(arr2[i]+" ");
	}
	System.out.println();
	Array.set(arr2,0,1);
	for(int i=0;i<count2;i++) {
		System.out.print(arr2[i]+" ");
	}
	/*int a;          practice
	float b;
	double d;
	long l;
	short sh;
	int array[]=new int[100];
	char[] array3=new char[100];
	String s4;
	char c4[]=new char[5];
	String s5=new String();
	Scanner sc2=new Scanner(System.in);
	s4=sc2.nextLine();
	System.out.println(s4);
	}*/
	
	
}
}


