void main(String[] args) {
    close10(8, 13);
    close10(13, 8);
    close10(13, 7);
}

public int close10(int num_1, int num_2) {

    int closeTo10 = 0;

    if ((Math.abs(num_1 - 10)) == (Math.abs(num_2 - 10))){
        System.out.println(closeTo10);
        return closeTo10;
    } else {
        closeTo10 = (Math.abs(num_1 - 10)) < (Math.abs(num_2 - 10)) ? num_1 : num_2;

    }

    System.out.println(closeTo10);
    return closeTo10;
}
