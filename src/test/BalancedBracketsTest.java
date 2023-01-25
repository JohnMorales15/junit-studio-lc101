package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void missingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void wrongBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
//        assertEquals(-1,BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void stringInBracketsIsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[HelloWorld]"));
    }

    @Test
    public void stringInBracketsAfterWord(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void stringAfterBracketsIsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void stringWithMissingBracketIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code"));
    }

    @Test
    public void stringWithBracketsInWrongSequenceIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void stringBeforeBracketsIsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void randomBracketsEverywhere(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]][]"));
    }
}
