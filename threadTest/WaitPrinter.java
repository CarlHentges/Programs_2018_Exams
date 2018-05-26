public class WaitPrinter extends Thread{
    WaitPrinter waitFor;
    Boolean canPrint = false;
    WaitPrinter(String name){
        super.setName(name);
    }

    public void setWaitFor(WaitPrinter thread){
        waitFor = thread;
    }

    public void setCanPrint(Boolean toSet){
        canPrint = toSet;
    }

    synchronized private void print(){
        while (!canPrint){
            try{
                System.out.println("entering Wait " + getName());
//                Main.wait();
            }catch(Exception e){System.out.println("ERROR: " + getName());}
        }
        System.out.println("Hello World! " + this.getName() );
        canPrint = false;
        waitFor.setCanPrint(true);
        waitFor.notify();
    }


    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
//            try {
            print();
//            }catch (InterruptedException e) { System.out.println("exception waiting");}
        }
    }
}
