public class ThreadPrinter extends Thread{
    ThreadPrinter waitFor;
    Boolean canPrint = false;
    ThreadPrinter(String name){
        super.setName(name);
    }

    public void setWaitFor(ThreadPrinter thread){
        waitFor = thread;
    }

    public void setCanPrint(Boolean toSet){
        canPrint = toSet;
    }

    private void print(){
        while (!canPrint){
//            try {
//                this.wait();
//            }catch (InterruptedException e){}
            try{
                Thread.sleep(1);
            }catch(Exception e){}

//            System.out.print(this.getName());
        }
        System.out.println("Hello World! " + this.getName() );
        canPrint = false;
        waitFor.setCanPrint(true);
//        this.yield();
//        this.notifyAll();
//        try {
//            this.sleep(10);
//        }catch (InterruptedException e){}
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
