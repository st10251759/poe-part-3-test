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


 /*   =============Code Attribution====================

    Author: Zahra Bulbulia
    Website: https://github.com/zb662000/prog1stuff/blob/main/MovieQ/src/movieq/Movie.java
    Date of Access: 28 May 2023        
            
    =============Code Attribution====================    */

public class Tasks {
 //varaible declaration
    private String taskName; //Name of task
    private int taskNum = 0; //task num is autogenerated and starts from 0
    private String taskDescription; //short description not mre than 50 characters
    private String devDetails; //first and last name of developer
    private int taskDuration; //estimated duration of the the task in hours
    private String taskID; //autogenerated based on a specific criteria
    private String taskStatus; //taskStatus : To do, Doing , Done
    
    private int totalDuration = 0; //varaibel holds total duration of hours
    
    
    //constructor method to capture and pass the parameters from main class to the tasks class
    public Tasks(String taskName, String taskDescription, String devDetails, int taskDuration, String taskStatus, int taskNum)
   {//begin constructor
    this.taskName = taskName;
    this.taskDescription = taskDescription;
    this.devDetails = devDetails;
    this.taskDuration = taskDuration;
    this.taskStatus = taskStatus;
    this.taskNum = taskNum;
   
   }//end constructor
//*************************SET METHODS FOR UNIT TESTING****************************************************************
//method to get task description as a parameter
public void setTaskDescription(String taskDescription)
{//begin setTaskDescription
 this.taskDescription = taskDescription;
}//end setTaskDescription

//method gets the taskName as a parameter
public void setTaskName(String taskName)
{//begin setTaskName
    this.taskName = taskName;
}//end setTaskName

//method to get the taskStatus as a parameter
public void setTaskStatus(String taskStatus)
{//begin setTaskStatus
    this.taskStatus = taskStatus;
}//end setTaskStatus

//method to get the developer details as a parameter
public void setDevDetails(String devDetails)
{//begin setDevDetails
    this.devDetails = devDetails;
}//end setDevDetails

//methpd to get the total duration as a parameter
public void setTaskDuration(int taskDuration)
{//begin setTaskDuration
    this.taskDuration = taskDuration;
}//end setTaskDuration

//method to set total Duration to the parameter in the main class
public void setTotalDuration(int taskDuration, int totalDuration)
{//begin
 totalDuration = totalDuration + taskDuration;
 this.totalDuration = totalDuration;
 //returnTotalHours();
}//end



//*************************SET METHODS FOR UNIT TESTING****************************************************************
    // Boolean method to check if the taskdescription lenght is valid, a valid lenght is less than or equal 5o characters
public boolean checkTaskDescription()
{//begin checkTaskDescription
 int lengthOfDescription = taskDescription.length(); //get the length of the string stored in taskDescription , i.e. number of characters of the string

 //if statement to check if the length of task descri[tion is less than or equal to 50, will return true
 if(lengthOfDescription<=50)
 {//begin if => true statement
     //Display successful validation message
    //JOptionPane.showMessageDialog(null, "Task successfully captured");
    return true; //assign to true 
 }//end if => true statement
 else 
 {//begin else => false statement => taskDescription greater than 50 characters
     //Display unsuccessful validation message
     //JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
     return false; //assign to false
 }//end else => false statement => taskDescription greater than 50 characters
 
}//end checkTaskDescription

//method creates and returns the taskID => based on a specifc set of criteria
public String createTaskID()
{//begin createTaskID
    //Use substring method to get the first 2 characters od taskNameand add the colon e.g. Ab:
    String idTask = taskName.substring(0,2) + ":";
    idTask = idTask + taskNum + ":";//add the task number and a colon o the current string eg. Ad:2:
    idTask = idTask + devDetails.substring((devDetails.length()-3)); // add the last 3 character of develper details to current string e.g. Ab:2:edc
    idTask = idTask.toUpperCase(); //change current string to uppercase
    
    return idTask;
}//end createTaskID

//method to returns all task details
public String printTaskDetails()
{//begin printTaskDetails
   populateArrays();
    String details; //string variable to hold the details of the task 
    details = "Task status: "+ taskStatus + "\nDeveloper details: " + devDetails;
    details = details + "\nTask number: " + taskNum + "\nTask Name: "+taskName+"\nTask description: " +taskDescription;
    details = details + "\nTask ID: "+ createTaskID() + "\nTask duration: " +taskDuration +" hr/s";
    
    return details;
}//end printTaskDetails


//method to add the duration of tasks to the total duration, used in unit testing
public int returnTotalHours()
{//begin addDuration()
    
    return totalDuration;
}//end addDuration()
 /*
 ****************************************************** PART THREE ***********************************************************************************************
=====================================Student Information=================================================
Student Number:     st10251759
Student Name:       Cameron Chetty
Course:             BCAD PROG5112
Group:              1
==========================================================================================================
*/

//declaration of arrays to store the task details in
static String[] developers = new String[30]; // holds the string first and last name of the developer assigned to the task
static String[] taskNames = new String[30];  //holds the string task name
static String[] taskIDs = new String[30]; //holds the string task ids
static int[] taskDurations = new int[30]; //holds the integer value for the task duration for each task
static String[] status = new String[30]; //holds the string value for task status

//method that willstore the data for each task in the relevent arrays
public void populateArrays()
{//begin populateArrays
    //create a variable to hold the subscript of the array
    int index = taskNum;
    
    //send the user task data to the respective arrays
    developers[index] = devDetails;
    taskNames[index] = taskName;
    taskIDs[index] = createTaskID();
    taskDurations[index] = taskDuration;
    status[index] = taskStatus;
    
    //method will be called in print details()
}//begin populateArrays


//method that gets the loop control variable by checking how many arrays have data in them, this method counts elements with data in the array to know how many elements we are working with
public int indexCount()
{
    int index =0; //can use any of the arrays, but used this array as the taskIds are autogenerated, for each task created.
  for(String i : taskIDs){//begin for
      if(i != null)//checks i the data in the array is not null then increases the index by 1  
      {index++;}
  }//end for
  return index;
  //this method is called and used as the loop control variable to determine how may iterations need to be done
}
//method to display the details for the task with the status done
public String displayDoneTasks()
{//begin displayDoneTasks
  
    //boolean for validation
    boolean search = false;
    String display = "This is all the tasks with the status of Done:\n ";
    
    
    //run a for loop to access each element of the arrays 
    for(int i=0; i < indexCount(); i++)
    {//begin for
        if (status[i].equals("Done")) //make a comparison with each element in the array
        {//begin if status is equal to done
           search = true;
          display = display+"Developer Name: "+developers[i] + "  Task Name: "+ taskNames[i] +"  Task Duration: "+taskDurations[i] +" hours\n";
        }//end if status is equal to done
    }//end for
    //displaydetails if search is true
    if(!search)
    {//begin if search is false
     display="There are no tasks woth the status Done";
    }//end if search is false

    return display; //return the string hold all task with status done
}//end displayDoneTasks

//method to display details for develope with the longest duration
public String displayLongestDuration()
{//begin displayLongestDuration
    //declara variables
    
    int longest = 0; //holds the default value of longest and willl change when comparing with the elements of the array
    int position = 0;//store the position in the array of the longest task duration
    String display = "Task details for the Task with the longest Duration\n"; //holds the string message of the longest task Duration
    
    //run a for loop to access each element of the arrays 
    for (int i=0; i<indexCount(); i++)
    {//begin for
        if (taskDurations[i] > longest)//if the current elements duration is larger than the value held in longest then the longest value will be replaced by that elements value
        {//begin if
            longest = taskDurations[i];
            position = i; //will hold the position of the array will longest duration
        }//end if
    }//end for 
    //store the details of the task with longest duration in a string message
    display = display+"Task Name: "+taskNames[position]+"   Developer Name: "+developers[position] + "  Task Duration: "+ taskDurations[position]+" hour/s\n";
    return display;
}//end displayLongestDuration

/*
    =============Code Attribution====================
    Author: Learning about Electronics
    Website: http://www.learningaboutelectronics.com/Articles/How-to-search-an-array-in-Java.php
    Date of Access: 18 June 2023
    =============Code Attribution====================
    */
//method to search for a task with the task Name and display the task details
public String searchForTask(String nameOfTask)
{//begin searchForTask
    //declare variables
    
    boolean search = false;// old the result of search => bflag
    int position = 0; //used to reference the subscript of the array
    String display = "Task is found, here are the details:\n"; //hold the message that will be returned
    
    //While loop to exercute search across all elements in the array
    while (!search && position<indexCount())
    {//begin while
        //if statement to check if the taskName is equal to the parameter nameOfTask
        if (taskNames[position].equalsIgnoreCase(nameOfTask))
        {//begin if
            search = true;
        }//end if
        else
        {//begin else
            position++; //increment the position tpo compare the next element        
        }//end else
    }//end while
    
    //display the detals of the task found
    if (search)
    {//if search true
        display = "Task Name: "+taskNames[position] + "  Developer Name: "+developers[position] + "  Task Status: "+status[position]+"\n";
    }//end search true
    else //if search value not found
    {//begin else false
        display = "Task not found\nPlease try again";
    }//end else false
    
    return display;
}//end searchForTask

//method to search for all tasks assigned to a developer and display the task Name and taskStatus
public String searchDeveloper(String devName)
{//begin searchDeveloper
    //decalre variables
    boolean search = false;//boolean variable for validation
    //variable will hold string message returned with the details of the developers tasks
    String display = "The developer "+devName+ " worked on the following tasks:\n";
    
     //run a for loop to access each element of the arrays 
     for (int i=0; i < indexCount(); i++)
     {//begin for
         //if statment to compare each element in the array with the search value
         if (developers[i].equalsIgnoreCase(devName)) //compares the parameter with each element of array
         {//begin if
             //store the details in a string
             display = display + "Task Name: "+taskNames[i]+"  Task Status: "+status[i]+"\n";
             search = true;
         }//end if
     }//end for
     
     //validation for search not found
     if (!search)
     {
       display = "Developer not found!";
     }
     
     return display;
}//end searchDeveloper


/*
    =============Code Attribution====================
    Author: DigitalOcean
    Website: https://www.digitalocean.com/community/tutorials/java-remove-array-elements
    Date of Access: 18 June 2023
    =============Code Attribution====================
    */
//method to delete a task using task Name as a parameter
public String deleteTask(String deleteNameTask)
{//begin deleteTask
    
    //declare temporary arrays to hold values that do not need to be deleted
    String[] tempDevelopers = new String[30];
    String[] tempTaskNames = new String[30];
    String[] tempTaskIDs = new String[30];
    int[] tempTaskDurations = new int[30];
    String[] tempTaskStatus = new String[30];
    boolean deleted = false; //boolean variable for searching
    int j = 0; //secondary index for replacing
    String display = ""; //holds string message
    
    //run a for loop to access each element of the arrays 
     for (int i=0; i < indexCount(); i++)
     {//begin for
         //if statment to compare each element in the array with the search value
         if (!(taskNames[i].equalsIgnoreCase(deleteNameTask))) //compares the parameter with each element of array if they not equal then the replace the data in the current array
         {//begin if
             tempTaskNames[j] = taskNames[i];
             tempDevelopers[j]= developers[i];
             tempTaskIDs[j] = taskIDs[i];
             tempTaskDurations[j] = taskDurations[i];
             tempTaskStatus[j] = status[i];
             
             
             j++; //increment j counter
         }//end if
         else
         {//begin else
             deleted = true;
         }//end else

     }//end for
          //run a for loop to access each element of the arrays 
          for (int k =0; k < indexCount(); k++)
          {//begin for k
           //replace the actual array data with the temp data, thus removing the deleted data
              taskNames[k] = tempTaskNames[k];
              developers[k] = tempDevelopers[k];
              taskIDs[k] = tempTaskIDs[k];
              taskDurations[k] = tempTaskDurations[k];
              status[k] = tempTaskStatus[k];
          }//end for k
          
         if (deleted)
         {//begin if deleted true statement
             display = deleteNameTask + " is successfully deleted";
         }//end if deleted true statement
         else
         {//begin else deleted is false => the task to be deleted not found
             display = "Task not deleted\nPlease try again";
         }//end else deleted is false => the task to be deleted not found
         
         return display;
}//end deleteTask

//method to display the report that lists the full details of all captured tasks
public String displayReport()
{//begin displayReport
 String display = "Displaying All Tasks:\n"; //string varaible that will be used to display the details of the task
 
      //run a for loop to access each element of the arrays 
     for (int i=0; i < indexCount(); i++)
     {//begin for
         display += "Task Name: "+taskNames[i] + "  Developer details: "+developers[i]+"  Task ID: "+taskIDs[i] + "  Task duration: "+taskDurations[i]+" hour/s" + "  Task Status: "+status[i]+"\n";
     }//end for
     
     return display;
}//end displayReport


//get  developers method for unit testing
public String getArrayDevelopers()
{//begin getArrayDevelopers
 String display = ""; //hold developer names
 
       //run a for loop to access each element of the arrays 
     for (int i=0; i < indexCount(); i++)
     {//begin for
         display += developers[i];
     }//end for
     return display;
}//end getArrayDevelopers


//set method for unit testing
public void setTaskNum(int index)
{//begin setTaskNum
    taskNum = index;
}//end setTaskNum
}//end Tasks Class
