

void main(String[] args) {
    hasTeen(13, 20, 10);
    hasTeen(20, 19, 10);
    hasTeen(15, 19, 28);
}

public boolean hasTeen(int a, int b, int c) {
    boolean result = ((a >= 13 && a <= 19) || (b > 13 && b <= 19) || (c >= 13 && c <= 19));
    System.out.println(result);
    return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));

}
