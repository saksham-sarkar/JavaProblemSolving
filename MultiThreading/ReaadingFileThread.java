package MultiThreading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaadingFileThread extends Thread{
    @Override
    public void run(){
        String line=null;
        try(BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\saksh\\Downloads\\ss_resume.pdf")))){
            while((line = br.readLine())!=null) {
                System.out.println(Thread.currentThread().getName() + " reading " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
