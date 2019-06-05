package rocks.zipcode;

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
       Calculate engine = new Calculate();

        String args2 = String.join(" ", args);
        engine.run(args2);
    }
}
