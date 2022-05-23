package CommandDP;

public class IncreaseVolumeCommand implements Command{
    private  TV tv;

    public IncreaseVolumeCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
tv.increaseVolume();
    }
}
