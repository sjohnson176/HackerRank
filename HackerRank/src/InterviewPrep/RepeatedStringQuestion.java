package InterviewPrep;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedStringQuestion {
	public static void main(String[] args) {
		long n = Long.valueOf("1000000000000");
		String s = "a";
		System.out.println(repeatedString(s, n));
		
//		a
//		1000000000000
	}
	
	static long repeatedString(String s, long n) {
		// set up matcher to look for a's in the string "s"
		 Matcher matcher = Pattern.compile(String.valueOf('a')).matcher(s);      
		    int aInInput = 0;
		    // run loop to count how many times the matcher found an a
		    while (matcher.find()) {
		        aInInput++;
		    }
		    long aCount = 0L;
		    // if a is the only char in the string return "n"
		    if (s.equals("a")) {
		        return n;
		    } 
		    else {
		    	// how many times bigger is n  than s.length multiply that by the
		    	// a count to get the total amount of a's
		        aCount += ((n / s.length()) * aInInput);
		        // the remainder of n % s.length() tells you how many more chars need
		        // to be accounted for
		        for (int i = 0; i < (n % s.length()); i++) {
		            if (s.charAt(i) == 'a') {
		                aCount++;
		            }
		        }
		    }
		    return aCount;
    }

}
