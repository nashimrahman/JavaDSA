import java.util.*;

public class roughWork {

    public static void main(String[] args) {

        MyBook book = new MyBook();
        book.setTitle("A tale of two cities");
        System.out.println("The title is: "+book.getTitle());


    }

}


abstract class Book{
    //attribute
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{

    @Override
    void setTitle(String s) {
        super.title= s;
    }
}