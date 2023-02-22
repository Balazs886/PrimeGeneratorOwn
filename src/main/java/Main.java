public class Main {

    public static void main(String[] args) {


        Series series = new PrimeGenerator();
        Environment environment = new Environment(series);

        environment.setRound(10);
        environment.run();

    }
}
