package certificate.training.java809.question006;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TechName {

    String techName;

    TechName(String techName) {
        this.techName = techName;
    }
    
    public static void main(String[] args) {
        List<TechName> tech = Arrays.asList(new TechName("Java-"),
                new TechName("Oracle DB-"),
                new TechName("J2EE-")
        );

        Stream<TechName> stre = tech.stream();
        //stre.forEach(System.out::print);  // A
        stre.map(a -> a.techName).forEach(System.out::print); // B
        //stre.map(a -> a).forEachOrdered(System.out::print); // C
        //stre.forEachOrdered(System.out::print); // D
    }

}
