package ExercisesCodeWars.Kyu7.ch4ng3;

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
                case 'L':
                    string = string.replace(string.charAt(i), '1');
                    break;
                default:
            }
        }
        System.out.println(string);
        return string;
    }
}

//Me explique prq sem o break o código dá errado.
