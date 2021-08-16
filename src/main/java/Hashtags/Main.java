package Hashtags;

import java.util.*;

public class Main {

    static String[] hashTagList = {"$", "#", "@"};

    // get hashtags from text sorted by frequency of repeatance and all duplicates removed
    public static void main(String[] args) {

        List<String> twits = new ArrayList<>();
        twits.add("#Java and #Scala are the languages of cognitive and AI development, IBM sees cognitive development is the future");
        twits.add("Some more info on the IBM investment in #Scala and  Lightbend http8/ibm-lightben-join-forces-enterprice");
        twits.add("IBM and @Lightbend are building an integrated platform for #Java and #Scala #cognitive app development");

        List<String> results = getHashtags(twits);
        sortHashtags(results);
        System.out.println(removeDuplicates(results));

        results.sort(Comparator.comparing(i->Collections.frequency(results,i)).reversed());


        }

    public static Set <String> removeDuplicates (List<String> twits )    {
        return  new LinkedHashSet<>(twits);
    }

    public static List<String>  sortHashtags(List<String> twits){
        twits.sort(Comparator.comparing(i->Collections.frequency(twits,i)).reversed());
        return twits;

    }

    public static List<String> getHashtags(List<String> twits) {
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

}
