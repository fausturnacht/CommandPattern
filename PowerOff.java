package commandPattern;

public class PowerOff implements Command {
    private final PowerSwitchable device;
    public PowerOff(PowerSwitchable device){
        this.device = device;
    }

    @Override
    public String execute() {
        return device.switchOff();
    }
}
