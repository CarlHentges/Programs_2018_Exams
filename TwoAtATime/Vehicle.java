package TwoAtATime;

public class Vehicle extends Thread{
    Bridge bridge;
    String name;
    boolean westbound;
    public Vehicle (Bridge toCross, Boolean west, String n){
        bridge = toCross;
        westbound = west;
        name = n;
    }

    public boolean getWestbound() {
        return westbound;
    }

    @Override
    public void run() {
        bridge.enterBridge(this);
        bridge.crossBridge();
        bridge.exitBridge(this);
    }
    public String toString(){
        String dir = "west ";
        if(!westbound){
            dir = "east ";
        }
        return name + " going " + dir;
    }
}
