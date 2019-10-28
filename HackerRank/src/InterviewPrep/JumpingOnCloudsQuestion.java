package InterviewPrep;

public class JumpingOnCloudsQuestion {
	public static void main(String[] args) {
		int[] c = {0, 0, 1, 0, 0, 1, 0};
		System.out.println(jumpingOnClouds(c));
		//		7
		//		0 0 1 0 0 1 0
		//		0, 0, 0, 1, 0, 0
	}
	
	static int jumpingOnClouds(int[] c) {
		int jumps = 0;
		for (int a = 0; a < c.length; a++) {
			System.out.print(jumps + ", ");
			if (c[a] == 0) {
				if (a < c.length - 2 && c[a+2] == 0) {
					a++;
					jumps++;
					continue;
				}
				else if (a < c.length - 1 && c[a+1] == 0) {
					jumps++;
					continue;
				}
				else {
					if (a != c.length - 1) {
						jumps++;
					}
				}
			}
		}
		return jumps;
    }

}
