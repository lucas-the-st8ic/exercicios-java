
public boolean makes10(int a, int b) {
    boolean result = false;

    if ((a == 10 || b == 10) || (a + b == 10)) {
        result = true;
    }
    System.out.println(result);
    return result;
}



void main(String[] args) {
     makes10(4, 6);
}
