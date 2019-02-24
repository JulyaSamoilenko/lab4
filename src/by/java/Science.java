package by.java;

public class Science extends Composition {
    private Disсipline disсipline;

    public Science(){

    }

    public Science(String author, String  name, String  type, int pages, Disсipline disсipline){
        super(author, name, type, pages);
        this.disсipline = disсipline;
    }

    public void setDisсipline(Disсipline d) {
        this.disсipline = d;
    }

    public Disсipline getDisсipline() {
        return this.disсipline;
    }

    @Override
    public String toString() {
        return "Science{" +
                "disсipline=" + disсipline +
                "} " + super.toString();
    }
}
