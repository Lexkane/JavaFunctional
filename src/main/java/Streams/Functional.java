package Streams;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.atomic.LongAdder;

//exploring functional  streams count new methods
public class Functional {

  public static void main(String[] args) {



      Map<String,List<String> >streamReturingMethodMap = new HashMap<String, List<String>>();
      Set<String> sourceKeySet= streamReturingMethodMap.keySet();
      LongAdder sourceCount= new LongAdder();
      sourceKeySet.stream()
              .forEach(c-> sourceCount
                      .add(streamReturingMethodMap.get(c).size()));





      sourceKeySet.stream(c->streamReturingMethodMap.get(c).size())
              .sum();





      LongAdder newMethodCount= new LongAdder();
      functionalParameterMethodMap.get(c).stream()
              .forEach(m-> {
                  System.out.println(m);
              if( isNewMethod(c,m))
                  newMethodCount.increment();

              });
             return newMethodCount.intValue();


  int count=functionalParameterMethodMap.get(c).stream()
          .mapToInt(m->{
              int newMethod=0;
              System.out.println(m);

              if(isNewMethod(c,m))
                  newMethod=1;
              return newMethod;

          })
          .sum();


  int count=functionalParameterMethodMap.get(nameOfClass)
          .stream()
          .peek(method->System.out.println(method))
          .mapToInt(m-> isNewMethod(nameOfClass,m) ? 1:0)
          .sum();








  }




}
