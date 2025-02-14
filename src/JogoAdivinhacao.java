public class JogoAdivinhacao   {
    Jogador jogadorUm;
    Jogador jogadorDois;
    Jogador jogadorTres;

    void JogoComeca(){
        jogadorUm = new Jogador();
        jogadorDois = new Jogador();
        jogadorTres = new Jogador();

        int jogadorP1;
        int jogadorP2;
        int jogadorP3;
        // primeiramente coloca os palpite do jogador como false antes de verificar
        boolean jogadorUmEstaCerto= false;
        boolean jogadorDoisEstaCerto = false;
        boolean jogadorTresEstaCerto = false;

        int palpiteNumero = (int)(Math.random()*10);// a maquina verifica aleatoriamente os numero de 0 a 9
        System.out.println("Estou pensando em um numero de 0 a 9...");

        //inicio do laço de repetição até verificar se um jogador acertou
        while (true){
            System.out.println("O numero que estou adivinhando é " + palpiteNumero);//palpite da maquina
            // chama a classe Jogador para verificar qual numero os jogadores estão pensando
            jogadorUm.jogador();
            jogadorDois.jogador();
            jogadorTres.jogador();
            //jogadores dão o palpite
            jogadorP1 = jogadorUm.numero;
            System.out.println("O jogador um forneceu o palpite " + jogadorUmEstaCerto );
            jogadorP2 = jogadorDois.numero;
            System.out.println("O jogador dois forneceu o palpite " + jogadorDoisEstaCerto);
            jogadorP3 = jogadorTres.numero;
            System.out.println("O jogador tres forneceu o palpite " + jogadorTresEstaCerto);
            //verifica se o papilte do jogador esta certo
            if (jogadorP1 == palpiteNumero){
                jogadorUmEstaCerto = true;
            }
            if (jogadorP2 == palpiteNumero){
                jogadorDoisEstaCerto = true;
            }
            if (jogadorP3 == palpiteNumero){
                jogadorTresEstaCerto = true;
            }
            // se um jogador acerta o jogo abaca e verifica se cada jogador acertou ou nao
            if (jogadorUmEstaCerto || jogadorDoisEstaCerto || jogadorTresEstaCerto){
                System.out.println("Termo um jogador vencedor!");
                System.out.println("Jogador Um Acertou? " + jogadorUmEstaCerto);
                System.out.println("Jogador Dois Acertou?" + jogadorDoisEstaCerto);
                System.out.println("Jogador Tres Acertou? " + jogadorTresEstaCerto);
                System.out.println("Acabou");
                break;
            }else {
                System.out.println("Os jogadores terão que tentar novamente!");
            }
        }
    }

}
