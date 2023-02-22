public class Environment {
    private Series generator;
    private Integer round;

    public Environment(Series generator) {
        this.generator = generator;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public void run() {
        for (int i = 0; i < round; i++) {
            generator.isHasNextStep();
            System.out.println(generator.nextStep());
        }

    }
}
