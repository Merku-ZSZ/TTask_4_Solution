package pl.merkkarol;

public class Solution {
    private int[] givenNumberInArray;

    public void setGivenNumber(int givenNumber) {
        this.givenNumberInArray = splitNumber(givenNumber);
    }

    //Split input number to int array
    int[] splitNumber(int numberToSplit) {
        int numberLength = String.valueOf(numberToSplit).length();
        int[] numberInArray = new int[numberLength];
        for (int i = numberLength - 1; i >= 0; i--) {
            int mod = numberToSplit % 10;
            numberToSplit = numberToSplit / 10;
            numberInArray[i] = mod;
        }
        return numberInArray;
    }
//Check given array and multiple number in array
    boolean hasTheSameDigits(int[] multiplier) {
        for (int j = 0; j < givenNumberInArray.length; j++) {
            int counter = 0;
            for (int i = 0; i < givenNumberInArray.length; i++) {
                if (givenNumberInArray[j] == multiplier[i]) {
                    counter++;
                }
            }
            if (counter == 0) {
                return false;
            }
        }
        return true;
    }
//Iteration of x2 ... x6
    boolean isFind(int givenNumber) {
        for (int i = 2; i < 7; i++) {
            if (!hasTheSameDigits(splitNumber(givenNumber * i))) {
                return false;
            }
        }
        return true;
    }
}
