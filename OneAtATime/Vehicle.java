package OneAtATime;

public class Vehicle extends Thread{
    Bridge bridge;
    String name;
    boolean westbound;
    public Vehicle (Bridge toCross, Boolean west, String n){
        bridge = toCross;
        westbound = west;
        name = n;
    }

    @Override
    public void run() {
        bridge.cross(this);
    }
    public String toString(){
        String dir = "west ";
        if(!westbound){
            dir = "east ";
        }
        return name + " going " + dir;
    }
}
