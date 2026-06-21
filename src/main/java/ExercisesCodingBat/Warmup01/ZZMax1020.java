void main(String[] args) {
    max1020(11, 19);
    max1020(19, 11);
    max1020(11, 9);
}

public int max1020(int num_1, int num_2) {
    if (((num_1 >= 10) || (num_1 <= 20)) ||
            ((num_2 >= 10) || (num_2 <= 20))) {
        return Math.max(num_1, num_2);
    }
    return 0;
}