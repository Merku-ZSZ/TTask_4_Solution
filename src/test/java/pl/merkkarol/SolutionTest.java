package pl.merkkarol;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void splitNumberTest(){
        int[] expectedArray = {1,2,3};
        int toTest = 123;
        Solution solution = new Solution();
        int[] result = solution.splitNumber(toTest);
        assertArrayEquals(result, expectedArray);
    }
    @Test
    public void hasTheSameDigitsTest(){
        Solution solution = new Solution();
        solution.setGivenNumber(123);
        int[] sameDigits = {2,3,1};
        int[] otherDigits = {2,6,2};
        assertTrue(solution.hasTheSameDigits(sameDigits));
        assertFalse(solution.hasTheSameDigits(otherDigits));
    }
    @Test
    public void isFindTest(){
        Solution solution = new Solution();
        solution.setGivenNumber(123);
        assertFalse(solution.isFind(123));
        solution.setGivenNumber(142857);
        assertTrue(solution.isFind(142857));
    }
}