import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class findElementinArray {
	public static boolean find(int[] arr, int n) {
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i])
				return true;
		}
		return false;
	}
	public static int index(int[] arr,int n) {
		if(arr==null) return -1;
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i])
				flag=i;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		int[] array3=null;
		int[] array= {1,2,3,4,5,6};
		int[] array2= {4,6,87,3,4,5,7,9,8,0,22};
		int l=array2.length;
		System.out.println(find(array,3));
		System.out.println(find(array2,45));
		System.out.println(index(array,98));
		System.out.println(index(array2,0));
		System.out.println(index(array3,0));
		System.out.println(Arrays.toString(array));
		Arrays.sort(array2);
		System.out.println("min value is:"+array2[0]+"\nmax value is:"+array2[l-1]);
		// duplicate numbers finding..
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(array2[i]==array2[j])
					System.out.println("dupicate number: "+array2[j]);
			}
		}
		//duplicate strings in array using hashSet..
		HashSet<String> set=new HashSet<String>();
		String[] array4=new String[6];
		Scanner input=new Scanner(System.in);
		System.out.println("enter string elements in array4:");
		for(int i=0;i<6;i++) {
			array4[i]=input.next();
		}
		for(int i=0;i<6;i++) {
			for(int j=i+1;j<6;j++) {
				if(array4[i].equals(array4[j]))
					set.add(array4[j]);
			}
		}
		System.out.println("common elements in array are: "+set);
		set.clear();
		//common strings in 2 arrays finding using HashSet..
		String[] array5=new String[4];
		String[] array6=new String[4];
		Scanner input2=new Scanner(System.in);
		System.out.println("enter string elements of array5:");
		for(int i=0;i<4;i++) {
			array5[i]=input2.nextLine();
		}
		System.out.println("enter string elements of array6:");
		for(int i=0;i<4;i++) {
			array6[i]=input2.nextLine();
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(array5[i].equals(array6[j]))
					set.add(array5[i]);
				}
			}
		System.out.println("common elements in both arrays are: "+set);
		set.clear();
		//finding common numbers in 2 arrays..
		HashSet<Integer> set2=new HashSet<Integer>();
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array[i]==array2[j])
					set2.add(array[i]);
			}
		}
		System.out.println("common number in both arrays are: "+set2);
		}
}


