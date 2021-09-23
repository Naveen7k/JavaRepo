import java.util.Arrays;
import java.util.Scanner;
public class SortArray {
	public static void main(String[] args) {
		int len;
		Scanner input=new Scanner(System.in);
		System.out.println("enter length of array:");
		len=input.nextInt();
		/*int[] array = new int[len];
		System.out.println("enter elements:");
		for(int i=0;i<len;i++) {
			array[i]=input.nextInt();
		}
		Arrays.sort(array);
		for(int i=0;i<len;i++) {
			System.out.print(array[i]+" ");
		}*/
		String[] array2=new String[len];
		Scanner input2=new Scanner(System.in);
		System.out.println("enter elements:");
		for(int i=0;i<len;i++) {
			array2[i]=input2.nextLine();
		}
		Arrays.sort(array2);
		for(int i=0;i<len;i++) {
			System.out.print(array2[i]+" ");
		}
	}
}
