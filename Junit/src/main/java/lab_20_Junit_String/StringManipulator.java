/*
 * Create a JUnit test class to test a StringManipulator class that provides methods
for manipulating strings. Write parameterized tests to cover cases like reversing a
string, converting to uppercase, and checking for palindrome strings. Use
parameterized tests to validate the string manipulation methods
 */

package lab_20_Junit_String; // User Defined Package

public class StringManipulator { // Class Declaration
	//Method with parameter to convert to Upper Case
    public String toUppercase(String input) {
        return input.toUpperCase(); // return statement
    }

  //Method with parameter to check whether String is Palindrome or not
    public boolean isPalindrome(String input) {
        StringBuilder reversed = new StringBuilder(input).reverse();
        return input.equalsIgnoreCase(reversed.toString());
    }
  //Method with parameter to Reverse a String
    public String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
