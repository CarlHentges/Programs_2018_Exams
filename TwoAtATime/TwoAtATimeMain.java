package TwoAtATime;

public class TwoAtATimeMain {
    public static void main(String[] args){
        Bridge b = new Bridge();
        boolean dir = false;
        for (int i = 0; i < 5; i++){
            Thread t = new Vehicle(b,dir,"car "+i);
            t.start();
            dir = !dir;
            try{
                Thread.sleep(70);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}