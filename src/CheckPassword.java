/*
    Problem Statement:

        Define a function int CheckPassword(char str[], int n) that takes:

        str: a character array representing the password string.
        n: an integer representing the size of the string str.
        The function should return 1 if str is a valid password and 0 otherwise.

    Password Validity Criteria:

        A password is considered valid if it meets the following conditions:

        It contains at least 4 characters.
        It contains at least one numeric digit.
        It contains at least one uppercase letter.
        It must not contain any spaces or the slash ( / ) character.
        The first character must not be a numeric digit.

    Example:

        Input: str = "Pass1234", n = 8
        Output: 1 (valid password)

        Input: str = "1234Pass", n = 8
        Output: 0 (invalid because it starts with a number)
 */

public class CheckPassword {
    public static void main(String[] args) {
        String[] strArr = {"Pass1234", "1234Pass"};

        for(String str : strArr) {
            System.out.println((checkPassword(str) > 0) ? "Valid" : "Invalid");
        }
    }

    static int checkPassword(String str){
        int capitalLetters = 0;
        int numericDigit = 0;

        if(str.charAt(0) >= '0'  &&  str.charAt(0) <= '9') return 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.length() <= 4)  return 0;
            if(str.charAt(i) >= '0'  &&  str.charAt(i) <= '9')  numericDigit++;
            if(str.charAt(i) >= 'A'  &&  str.charAt(i) <= 'Z')  capitalLetters++;
            if(str.charAt(i) == ' '  &&  str.charAt(i) == '/')  return 0;
        }

        return (numericDigit > 0  &&  capitalLetters > 0) ? 1 : 0;
    }
}
