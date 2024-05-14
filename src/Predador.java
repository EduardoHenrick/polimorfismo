public interface Predador {

    default boolean cacar(Presa presa) {

        return !presa.fugir(this);

    }



}
