import java.util.ArrayList;

public class Magazine extends Print{

    ArrayList<String> articles;
    ArrayList<String> contributors;

    public Magazine(String title, String genre, double cost, int pages) {
        super(title, genre, cost, pages);
        articles = new ArrayList<>();
        contributors = new ArrayList<>();
    }

    public String wantPrintMedia(){
        return "Let's read the latest gossip - I've got a copy of " + this.title;
    }

    public void addArticle(String article){
        this.articles.add(article);
    }

    public void addContributor(String contributor) {
        this.contributors.add(contributor);
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

}
