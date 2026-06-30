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
    }



    public boolean in1020(int num_1, int num_2) {

       boolean result = (num_1 >= 10 && num_1 <= 20) ||
                (num_2 >= 10 && num_2 <= 20);
        System.out.println(result);
        return result;
    }
}
