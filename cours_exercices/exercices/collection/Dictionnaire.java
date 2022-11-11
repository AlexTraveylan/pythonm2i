/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cours_exercices.exercices.collection;
    import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author tdema
 */
public class Dictionnaire {
    

    public static void main(String args[]){
        System.out.println(greet("sdqjklhfsqkj"));
    }
    
    static String greet(String english) {
        if (english==null) {
            english = "english";
        }
        Map<String, String> dict = new HashMap<>();
        dict.put("english", "Welcome");
        dict.put("czech", "Vitejte");
        dict.put("danish", "Velkomst");
        dict.put("dutch", "Welkom");
        dict.put("estonian", "Tere tulemast");
        dict.put("finnish", "Tervetuloa");
        dict.put("flemish", "Welgekomen");
        dict.put("french", "Bienvenue");
        dict.put("german", "Willkommen");
        dict.put("irish", "Failte");
        dict.put("italian", "Benvenuto");
        dict.put("latvian", "Gaidits");
        dict.put("lithuanian", "Laukiamas");
        dict.put("polish", "Witamy");
        dict.put("spanish", "Bienvenido");
        dict.put("swedish", "Valkommen");
        dict.put("welsh", "Croeso");

        return dict.get(english);
    }
}
    