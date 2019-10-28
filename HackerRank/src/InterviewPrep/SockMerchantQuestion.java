package InterviewPrep;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


public class SockMerchantQuestion {
	public static void main(String[] args) {
		int a = 9;
		int[] nums = new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20};
		System.out.println(sockMerchant(a, nums));
		
//		9
//		10 20 20 10 10 30 50 10 20
		
	}
	
	public static int sockMerchant(int n, int[] nums) {
		// create a linked list to store unique "colors"
		LinkedList colors = new LinkedList<>();
		// put the unique colors in the linked list
		for (int a = 0; a < n; a++) {
			if (!colors.contains(nums[a])) {
				colors.add(nums[a]);
			}
		}
		// create variable to count pairs
		int pairs = 0;
		// create an iterator for the list
		Iterator<Integer> it = colors.iterator();
		while (it.hasNext()) {
			// variables to store current color
			int color = it.next();
			int matches = 0;
			for (int b = 0; b < n; b++) {
				if (color == nums[b]) {
					matches++;
				}
			}
			if (matches % 2 == 0) {
				pairs += matches / 2;
			}
			else {
				pairs += (matches -1) / 2;
			}
		}
		
		return pairs;
		
	}

}