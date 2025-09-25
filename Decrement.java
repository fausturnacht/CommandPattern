package commandPattern;

public class Decrement implements Command {
    private final Decrementable device;
    public Decrement(Decrementable device){
        this.device = device;
    }

    @Override
    public String execute() {
        return device.decrement();
    }
}