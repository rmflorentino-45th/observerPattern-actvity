package observerPattern;

public interface NewsAgency {
    public void add(Subscriber subscriber);
    public void remove(Subscriber subscriber);
    public String notifySub();
} 