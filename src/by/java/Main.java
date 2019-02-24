package by.java;

public class Main {

    public static void main(String[] args) {

        Composition creation1 = new Prose("AAa", "AAA", "ccc", 2);
        System.out.println(creation1);

        Composition creation2 = new Poetry("Лермонтов", "Утес", "Лирика", 1);
        System.out.println(creation2);
        System.out.println(creation1.equals(creation2));

        Composition creation3 = Factory.createComposition(CompositionType.PROSE, "fghjhj", "ghghjhjhj", "bjhbjj", 1 );
        System.out.println(creation3);

        Composition creation4 = Factory.createScience(Disсipline.ASTRONOMY, "ghgug", "ghghgjh", "hhhj", 6);
        System.out.println(creation4);
    }
}
