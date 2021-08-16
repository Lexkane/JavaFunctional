package Hashtags;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
   // static String[] hashTagList = {"$", "#", "@"};

    public static void main(String[] args) {
        List<String> twits = new ArrayList<>();
        twits.add("#Java and #Scala are the languages of cognitive and AI development, IBM sees cognitive development is the future");
        twits.add("Some more info on the IBM investment in #Scala and  Lightbend http8/ibm-lightben-join-forces-enterprice");
        twits.add("IBM and @Lightbend are building an integrated platform for #Java and #Scala #cognitive app development");

    System.out.println(getHashtags(twits));
    }



    public static List<String> getHashtags (List<String> twits){
        List <String> hashTags= new ArrayList<>();
        twits.forEach(twit->hashTags.addAll(getHashTag(twit)));


        Map<String,Integer> resultMap= new HashMap<>();
        hashTags.forEach(tag->{
            if (resultMap.containsKey(tag)){
                resultMap.compute(tag,(s,integer)-> ++integer);
            } else{
                resultMap.put(tag,1);
            }
        });


       Map<String,Integer> checkMap= countMap(hashTags);


       return  resultMap.entrySet().stream().
                sorted((o1,o2)->o2.getValue().compareTo(o1.getValue()))
                .map(stringIntegerEntry -> stringIntegerEntry.getKey())
                .collect(Collectors.toList());

    }


    public static Map<String,Integer> countMap( List<String> hashtags){
       Map<String,Integer> hashtmap=new HashMap<String,Integer>();
        for (String tag:hashtags){
            Integer count= hashtmap.get(tag);
            hashtmap.put(tag, (count==null)? 1: count+1);
        }
        return hashtmap;

    }


    public static  List<String> getHashTag (String twit){

            return List.of(twit.split(" ")).stream()
                    .filter(s -> s.startsWith("#"))
                    .collect(Collectors.toList());

    }
















  /*  public static List<String> getHash(List<String> twits) {
        List<String> hashTags = new ArrayList<>();


        for (String twit : twits) {
            String[] splitTwit = twit.trim().split(" ");

            for (String word : splitTwit) {
                for (String hashtag : hashTagList) {


                    if (word.startsWith(hashtag)) {
                        hashTags.add(word.substring(1));
                    }
                }

            }

        }
        return hashTags;
    }
*/

}
