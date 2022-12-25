package behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier(3);
        Notifier smsNotifier = new SmsNotifier(4);

        emailNotifier.setNextNotifier(smsNotifier);

        emailNotifier.notifyManager("This is from email",5);

    }
}
