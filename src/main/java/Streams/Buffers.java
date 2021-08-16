package Streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Buffers {

  // Find the length of the longest line in the file
  public static void main(String[] args) throws FileNotFoundException {
    //

    BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

    reader.lines().mapToInt(String::length).max().getAsInt();

    // find longest line in the file

    try {
      String longest = reader.lines().sort((x, y) -> y.length() - x.length()).findFirst().get();
    } catch (Exception e) {
      e.printStackTrace();
    }



   // imperative approach
    String longest =" ";
    while ((String  s = reader.readLine() != null )){
        if (s.length ()> longest.length())
            longest=s;
       }



    //reccursion approach

    String findLongestString ( String longest, List<String> list, int i ){
      if (list.get(i).length()>longest.length())
          longest=list.get(i);


       if (i<list.length-1)
        longest=findLongestString(longest,list,i+1);

       if (longest.length()> list.get(i)).length())
          return longest();
       return list.get(i);

      }
      List<String> lines = new ArrayList<>();
    while( (String s= reader.readLine()!=null)
      lines.add(s);


    String longest= findLongestString("",lines,0);


    String longestline=reader.lines()
            .reduce((x,y)->{
                if (x.length()> y.length())
                    return x;
                   return y;
            })
            .get();


    reader.lines()
            .max(comparingInt(String::length))
            .get();

    thermalReader.lines()
            .mapToInt(i-> Integer.parseInt(i))
            .takeWhile(i -> i<56)
            .forEach(System.out::println);

      thermalReader.lines()
              .mapToInt(i-> Integer.parseInt(i))
              .dropWhile(i -> i<56)
              .forEach(System.out::println);



  }
}
