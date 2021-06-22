package cursoBr.heranca;

public class Main {
    public static void main(String[] args) {
        System.out.println("O som dos animais!");

        Gato gato = new Gato();
        System.out.print("O gato faz: ");
        gato.som();

        Galinha galinha = new Galinha();
        System.out.print("A galinha faz: ");
        galinha.som();

        Sapo sapo = new Sapo();
        System.out.print("O sapo faz: ");
        sapo.som();
    }
}
