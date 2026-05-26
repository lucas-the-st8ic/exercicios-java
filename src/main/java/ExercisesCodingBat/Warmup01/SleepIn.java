
/*The parameter weekday is true
if it is a weekday,
and the parameter vacation is true
if we are on vacation.
We sleep in if it is not
 a weekday or we're on vacation. Return true if we sleep in.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true*/


public boolean sleepIn(boolean weekday, boolean vacation) {
    boolean sleepIn = false;
    if(!weekday || vacation ) {
       sleepIn = true;
    }

    return sleepIn;
}
// Observações sobre a solução: é melhor escrever "vacation" do que "vacation == true"
// embora signifiquem exatamente a mesma coisa.
// Da mesma forma, "!weekday" é melhor do que "weekday == false".
// Tudo isso pode ser resumido para: return (!weekday || vacation);
// Aqui, colocamos o return-false por último, ou poderíamos usar um if/else.

// Solution notes: better to write "vacation" than "vacation == true"
// though they mean exactly the same thing.
// Likewise "!weekday" is better than "weekday == false".
// This all can be shortened to: return (!weekday || vacation);
// Here we just put the return-false last, or could use an if/else.

void main(String[] args) {
    boolean sleepIn = sleepIn(true, false);
    System.out.println(sleepIn);
}
