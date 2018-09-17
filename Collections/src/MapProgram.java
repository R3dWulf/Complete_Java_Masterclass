import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a complied high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted high level, object-oriented language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purpose Instruction Code");
        languages.put("Lisp", "There in lays madness");
        languages.put("Ruby", "All was good, until Twitter killed it");
        languages.put("Javascript", "The backbone of the internet");
        languages.put("C#", "Microsoft created this language because Sun would not allow Java to be modified");
        languages.put("Go", "Because Google really hates C++");
        System.out.println(languages.put("C++", "Finally, C, becomes a full fledged language")); // returns null


        //System.out.println(languages.get("Java"));
        //languages.put("Java", "This course is about Java");
        //System.out.println(languages.get("Java"));

        if(languages.containsKey("Java"))
        {
            System.out.println("Java is already in the map");
        }
        else
        {
            languages.put("Java", "This course is about Java");
            System.out.println("Java has been added to the map");
        }

        System.out.println("=======================================");

        //languages.remove("Lisp");

        if(languages.remove("Algol", "A language for A.I."))
        {
            System.out.println("Algol has been removed");
        }
        else
        {
            System.out.println("Algol has not been removed, invalid key");
        }

        //System.out.println(languages.replace("Lisp", "A function programming language"));
        //System.out.println(languages.replace("Scala", "This will not be added"));

        if(languages.remove("Algol", "an algorithmic language"))
        {
            System.out.println("Algol has been removed");
        }
        else
        {
            System.out.println("Cannot remove Algol, invalid key ");
        }

        if(languages.replace("Lisp", "There in lays madness", "A funtional programming language"))
        {
            System.out.println("Lisp was replaced");
        }
        else
        {
            System.out.println("Cannot replace Lisp, invalid key");
        }

        for(String key: languages.keySet())
        {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
