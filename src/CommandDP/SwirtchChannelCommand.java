package CommandDP;

import java.util.Scanner;

public class SwirtchChannelCommand implements  Command {
    private TV tv;

    public SwirtchChannelCommand(TV tv){
        this.tv=tv;
    }
    @Override
    public void execute() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Channel Number : ");
        int channelNumber=input.nextInt();
        tv.switchChannel(channelNumber);
    }
}
