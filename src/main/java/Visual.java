public class Visual implements IWatch{

    private String title;

    public Visual(String title){
        this.title = title;
    }

    public String watch(){
        return "I just watched this new video, it's called " + this.title;
    }

    //    setter and getter methods
    public String getTitle(){
        return this.title;
    }

    public void setTitle(String inputTitle){
        this.title = inputTitle;
    }

}
