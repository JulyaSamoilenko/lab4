package by.java;

import java.util.Objects;

public abstract class Composition {
    private String author;
    private String name;
    private String type;
    private int pages;

    public Composition() {

    }

    public Composition(String author, String name, String type, int pages) {
        this.author = author;
        this.name = name;
        this.type = type;
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public int getPages(){
        return pages;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) return false;
        if (this == obj) return true;
        return Objects.equals(this.getAuthor(), ((Composition) obj).getAuthor()) && Objects.equals(this.getName(), ((Composition) obj).getName());
    }

    @Override
    public String toString() {
        return "Composition{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pages=" + pages +
                '}';
    }
}
