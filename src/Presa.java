public interface Presa {

    default boolean fugir(Predador predador) {

        if (((Animal) this).getVelocidade() >= ((Animal) predador).getVelocidade()) {
            System.out.println("O " +((Animal) this).getNome() + " fugiu" );
            return true;
        }

        System.out.println("O " +((Animal) this).getNome() + " foi pego");
        return false;


    }
}
