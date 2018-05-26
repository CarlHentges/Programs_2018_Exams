package OneAtATime;

public class Bridge{
    boolean westbound = false;
    public synchronized void cross(Vehicle v){
        System.out.println(v + "entering the bridge");
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(v + "leaving bridge");
    }
}
