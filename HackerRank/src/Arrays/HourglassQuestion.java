package Arrays;

public class HourglassQuestion {
	public static void main(String[] args) {
		int[][] arr = {
				{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0}};
		
//				1 1 1 0 0 0
//				0 1 0 0 0 0
//				1 1 1 0 0 0
//				0 0 2 4 4 0
//				0 0 0 2 0 0
//				0 0 1 2 4 0
		
		System.out.println(hourglassSum(arr));
	}
	static int hourglassSum(int[][] arr) {
		int maxSum = 0;
		int currentSum = 0;
		boolean isFirstLoop = true;
		
		for (int a = 0; a < arr.length; a++) {
			currentSum = 0;
			if (a + 2 < arr.length) {
				for (int b = 0; b < arr[a].length; b++) {
					if (b + 2 < arr[a].length) {
						currentSum = (arr[a][b] + arr[a][b+1] + arr[a][b+2]) +
								(arr[a+1][b+1]) +
								(arr[a+2][b] + arr[a+2][b+1] + arr[a+2][b+2]);
//						System.out.println(arr[a][b] + " " + arr[a][b+1] + " " + arr[a][b+2] +
//								"\n" + arr[a+1][b+1] +
//								"\n" + arr[a+2][b] + " " + arr[a+2][b+1] + " " + arr[a+2][b+2]);
//						System.out.println("currentSum: " + currentSum);
					}
					
					if (isFirstLoop) {
						maxSum = currentSum;
						isFirstLoop = false;
					}
					else if (currentSum > maxSum) {
						maxSum = currentSum;
					}
				}
			}
		}	
		
		return maxSum;
    }
}
