package task6.builder;

public class ABPairBuilder implements PairBuilder{
    private final Pair pair = new Pair();

    @Override
    public void buildFirst() {
        pair.setFirst("A");
    }

    @Override
    public void buildSecond() {
        pair.setSecond("B");
    }

    @Override
    public Pair getResult() {
        return pair;
    }
}
