void main(String[] args) {
    loneTeen(13, 99);
    loneTeen(21, 99);
    loneTeen(99, 13);
    loneTeen(13, 13);
    loneTeen(19, 19);
    loneTeen(12, 13);
    loneTeen(19, 20);
}

public boolean loneTeen(int num_1, int num_2) {



    return (((num_1 >= 13 && num_1 <= 19) &&
            (num_2 >= 13 && num_2 <= 19)) ^
            ((num_1 >= 13 && num_1 <= 19) ||
                    (num_2 >= 13 && num_2 <= 19)));
}
/*Que é exatamente o comportamento esperado para "apenas um dos números é teen".

O ponto que eu avaliaria não é a correção, mas a simplicidade.

Quando um avaliador ou outro programador lê:

(A && B) ^ (A || B)

ele precisa parar para raciocinar sobre a tabela verdade.

Já uma expressão que representa diretamente "um é verdadeiro e o outro é falso" comunica a intenção mais claramente.

Então:

✅ Correta logicamente.

⚠️ Menos legível do que poderia ser.

Uma boa prática seria primeiro criar variáveis booleanas:

boolean teen1 = ...
boolean teen2 = ...

e então construir a condição usando esses nomes. Isso torna o código muito mais fácil de entender e manter.

Aliás, se esse exercício for do CodingBat, há uma solução extremamente curta usando apenas teen1 e teen2. Você consegue pensar em como usar o operador ^ diretamente nesses dois booleanos? Essa é a simplificação natural da ideia que você acabou de descobrir.

É sim do coding bat

Ótimo. No contexto do CodingBat, sua solução seria considerada correta se passar todos os testes, mas a plataforma costuma incentivar soluções simples e diretas.

Você já chegou ao insight principal:

A = num_1 é teen
B = num_2 é teen

e percebeu que o problema é equivalente a:

"exatamente um dos dois booleanos deve ser verdadeiro"

Essa é justamente a definição do operador XOR (^).

Por isso, quando você escreve uma expressão mais elaborada como:

(A && B) ^ (A || B)

você está fazendo o XOR entre duas expressões que, no fundo, foram derivadas de A e B.

A reflexão que o CodingBat geralmente tenta provocar é:

Se eu já tenho A e B, preciso mesmo calcular (A && B) e (A || B) antes?

Experimente criar duas variáveis booleanas:

boolean teen1 = ...
boolean teen2 = ...

e depois pense:

Qual seria a forma mais direta de expressar "exatamente um deles é verdadeiro"?

Você já descobriu a ferramenta lógica necessária para isso.

Além disso, um detalhe importante para CodingBat: eles normalmente esperam algo próximo de:

return algumaExpressaoBooleana;

em vez de:

boolean result = false;
// ...
return result;

Não porque seu jeito esteja errado, mas porque muitos exercícios da plataforma são feitos para treinar a construção direta de expressões booleanas.

Seu raciocínio está no caminho certo. Você saiu de condições separadas, passou pela tabela verdade e chegou ao XOR — isso é exatamente o tipo de evolução lógica que esses exercícios tentam desenvolver.*/