package observerPattern;
import java.util.*;

public class MobileApp {

    public static void main(String[] args){
    
        Subscriber john = new Subscriber();
        Subscriber mark = new Subscriber();
        Subscriber ashley = new Subscriber();

        john.setSubscriberName("John");
        mark.setSubscriberName("Mark");
        ashley.setSubscriberName("Ashley");
    

        List<Subscriber> subscriberList = new ArrayList<>();
        subscriberList.add(john);
        subscriberList.add(mark);
        subscriberList.add(ashley);


        News news = new News();
        news.setSubscriberList(subscriberList);

        System.out.println("Sending newsletters to current subscribers... \n");
        System.out.println(news.notifySub());


        news.remove(john);
        Subscriber autumn = new Subscriber();
        autumn.setSubscriberName("Autumn");
        subscriberList.add(autumn);

        System.out.println("\nBreaking News: Updates about the Iran War!");
        System.out.println(news.notifySub());
        
    }

}