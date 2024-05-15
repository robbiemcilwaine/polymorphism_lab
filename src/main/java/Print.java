public abstract class Print {

    protected String title;
    protected String genre;
    protected double cost;
    private int pages;

    public Print(String title, String genre, double cost, int pages){
        this.title = title;
        this.genre = genre;
        this.cost = cost;
        this.pages = pages;
    }

    public abstract String wantPrintMedia();

    public String read(){
        return "I am reading " + this.title + "!";
    }

    public String countPages(){
        return "This print media has " + this.pages + " pages!";
    }

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
