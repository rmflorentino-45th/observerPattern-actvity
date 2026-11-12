package observerPattern;

public interface NewsInterface {
    public void add(Subscriber subscriber);
    public void remove(Subscriber subscriber);
    public String notifySub();
} 