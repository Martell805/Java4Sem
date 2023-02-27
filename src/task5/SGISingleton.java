package task5;

public class SGISingleton {
    private final static SGISingleton instance = new SGISingleton();

    public synchronized SGISingleton getInstance() {
        return instance;
    }
}
