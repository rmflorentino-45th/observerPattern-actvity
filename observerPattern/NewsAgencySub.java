package observerPattern;

public interface NewsAgencySub {
    public void add(Subscriber sub);
    public void remove(Subscriber sub);
    public String notifySub;
} 