import java.util.ArrayList;

public class Media {

//    collection of Print objects
    private ArrayList<Print> printMedia;

    public Media(){
        this.printMedia = new ArrayList<>();
    }

    public void addItemToPrintMedia(Print inputPrint){
        this.printMedia.add(inputPrint);
    }

    public double calculateProfit() {
        double profit = 0.0;
        for (int i = 0; i < this.printMedia.size(); i++) {
            profit += this.printMedia.get(i).getCost();
        }
        return profit;
    }

    public int countPrintMedia(){
        return this.printMedia.size();
    }

    public ArrayList<Print> getPrintMedia(){
        return this.printMedia;
    }

}
