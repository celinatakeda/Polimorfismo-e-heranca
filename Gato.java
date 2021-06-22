package cursoBr.heranca;

public class Gato extends Animal {

    public void Gato(){
        this.setTipo("Mamíferos");

    }
    // método que imprime o som da galinha
    @Override
    public void som(){
        System.out.println("Miau!");
    }
}
