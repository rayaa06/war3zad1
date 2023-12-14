package bg.smg;
import java.util.*;
public class Presentation extends Document implements Cloneable{
    private Author author;
    private String theme;
    private int slides;

    public Presentation() {
        this.author = null;
        this.theme = "";
        this.slides = 0;
    }

    public Presentation(Author author, String theme, int slides) {
        this.author = author;
        this.theme = theme;
        this.slides = slides;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getSlides() {
        return slides;
    }

    public void setSlides(int slides) {
        this.slides = slides;
    }

    @Override
    public String toString() {
        return "Presentation{" +
                "author=" + author +
                ", theme='" + theme + '\'' +
                ", slides=" + slides +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Presentation clonePresentation=(Presentation) super.clone();
        clonePresentation.author=(Author)author.clone();
        return clonePresentation;
    }

    @Override
    void submit() {
        System.out.println("Prezentaciqta e predadena!!!!");
    }
}
