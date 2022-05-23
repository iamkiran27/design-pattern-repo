package MediatorDP;

public interface AirCommuninationMediator {
    void sendMessage(String message);
    void recieveMessage( String message);
    boolean isDeviceOnHold( );
void  setDeviceOnHold(boolean onHold);
    void registerMajor(MajorCommander majorCommander);
    void registerLeitunant(Leitunant leitunant);
}
