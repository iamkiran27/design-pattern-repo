package MediatorDP;

public class MajorCommander implements  Command{

    private  AirCommuninationMediator airCommuninationMediator;

    public MajorCommander(AirCommuninationMediator airCommuninationMediator) {
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
        if (airCommuninationMediator.isDeviceOnHold()){
            airCommuninationMediator.recieveMessage("Major Recieving message from letuinant....");
            airCommuninationMediator.setDeviceOnHold(false);

        }

    }
}
