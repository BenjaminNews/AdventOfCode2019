import java.util.Arrays;

public class DayTwo {

    public int partOne(String input) {
        int[] valuesInput = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < valuesInput.length && valuesInput[i] != 99; i += 4) {
            if(valuesInput[i] == 1) {
                valuesInput[valuesInput[i + 3]] = valuesInput[valuesInput[i + 1]] + valuesInput[valuesInput[i + 2]];
            } else if(valuesInput[i] == 2) {
                valuesInput[valuesInput[i + 3]] = valuesInput[valuesInput[i + 1]] * valuesInput[valuesInput[i + 2]];
            }
        }
        return valuesInput[0];
    }

    public int partTwo(String input) {
        int[] data = Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
        for(int verb = 0; verb < 100; verb++) {
            for(int noun = 0; noun < 100; noun++) {
                data[1] = noun;
                data[2] = verb;
                int[] temp = calculate(Arrays.copyOf(data, data.length));
                if(temp[0] == 19690720) {
                    return 100 * noun + verb;
                }
            }
        }
        return -1;
    }

    private static int[] calculate(int[] data) {
        int i = 0;
        while (i < data.length) {
            if (data[i] == 1) {
                data[data[i + 3]] = data[data[i + 1]] + data[data[i + 2]];
            } else if (data[i] == 2) {
                data[data[i + 3]] = data[data[i + 1]] * data[data[i + 2]];
            } else if (data[i] == 99) {
                break;
            }
            i += 4;
        }
        return data;
    }

    public static void main(String[] args) {
        DayTwo dayTwo = new DayTwo();
        System.out.printf("Part one: %d\n", dayTwo.partOne(input));
        dayTwo = new DayTwo();
        System.out.printf("Part two: %d", dayTwo.partTwo(input));
    }

    private static final String input = "1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,9,1,19,1,9,19,23,1,23,5,27,2,27,10,31,1,6,31,35,1,6,35,39,2,9,39,43,1,6,43,47,1,47,5,51,1,51,13,55,1,55,13,59,1,59,5,63,2,63,6,67,1,5,67,71,1,71,13,75,1,10,75,79,2,79,6,83,2,9,83,87,1,5,87,91,1,91,5,95,2,9,95,99,1,6,99,103,1,9,103,107,2,9,107,111,1,111,6,115,2,9,115,119,1,119,6,123,1,123,9,127,2,127,13,131,1,131,9,135,1,10,135,139,2,139,10,143,1,143,5,147,2,147,6,151,1,151,5,155,1,2,155,159,1,6,159,0,99,2,0,14,0";
}