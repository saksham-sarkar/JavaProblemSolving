public class SingletonExample {
    public static void main(String args[]){
        try {
            new SingletonInstance();
            new SingletonInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
       try {
           new ChildInstance();
           new ChildInstance();
       }
       catch (Exception e) {
           e.printStackTrace();
       }
    }
}

class SingletonInstance{
    private static int count = 0;
    public SingletonInstance() throws Exception {
        if(count == 0){
            count++;
            System.out.println("Initialized first time");
        }
        else {
            throw new Exception("You can initialize singleton class only once!!");
        }
    }
    }

class ChildInstance extends SingletonInstance {

    public ChildInstance() throws Exception {
    }
}
