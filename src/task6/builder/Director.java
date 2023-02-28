package task6.builder;

public class Director {
    private final PairBuilder builder;

    public Director(PairBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildFirst();
        builder.buildSecond();
    }


    public PairBuilder getBuilder() {
        return builder;
    }
}
