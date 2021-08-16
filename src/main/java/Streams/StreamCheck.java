package Streams;

import java.util.Arrays;
import java.util.List;

public class StreamCheck {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    int result=0;

    for (int i:numbers){
      if (i% 2 ==0){
        result +=i*2;
      }
    }

    System.out.println(result);
     numbers.stream()
             .filter(e->e %2==0)
             .mapToInt(e->e*2)
             .sum();

    System.out.println(
    numbers.stream()
            .filter(e->e %2==0)
            .map (e->e *2)
            .reduce (0,Integer::sum)
    );



  }
}
