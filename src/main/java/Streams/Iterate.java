package Streams;

import java.util.stream.Stream;

public class Iterate {

    public static int computeImperativeStyle (int k, int n){
        int result=0;
        int index=k;
        int count =0;
        while (count<n){
            if(index %2 ==0 && Math.sqrt (index )>20){
                result+=index *2;
                count++;
            }
            index++;
        }
        return result;

    }


    public static int computeFunctionalStyle(int k, int n ){
        return Stream.iterate(k, e->e+1)
                .filter(e->e%2==0)
                .filter(e->Math.sqrt(e)>0)
                .mapToInt(e->e*2)
                .limit(n)
                .sum();
    }
  public static void main(String[] args) {
    //
  }
}
