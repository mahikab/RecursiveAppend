/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author: Mahika Busireddy mb2164@scarletmail.rutgers.edu mb2164
 * did not include name on the first submission
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {

	    if (n == 0) 
            return original;

        return original + appendNTimes(original, n - 1);
    }

    public static void main (String[] args) {

	
    }
}
