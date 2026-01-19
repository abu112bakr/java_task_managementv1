public class Task {
    private int id;
    private String title;
    private String description;
    //object
    private Status varstatus;
    // Constructor
    public Task(int id, String title, String description, Status status) {
        this.id = id;
        this.title = title;
        this.description = description;
        if (status == Status.PENDING){
            this.varstatus = Status.PENDING;
        }
        else if (status == Status.IN_PROGRESS){
            this.varstatus = Status.IN_PROGRESS;
        }
        else if (status == Status.DONE){
            this.varstatus = Status.DONE;
        }
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
    public Status getvarstatus(){
        return this.varstatus;
    }
    public Status statusupdate(Status newstatus) {
        this.varstatus = newstatus;
        return this.varstatus;
    }
    public String getdisplay(){
        return "ID: " + this.id + ", Title: " + this.title + ", Description: " + this.description + ", Status: " + this.varstatus;
    }
}
