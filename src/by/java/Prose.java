package by.java;

public class Prose extends Composition {

    public Prose() {
        super();
    }

    public Prose(String author, String name, String type, int pages) {
        super(author, name, type, pages);
    }



    @Override
    public String toString() {
        return "Это  проза, ее автор " + getAuthor() + ", название " + getName()
                + ", это жанр " + getType() + ", страниц " + getPages();

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
