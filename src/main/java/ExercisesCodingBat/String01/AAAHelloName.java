/*Given a string name, e.g. "Bob",
return a greeting of the form "Hello Bob!".

Dada uma string `name`, por exemplo "Bob",
retorne uma saudação no formato "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
*/

void main(String[] args) {
    helloName("Bob"); //→ "Hello Bob!"
    helloName("Alice"); //→ "Hello Alice!"
    helloName("X"); //→ "Hello X!"
}

public String helloName(String name) {
    return "Hello" + name + "!";
}
