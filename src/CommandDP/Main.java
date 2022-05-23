package CommandDP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        TV tv=new TV();
        Command switchChannel=new SwirtchChannelCommand(tv);
        Command increaseVolume=new IncreaseVolumeCommand(tv);
        Command decreaseVolume=new DecreaseVolumeCommand(tv);
        TvRemote tvRemote=new TvRemote();

        System.out.println("1.Switch Channel");
        System.out.println("2.Increase Volume");
        System.out.println("3.Decrease Volume");
        System.out.println("4.exit");

        while (true){
            System.out.print("Enter choice : ");
            int choice=input.nextInt();
            switch (choice){
                case 1:
                    tvRemote.pressButton(switchChannel);
                    break;
                case 2:
                    tvRemote.pressButton(increaseVolume);
                    break;
                case 3:
                    tvRemote.pressButton(decreaseVolume);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
