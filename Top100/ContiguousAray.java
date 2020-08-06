package Top100;

public class ContiguousAray {
    public static void main(String args[]){
        int ar[] = {14, 12, 70, 15, 99, 65, 21, 90};
        int X=97;
        int currSum = 0,start=0,end=0;
        while(start<ar.length-1 && end<=ar.length-1){
            if(currSum==X){
                System.out.print("Start= "+start+" End= "+ (end-1));
                System.out.println();
                if(end<=ar.length-1){
                    currSum+=ar[end];
                    end++;
                }
            }
            else if(currSum>X){
                currSum-=ar[start];
                start++;
            }
            else {
                if(end<=ar.length-1){
                    currSum+=ar[end];
                    end++;
                }
            }
        }
    }
}
