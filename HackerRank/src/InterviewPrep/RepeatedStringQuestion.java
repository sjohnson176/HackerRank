package InterviewPrep;

import java.util.Iterator;
import java.util.LinkedList;

public class RepeatedStringQuestion {
	public static void main(String[] args) {
		long n = Long.valueOf("10");
		String s = "aba";
		System.out.println(repeatedString(s, n));
		
//		a
//		1000000000000
	}
	
	static long repeatedString(String s, long n) {
		long aCount = 0;
		LinkedList<String> newS = new LinkedList<>();
		if (s.equals("a")) {
			return n;
		}
		while (newS.size() < n) {
			for (int a = 0; a <= s.length() - 1; a++) {
				String currentChar = s.substring(a, a + 1);
				if (newS.size() == n) {
					break;
				}
				//System.out.print(currentChar + ", ");
				else if (currentChar.equals("a")) {
					aCount++;
				}
			}
		}
		
//		Iterator<String> it = newS.iterator();
//		while (it.hasNext()) {
//			String currentChar = it.next();
//			//System.out.print(currentChar + ", ");
//			if (currentChar.equals("a")) {
//				aCount++;
//			}
//		}
		return aCount++;
    }

}
