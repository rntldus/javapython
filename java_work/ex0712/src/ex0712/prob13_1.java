package ex0712;
//page 301
public class prob13_1 {
	public static int[] ary= {10,20,6,9,33,5};
	
	public static int minValue(int[] arr) {
		int min=ary[0];
		for(int i=0; i<ary.length; i++) {
			if(min>ary[i]) {
				min=ary[i];
			}
		}
		return min;
	}
	public static int maxValue(int[] arr) {
		int max=ary[0];
		for(int temp:ary) {
			if (max<temp) {
				max=temp;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int min=minValue(ary);
		int max=maxValue(ary);
		
		System.out.println("최솟값="+min);
		System.out.println("최댓값="+max);
	}		
}

