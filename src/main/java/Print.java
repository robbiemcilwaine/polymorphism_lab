public abstract class Print {

    protected String title;
    protected String genre;
    protected double cost;
    protected int pages;

    public Print(String title, String genre, double cost, int pages){
        this.title = title;
        this.genre = genre;
        this.cost = cost;
        this.pages = pages;
    }

    //    implementing the abstract read method from the superclass
//    public abstract String read(int rating);

    //    abstract method
//    public abstract String wantPrintMedia();

//    this will now be an abstract method defined in an interface

//    abstract method
    public abstract String countPages();

//    setter and getter methods
    public String getTitle(){
        return this.title;
    }

    public void setTitle(String inputTitle){
        this.title = inputTitle;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setGenre(String inputGenre){
        this.genre = inputGenre;
    }

    public double getCost(){
        return this.cost;
    }

    public void setCost(double inputCost){
        this.cost = inputCost;
    }

    public void setPages(int inputPages){
        this.pages = inputPages;
    }

    public int getPages(){
        return this.pages;
    }

}
