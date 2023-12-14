package bg.smg;
import java.util.*;
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	Author orAuthor=new Author("Mariika");
    Presentation orPr=new Presentation(orAuthor, "Prikazka", 16);
    Presentation p1=(Presentation) orPr.clone();
    Presentation p2=(Presentation) orPr.clone();
    Presentation p3=(Presentation) orPr.clone();
    p1.getAuthor().setName("Kowalski");
    p1.submit();

    p2.getAuthor().setName("Sasquoch");
    p2.submit();


    p3.getAuthor().setName("Lebed");
    p3.submit();
    }
}
