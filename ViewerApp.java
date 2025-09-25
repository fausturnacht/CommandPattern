package commandPattern;
import java.util.Scanner;

public class ViewerApp {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Terminal
        while(true){
            int functionChoice;
            int deviceChoice;

            System.out.print("""
                    
                    Input the number of the corresponding device you'd like to control:\s
                    1. TV
                    2. Music Player
                    3. Air Conditioner
                    4. Desk Lamp
                    5. Exit
                    
                    Enter the number:\s""");

            try{
                deviceChoice = Integer.parseInt(scanner.nextLine());
            }
            catch(Exception e){
                System.out.println("Invalid input. Please try again.");
                continue;
            }

            if(deviceChoice == 5) break;

            RemoteControl rc = new RemoteControl();
            Object device;

            switch(deviceChoice){
                case 1 -> device = new Television();
                case 2 -> device = new MusicPlayer();
                case 3 -> device = new AirConditioner();
                case 4 -> device = new DeskLamp();
                default -> {
                    System.out.println("Invalid input. Please try again.");
                    continue;
                }
            }

            while(true){
                //input function number on the terminal

                System.out.print("""
                        
                        What remote function would you like to execute with this device?
                        1. Switch on
                        2. Switch off
                        3. Increment
                        4. Decrement
                        5. Set Value
                        6. Return to Device Selection
                        
                        Enter the number:\s""");

                try{
                    functionChoice = Integer.parseInt(scanner.nextLine());
                }
                catch(Exception e){
                    System.out.println("Invalid input. Please try again.");
                    continue;
                }

                if(functionChoice == 6) break;

                switch (functionChoice){
                    case 1:
                        rc.setCommand(new PowerOn((PowerSwitchable) device));
                        System.out.println(rc.clickButton());
                        break;
                    case 2:
                        rc.setCommand(new PowerOff((PowerSwitchable) device));
                        System.out.println(rc.clickButton());
                        break;
                    case 3:
                        rc.setCommand(new Increment((Incrementable) device));
                        System.out.println(rc.clickButton());
                        break;
                    case 4:
                        rc.setCommand(new Decrement((Decrementable) device));
                        System.out.println(rc.clickButton());
                        break;
                    case 5:
                        System.out.print("Enter the value to set on Device: ");
                        int inputValue;
                            try{
                                inputValue = Integer.parseInt(scanner.nextLine());
                            }
                            catch(Exception e) {
                                System.out.println("Invalid input. Please try again.");
                                break;
                            }
                        rc.setCommand(new SetContValue((ContinuousControl) device, inputValue));
                        System.out.println(rc.clickButton());
                        break;
                    default:
                        System.out.println("Invalid input. Please try again.");
                        break;
                }
            }
        }
    }
}
