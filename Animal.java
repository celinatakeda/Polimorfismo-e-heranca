package cursoBr.heranca;

public class Animal {

    // variável destinada ao tipo de animal (mamífero/répteis/aves/insetos...
    private String tipo;
    // variável destinada ao nome
    private String nome;

    // getter and setter tipo
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo (String tipo) {
        this.tipo = tipo;
    }
    // getter and setter nome
    public String getNome(){
        return this.nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    // método que imprime no console o som do animal
    public void som(){
        System.out.println("Au au!");
    }

}
