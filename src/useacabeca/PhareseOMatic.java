package useacabeca;

/*
O programa cria três listas de palavras e, em seguida, seleciona aleatoriamente
uma palavra de cada uma das três listas e exibe o resultado.
*/

public class PhareseOMatic {

    public static void main(String[] args) {
        
        // crie três conjuntos de palavras onde será feita a seleção        
        String[] wordListOne = {
            "24/7", "varias camadas", "30.000 pés",
            "B-to-B", "todos ganham", "front-end", "baseado na Web", "difundido",
            "inteligente", "seis sigma", "caminho crítico", "dinâmico"
        };

        String[] wordListTwo = {
            "habilitado", "adesivo", "valor agregado",
            "orientado", "central", "distribuído", "agrupado", "em rede", "dedicado",
            "alavancado", "alinhado", "destinado", "compartilhado", "cooperativo", "acelerado"
        };

        String[] wordListThree = {
            "processo", "ponto máximo", "solução", "arquitetura", "habilitação no núcleo",
            "estratégia", "mindshare", "portal", "espaço", "visão", "paradigma", "missão"
        };

        // descubra quantas palavras existem em cada lista
        int onLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //gere três números aleatórios
        int rand1 = (int) (Math.random() * onLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // agora construa uma frase
        String phrase = wordListOne[rand1] + " "
                + wordListTwo[rand2] + " " + wordListThree[rand3];

        //exiba a frase
        System.out.println("Precisamos de " + phrase);
    }

}
