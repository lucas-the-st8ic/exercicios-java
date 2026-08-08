void main(String[] args) {
    makeTags("i", "Yay"); //→ "<i>Yay</i>"
    makeTags("i", "Hello"); //→ "<i>Hello</i>"
    makeTags("cite", "Yay"); //→ "<cite>Yay</cite>"
}

public String makeTags(String tag, String word) {
    return "<" + tag + ">" + word + "</" + tag + ">";
}