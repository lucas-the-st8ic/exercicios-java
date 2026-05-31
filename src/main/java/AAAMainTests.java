public class AAAMainTests {
    static void main(String[] args) {
        int n = 4;
        String string = "Kitten";

        for (int i = 0; i < string.length(); i++) {
            System.out.print(i);

        }
        System.out.println();
        System.out.print(string+"\n");

        String substring = string.substring(0, n + 1);
        System.out.println(substring);
    }
}
