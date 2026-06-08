void main(String[] args) {
    loneTeen(13, 99);
    loneTeen(21, 99);
    loneTeen(99, 13);
    loneTeen(13, 13);
    loneTeen(19, 19);
    loneTeen(12, 13);
    loneTeen(19, 20);
}

public boolean loneTeen(int num_1, int num_2) {

    return num_1 >= 13 && num_1 <= 19 ||
            num_2 >= 13 && num_2 <= 19 ||
                    (num_1 >= 13 && num_1 <= 19) ||
            num_2 >= 13 && num_2 <= 19;
}
