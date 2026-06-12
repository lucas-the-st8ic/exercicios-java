
void main(String[] args) {
   mixStart("mix snacks");
   mixStart("Pix snacks");
   mixStart("piz snacks");
   mixStart("pi");
}

public boolean mixStart(String string) {

    if (string.length() >= 3  && string.substring(1,3).equalsIgnoreCase("ix")) {
        System.out.println(true);
        return true;
    }
    if (string.length() <= 1) {
        System.out.println(false);
        return false;
    }
    System.out.println(false);
    return false;
}
