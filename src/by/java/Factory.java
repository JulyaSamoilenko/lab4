package by.java;

public class Factory {
    public static Composition createComposition(CompositionType compositionType, String author, String name, String type, int pages){
        switch (compositionType) {
            case PROSE: return new Prose(author,name,type,pages);
            case POETRY: return new Poetry(author, name, type, pages);
        }
        return null;
    }

    public static Composition createScience(Disсipline disсipline, String author, String name, String type, int pages) {
        return new Science(author, name, type, pages, disсipline);
    }
}
