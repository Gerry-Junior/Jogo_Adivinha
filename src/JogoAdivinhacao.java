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

        boolean jogadorUmEstaCerto= false;
        boolean jogadorDoisEstaCerto = false;
        boolean jogadorTresEstaCerto = false;

        int palpiteNumero = (int)(Math.random()*10);// multiplica os numero ate 10 para verificar o palpite da maquina
        System.out.println("Estou pensando em um numero de 0 a 9...");

        while (true){
            System.out.println("O numero que estou adivinhando é " + palpiteNumero);
            jogadorUm.jogador();
            jogadorDois.jogador();
            jogadorTres.jogador();

            jogadorP1 = jogadorUm.numero;
            System.out.println("O jogador um forneceu o palpite " + jogadorUmEstaCerto );
            jogadorP2 = jogadorDois.numero;
            System.out.println("O jogador dois forneceu o palpite " + jogadorDoisEstaCerto);
            jogadorP3 = jogadorTres.numero;
            System.out.println("O jogador tres forneceu o palpite " + jogadorTresEstaCerto);

            if (jogadorP1 == palpiteNumero){
                jogadorUmEstaCerto = true;
            }
            if (jogadorP2 == palpiteNumero){
                jogadorDoisEstaCerto = true;
            }
            if (jogadorP3 == palpiteNumero){
                jogadorTresEstaCerto = true;
            }

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
