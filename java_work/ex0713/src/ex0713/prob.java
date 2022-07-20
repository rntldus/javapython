package ex0713;
//CH13-2
//page 309 문제1
public class prob {
	
	public static void printoneArr(int[] arr) {
		for (int i=0; i<arr.length; i++)
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
	}
	
	public static void printtwoArr(int[][] arr) {
		for (int i=0; i<arr.length; i++) {
			printoneArr(arr[i]);
			System.out.println();
		}
	}
	
	public static void addOneDArr(int[] arr, int add) {
		for (int i=0; i<arr.length; i++)
			arr[i]+=add;
	}
	
	public static void addTwoDArr(int[][] arr, int add) {
		for (int i=0; i<arr.length; i++)
			addOneDArr(arr[i], add);
	}
	
	public static void main(String[] args) {
		
		int a[][]= {
				{11},
				{11,22},
				{11,22,33}
		};
		
		printtwoArr(a);
		addTwoDArr(a,3);
		printtwoArr(a);
/*
		int a[]= {1,2,3,4,5};
		int add=10;
		
		addOneDArr(a,add);
		printoneArr(a);
*/	
	}
}