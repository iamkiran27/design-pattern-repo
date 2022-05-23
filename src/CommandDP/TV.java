package CommandDP;

public class TV {
    private int channelNumber;
    private int tvVolume;

    public TV() {
        this.channelNumber = 1;
        this.tvVolume = 0;
    }

    public void switchChannel(int channelNumber){
        this.channelNumber=channelNumber;
        System.out.println("switched to channel number : "+this.channelNumber);
    }
    public void increaseVolume(){
        if(this.tvVolume<100)
            this.tvVolume++;
        System.out.println("Volume : "+this.tvVolume);
    }
    public void decreaseVolume(){
        if(this.tvVolume>0)
            this.tvVolume--;
        System.out.println("Volume : "+this.tvVolume);
    }
}
