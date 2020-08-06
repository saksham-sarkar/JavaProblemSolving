package MultiThreading;

public class MainMulti {

    public static void main(String args[]){
        ReaadingFileThread thread1 = new ReaadingFileThread();
        ReaadingFileThread thread2 = new ReaadingFileThread();
        ReaadingFileThread thread3 = new ReaadingFileThread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
