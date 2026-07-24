package ExercisesCodeWars.Kyu8.ch4ng3;

public class Nerd {
//Depurar e verificar se o código está limpo e verificar uma possível solução com Regex
    public static String nerdify(String string){
        for (int i = 0; i < string.length(); i++) {
            switch(string.charAt(i)){
                case 'a':
                case 'A':
                    string = string.replace(string.charAt(i), '4');
                    break;
                case 'e':
                case 'E':
                     string = string.replace(string.charAt(i), '3');
                    break;
                case 'l':
                    string = string.replace(string.charAt(i), '1');
                    break;
                default:
            }
        }
        System.out.println(string);
        return string;
    }
//Solução que segue mais diretrizes de código limpo feita por mim sem ajuda.
    public static String nerdify2(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)){
                case 'a':
                case 'A':
                    result += '4';
                    break;
                case 'e':
                case 'E':
                    result += '3';
                    break;
                    case 'l':
                    result += '1';
                    break;
                default:
                    result += string.charAt(i);
            }
        }
        System.out.println(result);
        return result;
    }

    static String nerdifyRegex(String string) {
        return string.replaceAll("[aA]", "4")
                .replaceAll("[eE]", "3").replace("l", "1");
    }
}

//Me explique prq sem o break o código dá errado.
