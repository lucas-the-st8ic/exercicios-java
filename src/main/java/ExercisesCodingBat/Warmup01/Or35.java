void main(String[] args) {
    or35(3);
    or35(10);
    or35(8);
}


//My Solutions:
public boolean or35(int n) {
    return n % 3 == 0 || n % 5 == 0 ? true : false;
}
/*
public boolean or35(int n) {
    if(n % 3 == 0 || n % 5 == 0) {
        System.out.println(true);
        return true;
    }

    System.out.println(false);
    return false;
}*/
