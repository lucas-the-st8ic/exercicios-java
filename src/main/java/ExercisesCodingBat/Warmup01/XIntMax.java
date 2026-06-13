void main(String[] args) {

}

public int intMax(int num_1, int num_2, int num_3) {
    int largestNumber = num_1;

    if (largestNumber < num_2) {
        largestNumber = num_2;
    }
    if (largestNumber < num_3) {
        largestNumber = num_3;
    }

    return largestNumber;
}

public int intMax2(int num_1, int num_2, int num_3) {
    int largestNumber = Math.max(num_1, num_2);
    largestNumber = Math.max(largestNumber, num_3);

    return largestNumber;
}