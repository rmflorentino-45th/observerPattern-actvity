package observerPattern;

public class NewsAgency implements NewsAgencySub {

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
        for(Client client : clientList) {
            output +=  "Hey, " + client.getClientName() + "!\n";
            output += stockName + " has a current price of " + stockPrice +"!\n\n";
        }
        return output;
    }

}