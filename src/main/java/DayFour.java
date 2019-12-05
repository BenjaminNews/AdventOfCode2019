import java.util.Arrays;

public class DayFour {
    public static int partOne(String input) {
        String[] valuesToParse = input.split("-");
        int valuesFrom  = Integer.parseInt(valuesToParse[0]);
        final int valuesTo  = Integer.parseInt(valuesToParse[1]);
        int matchCount = 0;
        for(int i = valuesFrom; i < valuesTo + 1; i++) {
            if (containsPair(i)) {
                if (allValuesIncrement(i)) {
                    matchCount++;
                }
            }
        }
        return matchCount;
    }

    public static int partTwo(String input) {
        String[] valuesToParse = input.split("-");
        int valuesFrom  = Integer.parseInt(valuesToParse[0]);
        final int valuesTo  = Integer.parseInt(valuesToParse[1]);
        int matchCount = 0;
        for(int i = valuesFrom; i < valuesTo + 1; i++) {
            if (containsPairPartTwo(i)) {
                if (allValuesIncrement(i)) {
                    matchCount++;
                }
            }
        }
        return matchCount;
    }

    private static boolean allValuesIncrement(int value) {
        char[] digits = String.valueOf(value).toCharArray();
        for(int i = 0; i + 1 < digits.length; i++) {
            if(digits[i] > digits[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsPair(int value) {
        char[] digits = String.valueOf(value).toCharArray();
        for(int i = 0; i + 1 < digits.length; i++) {
            if(digits[i] == digits[i + 1]) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsPairPartTwo(int value) {
        char[] digits = String.valueOf(value).toCharArray();
        int count = 0;
        for(int i = 0; i + 2 < digits.length; i++) {
            if(digits[i] == digits[i + 1] && digits[i] == digits[i + 2]) {
                count++;
            }
        }
        return count < 2;
    }

    public static void main(String[] args) {
        System.out.printf("Part one: %d%n", DayFour.partOne("165432-707912"));
    }
}
