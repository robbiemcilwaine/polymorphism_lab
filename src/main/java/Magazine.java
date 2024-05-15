import java.util.ArrayList;

public class Magazine extends Print{

    ArrayList<String> articles;
    ArrayList<String> contributors;
    String editor;

    public Magazine(String title, String genre, double cost, int pages, String editor) {
        super(title, genre, cost, pages);
        this.articles = new ArrayList<>();
        this.contributors = new ArrayList<>();
        this.editor = editor;
    }

//    implementing the abstract read method from the superclass
    public String read(){
        return "I am reading a magazine - it's called " + this.title + "!";
    }

//    implementing abstract method from superclass
    public String wantPrintMedia(){
        return "Let's read the latest gossip - I've got a copy of " + this.title;
    }

    public void addArticle(String article){
        this.articles.add(article);
    }

    public void addContributor(String contributor) {
        this.contributors.add(contributor);
    }

    public String countPages(){
        return "This magazine has " + this.pages + " pages!";
    }

    public String countArticles(){
        return "This magazine has " + this.articles.size() + " articles";
    }

    public String countContributors(){
        return "This magazine has " + this.contributors.size() + " contributors";
    }

    public String gossip(int articleIndex, int contributorIndex){
        return "OMG! Did you hear that article about " + this.articles.get(articleIndex) + " in " + this.title + " by " + this.contributors.get(contributorIndex) + "?";
    }

    public void setEditor(String editor){
        this.editor = editor;
    }

    public String getEditor(){
        return this.editor;
    }

}
