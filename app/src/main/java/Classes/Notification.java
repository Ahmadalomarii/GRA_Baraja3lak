package Classes;

public class Notification {
    String to;
    String subject;
    String details;

    public Notification(String to, String subject, String details) {
        this.to = to;
        this.subject = subject;
        this.details = details;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
