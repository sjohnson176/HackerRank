package Arrays;

public class RotateLeftQuestion {
	public static void main(String[] args) {
		int d = 4;
		int[] a = {1, 2, 3, 4, 5};
		int[] a2 = rotLeft(a, d);
		for(int n : a2) {
			System.out.print(n + ", ");
		}
	}
	static int[] rotLeft(int[] a, int d) {
		int[] a2 = a;
		int i = 0;
		int temp = 0;
		while (i < d) {
			temp = a[0];
			for(int j = 1; j < a.length; j++) {
				a[j-1] = a[j];
			}
			a[a.length - 1] = temp;
			i++;
		}
		return a2;
    }

}
