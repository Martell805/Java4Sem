package task5;

public class GISingleton {
    private GISingleton instance;

    public synchronized GISingleton getInstance() {
        if(instance == null) {
            instance = new GISingleton();
        }

        return instance;
    }
}
