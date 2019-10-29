package Arrays;

public class LineQueQuestion {
	public static void main(String[] args) {
		int[] q = {1,
				8,
				1, 2, 5, 3, 4, 7, 8, 6};
		minimumBribes(q);
		
//		2
//		8
//		5 1 2 3 7 8 6 4
//		8
//		1 2 5 3 7 8 6 4
		
//		1
//		8
//		1 2 5 3 4 7 8 6
		
//		2
//		5
//		2 1 5 3 4
//		5
//		2 5 1 3 4
	}
	
	 static void minimumBribes(int[] q) { 
		 int i = 0;
		 int instart = 0;
		 int instips = 0;
		 while (i < q[0]) {
			 int minBribes = 0;
			 boolean tooChaotic = false;
			 if (i == 0) {
				 instart = 2;
				 instips = 1;
			 }
			 else {
				 instart = 3 + q[instips];
				 instips = 2 + q[instips];
			 }
			 
			 for (int a = 0, b = 1; a < q[instips]; a++, b++, instart++) {
				 int currentBribes = 0;
				 if (q[instart] == b) {
					 continue;
				 }
				 else if (q[instart] > b) {
					 currentBribes = q[instart] - b;
				 }
				 else if (instart < q.length - 1) {
					 if (q[instart] < b && q[instart] > q[instart+1]) {
						 minBribes++;
					 }
				 }
			 
				 if (currentBribes > 2) {
					 System.out.println("Too chaotic");
					 tooChaotic = true;
					 break;
				 }
				 else {
					 minBribes += currentBribes;
				 }
			 }
			 
			 if (!tooChaotic) {
				 System.out.println(minBribes);
				 minBribes = 0;
			 }
			 i++;
		 }

	 }

}
