package commandPattern;

public class DeskLamp implements PowerSwitchable, Incrementable, Decrementable, ContinuousControl {
    public String switchOn() {
        return "Desk Lamp is switched-on!";
    }

    public String switchOff(){
        return "Desk Lamp is switched-off.";
    }

    public String increment() {
        return "Desk Lamp is changed to the next color.";
    }

    public String decrement(){
        return "Desk Lamp is changed to the previous color.";
    }

    //Continous Controls
    public String setContValue(int value) {
        return "Desk Lamp's brightness is set to "+value + ".";
    }
}
