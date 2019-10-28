package InterviewPrep;

import java.util.LinkedList;

public class GarysValleysQuestion {
	public static void main(String[] args) {
		int n = 8;
		String s = "UDDDUDUU";
		System.out.println(countingValleys(n, s));
		
	}
	
	static int countingValleys(int n, String s) {
		// create variable to keep track of sea level
		int sl = 0;
		// var to count valleys
        int valleys = 0;
        // boolean to test if in valley or not
        boolean inValley = false;
        for (int b = 0; b < n; b++) {
        	// get the current unit
        	String unit = s.substring(b, b+1);
        	// if unit is D go down level if U go up level
        	if (unit.equals("D")) {
        		sl--;
        	}
        	else {
        		sl++;
        	}
        	//System.out.println(sl + ", ");
        	if (sl < 0) {
                inValley = true;
            }
            // if you're in a valley but have reached sea level increase valleys and 
        	//you are no longer in a valley
        	else if (inValley && sl >= 0) {
                valleys++;
                inValley = false;
            } 
           
        }
        return valleys;
    }

}
