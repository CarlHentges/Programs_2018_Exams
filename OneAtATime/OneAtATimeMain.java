package OneAtATime;

public class OneAtATimeMain {
    public static void main(String[] args){
        Bridge b = new Bridge();
        boolean dir = false;
        for (int i = 0; i < 5; i++){
            Thread t = new Vehicle(b,dir,"car "+i);
            t.start();
            dir = !dir;
        }
    }
}