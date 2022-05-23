package CommandDP;

public class DecreaseVolumeCommand implements  Command {
  private  TV tv;

    public DecreaseVolumeCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
tv.decreaseVolume();
    }
}
