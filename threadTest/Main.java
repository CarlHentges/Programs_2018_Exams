public class Main {
    public static void main(String[] args) {
        ThreadPrinter a = new ThreadPrinter("T1");
        ThreadPrinter b = new ThreadPrinter("T2");

//        WaitPrinter a = new WaitPrinter("W1");
//        WaitPrinter b = new WaitPrinter("W2");

        a.setWaitFor(b);

        b.setWaitFor(a);

        a.setCanPrint(true);
        b.start();
        a.start();
//        try {
//            a.join();
//        }catch (InterruptedException e){System.out.println("interrupted exception");}

    }
}
