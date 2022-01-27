package pl.merkkarol;

public class App {
    public static void main(String[] args) {
        boolean isAlive = true;
        int i = 1;
        Solution solution = new Solution();
        while (isAlive) {
            //check if 6x has more digits than x
            if (String.valueOf(i * 6).length() == String.valueOf(i).length()) {
                solution.setGivenNumber(i);
                if (solution.isFind(i)) {
                    System.out.println("The smallest positive integer is " + i + ".");
                    break;
                }
            }
            i++;
        }
    }
}
