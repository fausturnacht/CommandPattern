package commandPattern;

public class Increment implements Command {
    private final Incrementable device;
    public Increment(Incrementable device){
        this.device = device;
    }

    @Override
    public String execute() {
        return device.increment();
    }
}