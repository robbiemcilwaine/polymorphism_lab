public class Publication {

    private String title;
    private String genre;
    private double cost;
    private int pages;

    public Publication(String title, String genre, double cost, int pages){
        this.title = title;
        this.genre = genre;
        this.cost = cost;
        this.pages = pages;
    }

    public String read(){
        return "I am reading " + this.title + "!";
    }

    public String countPages(){
        return "This publication has " + this.pages + " pages!";
    }

    public void setTitle(String inputTitle){
        this.title = inputTitle;
    }

    public String getTitle(){
        return this.title;
    }

    public void setGenre(String inputGenre){
        this.genre = inputGenre;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setCost(double inputCost){
        this.cost = inputCost;
    }

    public double getCost(){
        return this.cost;
    }

    public void setPages(int inputPages){
        this.pages = inputPages;
    }

    public int getPages(){
        return this.pages;
    }

}
