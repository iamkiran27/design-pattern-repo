package MediatorDP;

public class WalkyTalkyMediator implements AirCommuninationMediator{
    private MajorCommander majorCommander;
    private Leitunant leitunant;
    private  boolean onHold = false;

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message : "+ message);
    }

    @Override
    public void recieveMessage( String message) {
        System.out.println(message);

    }

    @Override
    public boolean isDeviceOnHold( ) {
        return this.onHold ;
    }

    @Override
    public void setDeviceOnHold(boolean onHold) {
this.onHold = onHold;
    }

    @Override
    public void registerMajor(MajorCommander majorCommander) {
this.majorCommander = majorCommander;
    }

    @Override
    public void registerLeitunant(Leitunant leitunant) {
        this.leitunant = leitunant;

    }
}
