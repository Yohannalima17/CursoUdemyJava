package ArraysCollections;

import java.util.Date;
import java.util.HashSet;

public class EqualsHASHCODE {

    public static void main(String[] args) {

//        Usuario user01 = new Usuario("Yohanna", "yohannalima16@gmail.com");
//        Usuario user02 = new Usuario("Maria", "Maria@gmail.com");
//        Usuario user03 = new Usuario("Yohanna", "yohannalima@gmail.com");
//        Usuario user04 = new Usuario("Yohanna", "yohannalima16@gmail.com");
//
//        System.out.println(user01.equals(user04));
//        System.out.println(user01.equals(new Date()));

        HashSet <Usuario> testeHash = new HashSet<>();
        testeHash.add(new Usuario("Yohanna", "yohannalima16@gmail.com"));
        testeHash.add(new Usuario("Maria", "Maria@gmail.com"));
        testeHash.add(new Usuario("Yohanna", "yohannalima@gmail.com"));
        testeHash.add(new Usuario("Yohanna", "yohannalima16@gmail.com"));

        System.out.println(testeHash.contains(new Usuario("Yohanna", "yohannalima16@gmail.com")));

    }
}
