import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // Creating Task objects
        //System.out.println("Hello world");
        createTask();
        boolean mycondition = true;
        while (mycondition) {
            System.out.println("WELCOME TO TASK MANAGEMENT SYSTEM");
            System.out.println("PLEASE SELECT AN OPTION: ADD TASK, VIEW TASK LIST, UPDATE STATUS, DELETE TASK, EXIT");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if (userInput == "EXIT"){
                mycondition = false;
            }
            else if (userInput == "ADD TASK") {
                System.out.println("Enter Task ID(integer):");
                int givenid = scanner.nextInt();
                System.out.println("Enter Title(string):");
                String giventitle = scanner.nextLine();
                System.out.println("Enter Description(string)");
                String givendescription = scanner.nextLine();
                System.out.println("Please enter Status of new task(PENDING, IN_PROGRESS, DONE)"); 
                String givenstatus = scanner.nextLine();
                createTask(givenid, giventitle, givendescription, givenstatus);
            }
           


            mycondition = false;
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
        Task task = new Task(id, title, description, status);
        //System.out.println(task.getTitle());
        System.out.println(task.getdisplay());
    }



}
