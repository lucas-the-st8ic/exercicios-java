import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MainTests {
    void main(String[] args) {
/*        int n = 4;
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

        nerdify("Fundamentals");*/
    /*    String banana = "Banana";

        int num = 123;
        String numToString = "";
        numToString.valueOf(num);
        System.out.println(num);
        System.out.println(numToString);*/

        /*isPalindrome(121);*/
        romanToInt("XXVII");
    }


        private static final Map<String, Integer> NUMERAIS_ROMANOS = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000);

        public int romanToInt(String s) {
            s.split("");
            System.out.println(s);
            return 0;
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
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                default:
                    break;
            }
        }
        return count;
    }

    public static String nerdify(String string){
        for (int i = 0; i < string.length(); i++) {
            switch(string.charAt(i)){
                case 'a':
                case 'A':
                    string = string.replace(string.charAt(i), '4');
                    break;
                case 'e':
                case 'E':
                    string = string.replace(string.charAt(i), '3');
                    break;
                case 'l':
                case 'L':
                    string = string.replace(string.charAt(i), '1');
                    break;
                default:
            }
        }
        System.out.println(string);
        return string;
    }

    public boolean isPalindrome(int x) {
        String intToString = String.valueOf(x);
        String revIntToString = "";
        for (int i = intToString.length() - 1; i >= 0; i--) {
            revIntToString += intToString.charAt(i);
        }
        return revIntToString.equals(intToString);

    }
}

