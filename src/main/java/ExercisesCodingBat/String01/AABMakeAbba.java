void main(String[] args) {
    makeAbba("Hi", "Bye"); //→ "HiByeByeHi"
    makeAbba("Yo", "Alice"); //→ "YoAliceAliceYo"
    makeAbba("What", "Up"); //→ "WhatUpUpWhat"
}

public String makeAbba(String a, String b) {
    String abba = a + b + b + a;

    System.out.println(abba);
    return abba;
}
