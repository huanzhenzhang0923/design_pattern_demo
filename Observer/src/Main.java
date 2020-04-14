import interfaces.Observer;
import model.EmailTopic;
import model.EmailTopicSubscriber;

public class Main {
    public static void main(String[] args) {
        EmailTopic topic=new EmailTopic();
        Observer firstobserver=new EmailTopicSubscriber("First_Observer");
        Observer secondobserver=new EmailTopicSubscriber("Second_Observer");
        Observer thirdobserver=new EmailTopicSubscriber("Third_Observer");

        topic.register(firstobserver);
        topic.register(secondobserver);
        topic.register(thirdobserver);

        firstobserver.setSubject(topic);
        secondobserver.setSubject(topic);
        thirdobserver.setSubject(topic);

        firstobserver.update();

        topic.postMessage("Hello Subscribers");
        topic.unregister(firstobserver);
        topic.postMessage("Hello Subscribers again");
    }
}
