/*
 *Parameterized tests to cover cases like reversing a string, 
 * converting to uppercase, and checking for palindrome strings. 
 * Using parameterized tests to validate 
 * the string manipulation methods.
 */
package lab_20_testcase; // User Defined Package
//import Built in packages
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import lab_20_Junit_String.StringManipulator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringManipulatorTest { // Class Declaration

    @ParameterizedTest // @ParameterizedTest to compare String with Upper case of the String
    @ValueSource(strings = {"hello", "world", "JUnit"})
    void testToUppercase(String input) {
    	StringManipulator manipulator = new StringManipulator();
        String result = manipulator.toUppercase(input);
        assertEquals(input.toUpperCase(), result);
    }

    @ParameterizedTest // @ParameterizedTest to compare Given String is Palindrome 
    @ValueSource(strings = {"radar", "level", "deified"})
    void testIsPalindromeTrue(String input) {
        StringManipulator manipulator = new StringManipulator();
        boolean result = manipulator.isPalindrome(input);
        assertTrue(result);
    }

    @ParameterizedTest // @ParameterizedTest to compare Given String is not  Palindrome
    @ValueSource(strings = {"hello", "world", "java"})
    void testIsPalindromeFalse(String input) {
        StringManipulator manipulator = new StringManipulator();
        boolean result = manipulator.isPalindrome(input);
        assertTrue(!result);
    }

    @ParameterizedTest // @ParameterizedTest to compare Given String with Reserve of the String
    @CsvSource({"hello, olleh", "world, dlrow", "JUnit, tinUJ"})
    void testReverseString(String input, String expected) {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.reverseString(input);
        assertEquals(expected, result);
    }
}