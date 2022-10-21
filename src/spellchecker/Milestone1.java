package spellchecker;

public class Milestone1 {

    public static void main(String[] args)
    {
        //Calculates the Levenshtein distances between s1 and s2. This method should ignore case (e.g., 'a' == 'A').
        // For simplicity we are assuming each char of these strings represents a single letter.
        // That is we will assume that each character of these strings would pass the Character.isLetter(char) test.

        String s1 = "planet";
        String s2 = "partner"; //should be 4 here
        //String s1 = "kitten";
        //String s2 = "sitting"; //should be 3
        //String s1 = "saturday";
        //String s2 = "sunday"; //should be 3
        //String s1 = "share";
        //String s2 = "care"; //should be 2
       // String s1 = "sausage";
       // String s2 = "salmon"; //should be 5
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[][] levenGraph = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0)
                {
                    levenGraph[i][j] = j; // this fills the top bar
                }
                else if (j == 0)
                {
                    levenGraph[i][j] = i; // this fills the side bars
                }
                else if(s1.charAt(i-1) == s2.charAt(j-1))
                {
                    levenGraph[i][j] = levenGraph[i-1][j-1]; // go back one diagonally.
                }
                else // do the math stuff
                {
                    levenGraph[i][j] = 1+Math.min( levenGraph[i-1][j], Math.min(levenGraph[i][j-1], levenGraph[i-1][j-1]));
                    //this handles the delete, insert, replace numbers, im calling the min on a min, which i have to do because min only takes in 2 things
                }
            }
        }
        System.out.println(levenGraph[s1.length()][s2.length()]);




    }

}
