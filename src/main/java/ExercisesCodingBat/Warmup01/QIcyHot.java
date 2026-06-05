/*
Given two temperatures, return true if one is less than 0
and the other is greater than 100.

Dadas duas temperaturas, retorne verdadeiro se uma for menor que 0
e a outra for maior que 100.

icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
*/

void main(String[] args) {
    icyHot(120, -1);
    icyHot(-1, 101);
    icyHot(2, 120);

}

/*
CodingBat solution:
    public boolean icyHot(int temp1, int temp2) {
      if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
        return true;
      } else {
        return false;
      }
      // Could be written as: return ((temp1 < 0 && ...));
    }
*/
public boolean icyHot(int temp1, int temp2) {
    if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0) ) {
        return true;
    }
    return false;
}