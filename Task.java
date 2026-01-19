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

    public String getTitle() {
        return title + " best title ever";
    }
}
