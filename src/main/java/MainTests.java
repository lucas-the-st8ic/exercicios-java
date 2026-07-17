import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTests {
    void main(String[] args) {
        int n = 4;
        String string = "Kitten";

        for (int i = 0; i < string.length(); i++) {
            System.out.print(i);

        }
        System.out.println();
        System.out.print(string+"\n");

        String substring = string.substring(0, n + 1);
        System.out.println(substring);
        System.out.println();
        in1020(10, 25);
        in1020(21, 12);
        in1020(12, 99);
        in1020(8, 99);

        System.out.println("Abc".indexOf('x'));
        squareDigits(9119);

        System.out.println(getCount("aeiou"));
    }


    boolean doubleX(String string) {
        String doubleX = string.substring(string.indexOf('x'), string.indexOf('x') + 2);
        boolean isDoubleX = doubleX.equals("xx");
        System.out.println(isDoubleX);
        return isDoubleX;
    }

    public boolean in1020(int num_1, int num_2) {

       boolean result = (num_1 >= 10 && num_1 <= 20) ||
                (num_2 >= 10 && num_2 <= 20);
        System.out.println(result);
        return result;
    }

    public int squareDigits(int num) {
        List<String> stringNums = Arrays.asList(String.valueOf(num).split(""));

        List<Integer> numbers = new ArrayList<>();
        for (String stringNum : stringNums) {
            numbers.add(Integer.valueOf(stringNum));
        }

        System.out.println(numbers);
        int numeroFinal = numbers.stream()
                .map(n -> n * n)
                .map(r ->String.valueOf(r.intValue()))
                .collect(java.util.stream.Collectors.joining())
                .transform(Integer::parseInt);

        System.out.println(numeroFinal);

        return numeroFinal;
    }

    public static int getCount(String string) {
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }
        }

        return count;
    }

}
