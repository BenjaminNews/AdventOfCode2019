import java.util.Arrays;

public class DayOne {

    public static int partOne(String input) {
        int sum = 0;
        for(int i : Arrays.stream(input.split("\n")).mapToInt(Integer::valueOf).toArray())
            sum += (i / 3) - 2;
        return sum;
    }

    public static int partTwo(String input) {
        int sum = 0;
        for(int i : Arrays.stream(input.split("\n")).mapToInt(Integer::valueOf).toArray())
            while ((i = ((i / 3) - 2)) > -1)
                sum += i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.printf("Part one: %d%n", DayOne.partOne(input));
        System.out.printf("Part two: %d%n", DayOne.partTwo(input));
    }

    private static final String input = "98578\n" +
                                        "105016\n" +
                                        "93022\n" +
                                        "144768\n" +
                                        "80394\n" +
                                        "112379\n" +
                                        "121119\n" +
                                        "94660\n" +
                                        "126363\n" +
                                        "112893\n" +
                                        "102603\n" +
                                        "93967\n" +
                                        "77268\n" +
                                        "103649\n" +
                                        "70132\n" +
                                        "142499\n" +
                                        "143711\n" +
                                        "140554\n" +
                                        "104725\n" +
                                        "84738\n" +
                                        "70613\n" +
                                        "108746\n" +
                                        "111488\n" +
                                        "89944\n" +
                                        "67984\n" +
                                        "59613\n" +
                                        "80035\n" +
                                        "69350\n" +
                                        "134001\n" +
                                        "62115\n" +
                                        "104688\n" +
                                        "143033\n" +
                                        "109712\n" +
                                        "96194\n" +
                                        "90353\n" +
                                        "96899\n" +
                                        "131267\n" +
                                        "143909\n" +
                                        "96649\n" +
                                        "138803\n" +
                                        "140620\n" +
                                        "73931\n" +
                                        "118851\n" +
                                        "58910\n" +
                                        "92205\n" +
                                        "132615\n" +
                                        "83308\n" +
                                        "73807\n" +
                                        "146895\n" +
                                        "142622\n" +
                                        "56234\n" +
                                        "126672\n" +
                                        "79278\n" +
                                        "111589\n" +
                                        "57593\n" +
                                        "80856\n" +
                                        "76261\n" +
                                        "89204\n" +
                                        "110871\n" +
                                        "74731\n" +
                                        "68654\n" +
                                        "103148\n" +
                                        "89935\n" +
                                        "58596\n" +
                                        "89510\n" +
                                        "101248\n" +
                                        "86137\n" +
                                        "56176\n" +
                                        "78679\n" +
                                        "128987\n" +
                                        "73114\n" +
                                        "143844\n" +
                                        "69805\n" +
                                        "54820\n" +
                                        "99223\n" +
                                        "119668\n" +
                                        "79449\n" +
                                        "98890\n" +
                                        "64512\n" +
                                        "104946\n" +
                                        "126345\n" +
                                        "128346\n" +
                                        "112212\n" +
                                        "135582\n" +
                                        "108214\n" +
                                        "111077\n" +
                                        "75745\n" +
                                        "125934\n" +
                                        "52956\n" +
                                        "102036\n" +
                                        "108452\n" +
                                        "129232\n" +
                                        "97091\n" +
                                        "106975\n" +
                                        "92156\n" +
                                        "145892\n" +
                                        "66680\n" +
                                        "88452\n" +
                                        "75081\n" +
                                        "102811";
}
