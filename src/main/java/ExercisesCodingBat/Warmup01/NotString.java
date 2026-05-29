
public String notString(String string) {
    if (string.equalsIgnoreCase("not")){
        return string;
    } else {
        return "not ".concat(string);
    }
}



void  main(String[] args) {
    notString("candy");
}
