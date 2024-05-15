public class Book extends Print{

    String author;

    public Book(String title, String genre, double cost, int pages, String author) {
        super(title, genre, cost, pages);
        this.author = author;
    }

    public String read(){
        return "I'm reading a book - it's called " + this.title + "!";
    }

    public String judgeByItsCover(){
        return "Don't do that!";
    }

    public String discuss(){
        return "I really enjoyed " + this.title + ", what do you think?";
    }

//   method overloading
    public String wantPrintMedia() {
        return "I'm in the mood for some reading - maybe I'll read " + this.title;
    }

    public String wantPrintMedia(String alternativeBook){
        return "I'm in the mood for some reading - maybe I'll read " + this.title + ", or maybe " + alternativeBook + ".";
    }

//    abstract method from the superclass defined in the subclass
    public String countPages(){
        return "This book has " + this.pages + " pages!";
    }

    public void setAuthor(String inputAuthor){
        this.author = inputAuthor;
    }

    public String getAuthor(){
        return this.author;
    }

}
