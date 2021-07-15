package mediator.clients;

public class Engine {

    private boolean isStarted = false;

    public void start() {
        isStarted = true;
        System.out.println("Engine was started. Wroom wroom........");
    }

    public void stop() {
        isStarted = false;
        System.out.println("......Engine was stopped");
    }

    public boolean isStarted() {
        return isStarted;
    }

}
