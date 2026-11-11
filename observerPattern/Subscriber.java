package observerPattern;

public class Subscriber {

    private String subscriberName;


    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override 
    public void updateSubscriber(News news) {

    }

}