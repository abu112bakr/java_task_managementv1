import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static ArrayList<Task> taskaArrayList = new ArrayList<>();
    // dynamic ArrayList to store tasks
    public static void main(String [] args) {
        System.out.println("WELCOME TO TASK MANAGEMENT SYSTEM");
        boolean mycondition = true;        
        while (mycondition) {
            System.out.println("############## MAIN MENU ##############");
            System.out.println("PLEASE SELECT AN OPTION: ADD TASK, VIEW TASK, UPDATE STATUS, DELETE TASK, EXIT");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            System.out.println(userInput);
            if (userInput.equals("EXIT")){
                mycondition = false;
            } else if (userInput.equals("ADD TASK")) {
                System.out.println("ADDING A NEW TASK");
                System.out.println("Enter Task ID(integer):");
                int givenid = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                System.out.println("Enter Title(string):");
                String giventitle = scanner.nextLine();
                System.out.println("Enter Description(string)");
                String givendescription = scanner.nextLine();
                System.out.println("Please enter Status(PENDING, IN_PROGRESS, DONE)"); 
                String givenstatus = scanner.nextLine();
                createTask(givenid, giventitle, givendescription, givenstatus);
            } else if (userInput.equals("VIEW TASK")) {
                viewTask();
            } else if (userInput.equals("UPDATE STATUS")) {
                System.out.println("Enter Task ID");
                int userinput_id = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                System.out.println("Please enter New Status(PENDING, IN_PROGRESS, DONE)");
                String userinput_status = scanner.nextLine();
                updateTask(userinput_id,userinput_status);
            } else if (userInput.equals("DELETE TASK")){
                System.out.println("Enter Task ID");
                int userinput_id2 = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character     
                deleteTask(userinput_id2);           
            }

             else {
                System.out.println("INVALID OPTION. PLEASE TRY AGAIN.");
            }


            //mycondition = false;
            System.out.println("outside loop");
        }
    }
    private static void viewTask(){
        System.out.println("VIEWING ALL TASKS");
        for (Task itask : taskaArrayList) {
            System.out.println(itask.getdisplay());
            //System.out.println(itask.getid());
        }
    }
    private static void updateTask(int userinput_id, String userinput_status){
        int i = 0;
        boolean found = false;
        while (i < taskaArrayList.size() || !found){
            // itask is the object
            Task itask = taskaArrayList.get(i);
            System.out.println("iTask: "+itask);
            System.out.println("itask.getid(): "+itask.getid()+ " userid: "+userinput_id);
            //System.out.println((itask.getid()) == (userinput_id));
            if ((itask.getid()) == (userinput_id)){
                found = true;
                System.out.println("entered first IF");
                // task object found
                Status v1; // v1 is Status variable
                if (userinput_status.equals("PENDING")){
                    v1 = Status.PENDING;
                } else if (userinput_status.equals("IN_PROGRESS")){
                    v1 = Status.IN_PROGRESS;
                } else if (userinput_status.equals("DONE")) {
                    v1 = Status.DONE;
                } else {
                    //defult to pending
                    v1 = Status.PENDING;
                }
                itask.statusupdate(v1);
                System.out.println("TASK ID: "+ itask.getid() + " Has been successfully updagted to: "+itask.getvarstatus());
            }
            i++;
        }
    }
    private static void deleteTask(int userinput_id){
        int i = 0;
        boolean found = false;
        while (i < taskaArrayList.size() || !found){
            // itask is the object
            Task itask = taskaArrayList.get(i);
            System.out.println("iTask: "+itask);
            System.out.println("itask.getid(): "+itask.getid()+ " userid: "+userinput_id);
            //System.out.println((itask.getid()) == (userinput_id));
            if ((itask.getid()) == (userinput_id)){
                found = true;
                System.out.println("entered first IF");
                // task object found
                System.out.println("TASK ID: "+ itask.getid() + "Has been successfully deleted");
                taskaArrayList.remove(i);
                // Status v1; // v1 is Status variable
                // if (userinput_status.equals("PENDING")){
                //     v1 = Status.PENDING;
                // } else if (userinput_status.equals("IN_PROGRESS")){
                //     v1 = Status.IN_PROGRESS;
                // } else if (userinput_status.equals("DONE")) {
                //     v1 = Status.DONE;
                // } else {
                //     //defult to pending
                //     v1 = Status.PENDING;
                // }
                // itask.statusupdate(v1);
            }
            i++;
        }

    }
    private static void createTask(int id, String title, String description, String status) {
        // // Task creation logic will go here
        // System.out.println("Enter Task ID: 700");
        // int id = 700;
        // System.out.println("Enter Title: Clean Dhaka");
        // String title = "Clean Dhaka";
        // System.out.println("Enter Description: We are going to clean Dhaka city");
        // String description = "We are going to clean Dhaka city";
        // System.out.println("Enter Status: PENDING");
        // status varStatus = status.PENDING;
        // // Creating a new Task object
        // System.out.println("#################################################################################");
        
        //must pass enum object
        Status varstatus;
        if (status.equals("PENDING")){
            varstatus = Status.PENDING;
        }
        else if (status.equals("IN_PROGRESS")){
            varstatus = Status.IN_PROGRESS;
        }
        else if (status.equals("DONE")){
            varstatus = Status.DONE;
        } else {
            varstatus = Status.PENDING;
        }

        Task task = new Task(id, title, description, varstatus);
        taskaArrayList.add(task);
        //System.out.println(task.getTitle());
        System.out.println(task.getdisplay());
    }



}
