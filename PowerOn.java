package commandPattern;

public class PowerOn implements Command {
    private final PowerSwitchable device;
    public PowerOn(PowerSwitchable device){
        this.device = device;
    }

    @Override
    public String execute() {
        return device.switchOn();
    }
}
