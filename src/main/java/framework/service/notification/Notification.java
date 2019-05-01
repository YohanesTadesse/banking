package framework.service.notification;


public abstract class Notification implements Observer {
    private String description;

    public Notification(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
