
public class Main {

    public static void main(String[] args) {


        Rato rato = new Rato(10, "jerry");

        Gato gato = new Gato(7, "tom");
        gato.cacar((Presa) rato);

        Cachorro cachorro = new Cachorro(8, "buldogue");
        cachorro.cacar(gato);

        cachorro.cacar(rato);




    }
}