package cursoBr.heranca;

public class Sapo extends Animal{

    public void Sapo(){
        this.setTipo("Mamíferos");

    }
    // método que imprime o som da galinha
    @Override
    public void som(){
        System.out.println("Frog!");
    }

}
