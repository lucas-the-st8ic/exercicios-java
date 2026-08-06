void main(String[] args) {
    helloName("Bob"); //→ "Hello Bob!"
    helloName("Alice"); //→ "Hello Alice!"
    helloName("X"); //→ "Hello X!"
}

public String helloName(String name) {
    return "Hello" + name + "!";
}
