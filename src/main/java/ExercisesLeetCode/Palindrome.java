package ExercisesLeetCode;

public class Palindrome {
    public boolean isPalindrome(int x) {
        String intToString = String.valueOf(x);
        String revIntToString = "";
        for (int i = intToString.length(); i > intToString.length(); i--) {
            revIntToString += intToString.charAt(i);
        }

        if (intToString.equals(revIntToString)) return true;

        return false;
    }

}
