package cursoBr.heranca;

public class Galinha extends Animal{

    public void Galinha(){
        this.setTipo("Mamíferos");

    }
    // método que imprime o som da galinha
    @Override
    public void som(){
        System.out.println("Cocoricó!");
    }
}
