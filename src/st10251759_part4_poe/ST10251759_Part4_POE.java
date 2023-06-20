/*
=====================================Student Information=================================================
Student Number:     st10251759
Student Name:       Cameron Chetty
Course:             BCAD PROG5112
Group:              1
==========================================================================================================
*/
package st10251759_part4_poe;
//import the joptionpane to project => used for user input and output messages
import javax.swing.JOptionPane;

    /*
    =============Code Attribution====================
    Author: Alex Lee
    Date: 13 April 2023
    Website: https://www.youtube.com/watch?v=XNWvF-xsCoY
    Date of Access: 22 April 2023
    =============Code Attribution====================
    */  
public class ST10251759_Part4_POE {//begin public class
  
public static void main(String[] args) { //begin main class
        //variable declaration
       
   String firstName, lastName;
     
     //Welcome prompt
     JOptionPane.showMessageDialog(null, "Welcome to Cameron Chetty's Easy Kanban Project!");
     
     //Geting the user Input for firstName and lastName using JOptionPane    
    firstName = JOptionPane.showInputDialog(null, "Please enter your first name/s");
    lastName = JOptionPane.showInputDialog(null, "Please enter your last name");
    
    
    
    //instantiation of object where the login constructor passess the parameters
   Login login = new Login(firstName, lastName);
   
   //UserName method Calls
   login.getUsername();//prompt user with j option pane
   login.checkUserName();//checks is the userName is valid ---> true / false
   login.userNameResult();// return appropreiate method valid/invalid or reprompt user for the UserName
   
   //Password method calls
   login.getpassword();//prompt user with j option pane
   login.checkPasswordComplexity();//checks is the userPassword is valid ---> true / false
   login.passwordResult(); // return appropreiate method valid/invalid or reprompt user for the UserPassword
   
   //Show the registration status by calling the registration validation method
   JOptionPane.showMessageDialog(null, login.registerUser());
   
   //Login method Calls
   login.getLoginInfor();//prompt user to enter login details after successful registration
   login.loginUser();//checks if login creds matches register creds
   login.returnLoginStatus();//return appropreiate login message
  
   
 /*
 ****************************************************** PART TWO ***********************************************************************************************
=====================================Student Information=================================================
Student Number:     st10251759
Student Name:       Cameron Chetty
Course:             BCAD PROG5112
Group:              1
==========================================================================================================
*/

 /*   =============Code Attribution====================

    Author: Zahra Bulbulia
    Website: https://github.com/zb662000/prog1stuff/blob/main/MovieQ/src/movieq/MovieQ.java
    Date of Access: 28 May 2023        
            
    =============Code Attribution====================    */
 //Validation to only show the features once user successfully logged in
  if(login.loginUser())
   {//begin if true
       showWelcomeScreen();
       showFeatures();
   }//end if true
    }//end main class
    
    
//method to diaplay welcome message if user successfully loggied in
  public static void showWelcomeScreen() {//begin showWelcomeScreen
        //if (login.loginUser()){} - not sure to add this or not
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban!");
    }//end showWelcomeScreen
    
//method to alllow the user to chosea feature from the numeric menu
public static void showFeatures(){//begin showFeatures
    //run while loop to ensure the options are continuely displaying unless the user types 3 to QUIT
    while (true) {//begin while loop => while it is true
            String option = JOptionPane.showInputDialog(null, "Please choose an option:\n" +
                    "1. Add tasks\n" +
                    "2. Show report\n" +
                    "3. Quit");

            switch (option) {
                case "1":
                    //call method to Add new tasks 
                    addNewTasks();
                    break;
                case "2":
                    //call method to show report - currently not availble so messeasge will be displayed
                    //JOptionPane.showMessageDialog(null, "Coming Soon!");
                    showReport();
                    break;
                case "3":
                    //allow user to quit and end program
                    JOptionPane.showMessageDialog(null, "Exiting EasyKanban. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    //validation if user enters any other option not within the range 1 to 3
                    JOptionPane.showMessageDialog(null, "Invalid option. Please choose a valid option.");
            }
        }//end while loop
    
}//end showFeatures

//method to add new tasks by getting the number of tasks the user should add
public static void addNewTasks() {//begin addNewTasks
        //propmt user to enter the num of task they want to enter
        int numberOfTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of task you wish to add"));
        int taskNum = 0; //acts as a counter
        int totalDuration = 0; //initalise total to 0
    //run a for loop to add each task that user wants using numberOfTask 
    
 for (int i=0; i < numberOfTasks; i++)
 {//begin for
     
     
//prompt user for task name
     
 String taskName = JOptionPane.showInputDialog(null, "Please enter the name of the task to be added");
 
      //prompt user for task Description 
 String taskDescription = JOptionPane.showInputDialog(null, "Please enter the description of the task to be added");
 

      //prompt user for ull name of developer
String devDetails = JOptionPane.showInputDialog(null, "Please enter the first and last name/s of the Developer working on the task");
 
      //prompt user for the duration of the the task
int taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the duration allocated to completing the task in the estimated hours"));

     
  
   //get the input form the user using a selection
//String taskStatus = JOptionPane.showInputDialog(null, "Please enter the number for status of task, Chose from: \n1. To do\n2. Doing\n3. Done");

 /*   =============Code Attribution====================

    Author: Java2s
    Website: http://www.java2s.com/Tutorial/Java/0240__Swing/Todisplaysadialogwithalistofchoicesinadropdownlistbox.htm
    Date of Access: 05 June 2023        
            
    =============Code Attribution====================    */

//Store the options for task Status in an array
String[] choices = { "To Do", "Doing", "Done"};

    String taskStatus = (String) JOptionPane.showInputDialog(null, "Choose the status of  the task...",
        "Select Task Status", JOptionPane.QUESTION_MESSAGE, null, // Use
                                                                        // default
                                                                        // icon
        choices, // Array of choices
        choices[1]); // Initial choice




 //create object and pass the data as parameters to the Tasks class
 Tasks tasks = new Tasks(taskName, taskDescription, devDetails, taskDuration, taskStatus, taskNum);
 

 
 //Call method to check if task description is incorrect
 while(!tasks.checkTaskDescription())
 {//begin while checkTaskDescription is false
     taskDescription = JOptionPane.showInputDialog(null, "Invalid Task Description! Please enter a task description of less than 50 characters");
     //call set method to get pass the new taskDescription to the task class as a parameter
     tasks.setTaskDescription(taskDescription);
     
 }//end while
  //if method to validate is task description is successfully captured >>validation if checkTaskDescription is true
  if (tasks.checkTaskDescription())
  {//begin if
      JOptionPane.showMessageDialog(null, "Task successfully captured");
  }//end if
  
  //display the task in report formaat by calling printTaskDetails method 
JOptionPane.showMessageDialog(null, tasks.printTaskDetails());

//call set method to add the hours to the totalDuration taking in the parameter of totalDuration and taskDuration, as loop runs the taskDuration for each task is added to the totalDuration
tasks.setTotalDuration(taskDuration, totalDuration);
totalDuration = tasks.returnTotalHours(); //method to return the totalDuration / totalHours

//increase taskNum by 1 everytime a task is added
 taskNum++;
 }//end for


 //Display total number of tasks and totalDuration to complete the Tasks
 JOptionPane.showMessageDialog(null,"The total hours spent for "+numberOfTasks + " tasks is "+ totalDuration + " hour/s");
    }//end addNewTasks
 


public static void showReport()
{//begin showReport
    

    //object instatiate
   Tasks taskReport = new Tasks("", "", "", 0, "", 0);
    

    
    //run while loop to ensure the options are continuely displaying unless the user types 3 to QUIT
    while (true) {//begin while loop => while it is true
      //switch statement based on users choice  will call the relevent method in the tasks class
      int choice = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your choice:\n1: All tasks with the status of done\n2: Task with the longest duration\n3: Search for a task with Task Name\n4: Search for tasks assigned assigned to developer\n5: Delete a task using TaskName\n6: Display report of all captured tasks\n7: Return to main menu"));
     //to return to main menu
    if(choice == 7)
    {//begin if
        showFeatures();
    }//end if
      
      switch(choice)
        {//begin switch
            case 1: JOptionPane.showMessageDialog(null, taskReport.displayDoneTasks());
            break;
            case 2: JOptionPane.showMessageDialog(null, taskReport.displayLongestDuration());
            break;
            case 3: String nameOfTask = JOptionPane.showInputDialog(null, "Please enter the name of the task that you are searching for");
            JOptionPane.showMessageDialog(null, taskReport.searchForTask(nameOfTask));
            break;
            case 4: String devName = JOptionPane.showInputDialog(null,"Please enter the name of the developer you are searching for");
            JOptionPane.showMessageDialog(null, taskReport.searchDeveloper(devName));
            break;
            case 5: String deleteNameTask = JOptionPane.showInputDialog(null,"Please enter the name of the task you want to delete");
            JOptionPane.showMessageDialog(null, taskReport.deleteTask(deleteNameTask));
            break;
            case 6: JOptionPane.showMessageDialog(null, taskReport.displayReport());
            break;
            default: //validation if user enters any other option not within the range 1 to 3
                    JOptionPane.showMessageDialog(null, "Invalid option. Please choose a valid option.");
        }//end switch
    }//end while

}//end showReport






}//end public class

