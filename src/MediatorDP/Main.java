package MediatorDP;

public class Main {
    public static void main(String[] args) {
        AirCommuninationMediator airCommuninationMediator = new WalkyTalkyMediator();
        MajorCommander majorCommander = new MajorCommander(airCommuninationMediator);
        Leitunant leitunant = new Leitunant(airCommuninationMediator);
        leitunant.sendMessage("Major what's my call ? Over and Out..");
        majorCommander.recieveMessage();
        majorCommander.sendMessage("Leitunant, enemies ahead !! Hold your position and be ready to execute fire ....");
        leitunant.recieveMessage();

    }
}
