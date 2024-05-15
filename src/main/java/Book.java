public class Book extends Print{

    String author;

    public Book(String title, String genre, double cost, int pages, String author) {
        super(title, genre, cost, pages);
        this.author = author;
    }

    public String wantPrintMedia() {
        return "I'm in the mood for some reading - maybe I'll read " + this.title;
    }

    public String judgeByItsCover(){
        return "Don't do that!";
    }

    public String discuss(){
        return "I really enjoyed " + this.title + ", what do you think?";
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String inputAuthor){
        this.author = inputAuthor;
    }

}
