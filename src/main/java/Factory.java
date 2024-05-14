import java.util.ArrayList;

public class Factory {

    private String name;
    private ArrayList<Publication> publications;

    public Factory(String name){
        this.name = name;
        this.publications = new ArrayList<>();
    }

    public void addItemToPublications(Publication inputPublication){
        this.publications.add(inputPublication);
    }

    public double calculateProfit() {
        double profit = 0.0;
        for (int i = 0; i < this.publications.size(); i++) {
            profit += this.publications.get(i).getCost();
        }
        return profit;
    }

    public int countPublications(){
        return this.publications.size();
    }

    public ArrayList<Publication> getPublications(){
        return this.publications;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String inputName){
        this.name = inputName;
    }

}
