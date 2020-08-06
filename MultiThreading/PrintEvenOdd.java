package MultiThreading;

public class PrintEvenOdd {
    public static void main(String args[]) throws InterruptedException {
        EvenOddCheck eOC = new EvenOddCheck();
        Runnable runnable = new Runnable(){

            @Override
            public void run() {
                eOC.checkEven();
            }
        };
    Runnable runnable2 = new Runnable(){

        @Override
        public void run() {
            eOC.checkOdd();
        }
    };
    Thread t1 = new Thread(runnable);
    Thread t2 = new Thread(runnable2);
    t1.start();
    t2.start();

    t1.join();
    t2.join();
}
}

class EvenOddCheck {
    static int i =1;
    int max=100;
    public void checkEven() {
        synchronized (this) {
            while (i <= max) {
                while (i % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("The number is even " + i);
                i++;
                notify();
            }
        }
    }

    public void checkOdd() {
        while (i < max) {
            synchronized (this) {
                while (i % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("The number is odd " + i);
                i++;
                notify();
            }
        }
    }
}
