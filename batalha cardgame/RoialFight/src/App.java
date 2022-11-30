

public class App {
    public static void main(String[] args) throws Exception {
        GeradorCartas novoBaralho = new GeradorCartas();
        Jogador[] listaJogador = new Jogador[2];
        listaJogador[0] = new Jogador("@@@","000.000.000-00");
        listaJogador[1] = new Jogador("&&&","111.111.111-11");
        novoBaralho.GeraBaralho();
        listaJogador[0].setBaralho(novoBaralho.getBaralho());
        listaJogador[0].setMao();
        novoBaralho.getBaralho();
        listaJogador[1].setBaralho(novoBaralho.getBaralho());
        listaJogador[1].setMao();

        for(int i = 0; i < 6; i++){
            Batalha luta = new Batalha(listaJogador[0].getCarta(i), listaJogador[1].getCarta(i));
            switch(luta.round()){
            case -1:
                System.out.print(" -Derrota-");
            break;
            case 0:
                System.out.print(" -Empate-");
            break;
            case 1:
                System.out.print(" -Vitoria-");
            break;
            }
        }
        
        
        

    }
}
