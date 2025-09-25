package commandPattern;

public class SetContValue implements Command {
    private final ContinuousControl device;
    private final int value;
    public SetContValue(ContinuousControl device, int value) {
        this.device = device;
        this.value = value;
    }
    @Override public String execute() { return device.setContValue(value); }
}