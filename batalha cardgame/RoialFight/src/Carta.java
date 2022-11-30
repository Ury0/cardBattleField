public class Carta{
    String nome;
    String tipo;
    String nivel;

    public Carta(){
    }
    public Carta(String nome, String tipo, String nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
    }
    public String getNome(){
        return this.nome;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getNivel(){
        return this.nivel;
    }
}