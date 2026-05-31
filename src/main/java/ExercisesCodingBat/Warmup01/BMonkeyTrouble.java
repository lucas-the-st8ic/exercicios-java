
/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.*/

/* Coding Bat Solution:
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if (aSmile && bSmile) {
    return true;
  }
  if (!aSmile && !bSmile) {
    return true;
  }*/

public boolean monkeyTrouble(boolean aSmile, boolean bSmile){
    boolean trouble = false;

    if(aSmile && bSmile || !aSmile && !bSmile) {
        trouble = true;
    }
    return trouble;
}
// O código acima pode ser abreviado para:
// return ((aSmile && bSmile) || (!aSmile && !bSmile));

// Ou esta versão bem curta (pense em como ela é semelhante à anterior)
// return (aSmile == bSmile);
//======================================
// The above can be shortened to:
//   return ((aSmile && bSmile) || (!aSmile && !bSmile));
// Or this very short version (think about how this is the same as the above)
//return (aSmile == bSmile);
void main() {
    monkeyTrouble(true, false);
}
