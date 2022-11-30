import java.util.Random;

public class GeradorCartas {
    private String[] clan = {"A","B","C","D"};
    private String[] nivel = {"e","d","c","b","a","s"};
    private String[] tipo = {"pedra","papel","tesoura"};
    Random n = new Random();
    Random t = new Random();
    Random a = new Random();
    Random c = new Random();
    private Carta[] baralho = new Carta[56];
    public void GeraBaralho(){
        for(int i = 0;i<56;i++){
           this.baralho[i] = new Carta("carta "+i+clan[c.nextInt(4)],tipo[t.nextInt(3)],nivel[n.nextInt(6)]);
        }
    }
    public Carta[] getBaralho(){
        return this.baralho;
    }
}
