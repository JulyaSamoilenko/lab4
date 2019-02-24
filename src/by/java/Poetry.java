package by.java;

public class Poetry  extends Composition{
    public Poetry() {
    }

    public Poetry(String author, String name, String type, int pages) {
        super(author, name, type, pages);
    }

    @Override
    public String toString() {
        return "Это  поэзия, ее автор " + getAuthor() + ", название " + getName()
                + ", это жанр " + getType() + ", страниц " + getPages();
    }

    @Override
    public boolean equals(Object o) {
       return super.equals(o);
    }


}
