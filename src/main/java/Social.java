public class Social implements IRead, IWatch{

    private String title;

    public Social(String title){
        this.title = title;
    }

    public String read(){
        return "I just read this new post on " + this.title;
    }

    public String watch(){
        return "I just watched this new post on " + this.title;
    }

    //    setter and getter methods
    public String getTitle(){
        return this.title;
    }

    public void setTitle(String inputTitle){
        this.title = inputTitle;
    }

}
