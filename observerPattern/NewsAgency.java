package observerPattern;
import java.util.List;

public class NewsAgency implements NewsInterface {

    private List<Subscriber> subscriberList;


    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override 
    public void add(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override 
    public void remove(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override 
    public String notifySub() {
        String output = new String();
        for(Subscriber subscriber : subscriberList) {
            output +=  "Hey, " + subscriber.getSubscriberName() + "!\n";
            output += "Here's the current news about the Iran war..... Click here for the whole article!\n\n";
        }
        return output;
    }

}