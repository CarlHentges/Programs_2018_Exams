package TwoAtATime;

public class Bridge{
    boolean westbound = false;
    int carCount = 0;
    public synchronized void enterBridge(Vehicle v) {
        while ((v.getWestbound() != westbound && carCount > 0) ||
                (!v.getWestbound() && carCount > 2) ||
                (v.getWestbound() && carCount > 0)){

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        westbound = v.getWestbound();
        ++carCount;
        System.out.println(v + "entering the bridge");
    }

    public void crossBridge(){
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized void exitBridge(Vehicle v){
        --carCount;
        System.out.println(v + "exiting the bridge" );
        notifyAll();
    }
}

