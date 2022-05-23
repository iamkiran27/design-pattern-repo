package MediatorDP;

public class Leitunant  implements  Command{
    private AirCommuninationMediator airCommuninationMediator;

    public Leitunant(AirCommuninationMediator airCommuninationMediator) {
        this.airCommuninationMediator = airCommuninationMediator;
    }

    @Override
    public void sendMessage(String message) {

        if(!airCommuninationMediator.isDeviceOnHold())
        {

            airCommuninationMediator.sendMessage(message);
            airCommuninationMediator.setDeviceOnHold(true);
        }

    }

    @Override
    public void recieveMessage( ) {
        airCommuninationMediator.recieveMessage("Leitunant recieving message form major");
        airCommuninationMediator.setDeviceOnHold(false);
    }
}
