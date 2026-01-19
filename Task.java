public class Task {
    private int id;
    private String title;
    private String description;
    //onject
    private status varstatus;
    // Constructor
    public Task(int id, String title, String description, status varstatus) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.varstatus = status.PENDING;
    }
    // returning items
    public int getid(){
        return this.id;
    }
    public  String getTitle() {
        //return this.title + " best title ever";
        return this.title;
    }
    public String description(){
        return this.description + " best description ever";
    }
    public status getvarstatus(){
        return this.varstatus;
    }
    public status statusupdate(String newstatus) {
        if (newstatus == "PENDING"){

        }
        return this.varstatus;
    }
    public String getdisplay(){
        return "ID: " + this.id + ", Title: " + this.title + ", Description: " + this.description + ", Status: " + this.varstatus;
    }
}
