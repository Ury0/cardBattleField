import java.util.Random;
public class Jogador {
    private String nome;
    private String cpf;
    private double pontos;

    private Carta[] baralho = new Carta[56];
    private Carta[] mao = new Carta[6];
    

    public Jogador(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.pontos=0;
    }
    public void setBaralho(Carta[] baralho) {
        this.baralho = baralho;
    }
    public void setMao() {
        Random n = new Random();
        for(int i = 0;i<6;i++){
            mao[i]= baralho[n.nextInt(56)];
        }
        
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }public void setPontos(double pontos) {
        this.pontos += pontos;
    }
    public Carta[] getBaralho() {
        return baralho;
    }
    public Carta[] getMao(){
        return mao;
    }
    public Carta getCarta(int i) {
        return mao[i];
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public double getPontos() {
        return pontos;
    }
}
