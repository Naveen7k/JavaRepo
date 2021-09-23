import java.util.Scanner;
public class ArraysSum {
	public static void main(String[] args) {
		int len,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter length of array:");
		len=input.nextInt();
		int[] array=new int[len];
		for(int i=0;i<len;i++) {
			array[i]=input.nextInt();
			sum+=array[i];
		}
		System.out.println("sum of array elements is:"+sum);
		double avg=(double)sum/array.length;
		System.out.println("average value of elements is:"+avg);
	}

}
