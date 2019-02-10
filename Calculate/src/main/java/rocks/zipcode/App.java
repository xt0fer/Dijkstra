package rocks.zipcode;

import main.java.rocks.zipcode.Calculate;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        main.java.rocks.zipcode.Calculate engine = new Calculate();

        String[] args2 = args;
        engine.run(args2);
    }
}
