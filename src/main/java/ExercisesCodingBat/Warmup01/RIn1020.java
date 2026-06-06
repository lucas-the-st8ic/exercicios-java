
/*

Given 2 int values, return true if either of them is
in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
*/
void main(String[] args) {
    in1020(8, 21);
}

/*CodingBat solution:
    public boolean in1020(int a, int b) {
      return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }
*/

public boolean in1020(int num_1, int num_2) {
    if((num_1 >= 10 && num_1 <= 20) ||
            (num_2 >=10 && num_2 <= 20)) {
        return true;
    }
    return false;
}
