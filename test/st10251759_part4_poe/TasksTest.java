/*
=====================================Student Information=================================================
Student Number:     st10251759
Student Name:       Cameron Chetty
Course:             BCAD PROG5112
Group:              1
==========================================================================================================
*/
package st10251759_part4_poe;
import st10251759_part4_poe.Tasks;
import org.junit.Test;
import static org.junit.Assert.*;
//import st10251759_part2_poe.Tasks;

/*
    =============Code Attribution====================
    Author: VCSOIT - Sarina
    Website: https://www.youtube.com/watch?v=1Pa15vDWG-8&list=PL480DYS-b_kfHSYf2yzLgto_mwDr_U-Q6&index=4
    Date of Access: 29 April 2023
    =============Code Attribution====================
    */
public class TasksTest {
    
  public TasksTest() {
    }
    //Variable Actual => the boolean value when the method runs 
    //Variable Expected => the boolean value of a patricular result from a method
    
    //instaniate constuctor 
     Tasks tasks = new Tasks("Test", "Test", "Test", 1, "To Do", 0);
     
     /**
     * Test of the boolean method checkTaskDescription() method is Correct, of class Tasks. This test checks the actual boolean method
     */
     
         @Test
    public void testCheckTaskDescriptionIsSuccess() {
        //call set method to change the string value of taskDexcription to test Data
        tasks.setTaskDescription("Create Login to authenticate users");
        
        //actual return when calling the method checkTaskDescription
        boolean Actual = tasks.checkTaskDescription();
        
        //The expected outcome
        boolean Expected = true;
        
        //compare expected and actual values to see if they much
        assertEquals(Expected, Actual);
    }
    
    /**
     * Test of the boolean method checkTaskDescription() method is Correct, of class Tasks. This test checks the actual boolean method
     */
     
         @Test
    public void testCheckTaskDescriptionIsNotSuccess() {
        //call set method to change the string value of taskDexcription to test Data
        tasks.setTaskDescription("Create Login to authenticate users to autherticate the username and password for login");
        
        //actual return when calling the method checkTaskDescription
        boolean Actual = tasks.checkTaskDescription();
        
        //The expected outcome
        boolean Expected = false;
        
        //compare expected and actual values to see if they much
        assertEquals(Expected, Actual);
    }
    
       /**
     * Test of checkTaskDescription() method is Correct, by comparing the actual string message to the expected string message, of class Tasks. This test checks the String value based on boolean method
     */
     
         @Test
    public void testCheckTaskDescriptionSuccess() {
        //create variable to store actual result of the test
        String Actual =""; //default
        //call set method to change the string value of taskDexcription to test Data
        tasks.setTaskDescription("Create Login to authenticate users");
        
        //Do an if statement to check the validity of the boolean checkTaskDescription
       if (tasks.checkTaskDescription()) 
       {//begin if true statement
          Actual = "Task successfully captured";
       }//if true statement
        //The expected outcome
        String Expected = "Task successfully captured";
        
        //compare expected and actual values to see if they much
        assertEquals(Expected, Actual);
    }
           /**
     * Test of checkTaskDescription() method is InCorrect, by comparing the actual string message to the expected string message, of class Tasks. Test of checkTaskDescription() method is Correct, by comparing the actual string message to the expected string message, of class Tasks. This test checks the String values based on boolean method
     */
     
         @Test
    public void testCheckTaskDescriptionFailure() {
        //create variable to store actual result of the test
        String Actual =""; //default
        //call set method to change the string value of taskDexcription to test Data
        tasks.setTaskDescription("Create Login to authenticate users to autherticate the username and password for login");
        
        //Do an if statement to check the validity of the boolean checkTaskDescription
       if (!tasks.checkTaskDescription()) 
       {//begin if boolean method is false
          Actual = "Please enter a task description of less than 50 characters";
       }//if boolean method is false statement
        //The expected outcome
        String Expected = "Please enter a task description of less than 50 characters";
        
        //compare expected and actual values to see if they much
        assertEquals(Expected, Actual);
    }
     /**
     * Test of CreateTaskID method is correct, of class Tasks.
     */
    @Test
    public void testCreateTaskIDSuccess() {
        //call set method to add the test data
        tasks.setTaskName("Login Feature"); 
        
        
        tasks.setDevDetails("Robyn Harrison" );
        
        //call method createTaskID and store in actual variable
        String Actual = tasks.createTaskID();
        //assign the expected out come
        String Expected = "LO:0:SON";
        
        //compare actual and expected to see if they match
        assertEquals(Expected, Actual);
    }

     /**
     * Test of returnTotalHours method is correct, of class Tasks.
     */
    @Test
    public void testTotalHoursSuccess(){
    
       //get the total after task 1 
       tasks.setTotalDuration(8, 0);
       int returnTask1 = tasks.returnTotalHours();
       
       //get the total after task 2
       tasks.setTotalDuration(10, returnTask1);
      int Actual = tasks.returnTotalHours();
      
      //creae variable that this the expected outcome of calling the methods
      int Expected = 18;
      
      //Compare the expected and actual variables
      assertEquals(Expected, Actual);
    }
    
    /**
     * Test of returnTotalHours method is correct using additional data, of class Tasks.
     */
    @Test
    public void testAdditionalHoursSuccess(){
    
        //declare the array to hold test data
        int [] testData = {10, 12, 55, 11, 1};
        //variable to hold the result of calling the methods of Task class
        int Expected = 0;
        
        
        
        //run for loop to add the hours from the array
        for (int i =0; i < 5;i++ )
        {//begin
            //call set method to add the values of the array
          tasks.setTotalDuration(testData[i], Expected);
          
           //call the return method 
          Expected = tasks.returnTotalHours();
           
        }//end
        
        int Actual = 89;
      
      //Compare the expected and actual variables
      assertEquals(Expected, Actual);
    }
     /**
     * Test if the expected outcome is true for method checkDescription, of class Tasks.
     */
    @Test
    public void testCheckDescriptionIsTrue(){
    
        //call set method to assign the testdata to the task description
        tasks.setTaskDescription("Create Login to authenticate users");
        boolean Actual = tasks.checkTaskDescription(); //call method to validate the task description
        //call the method which test for the outcome being true
        assertTrue(Actual);
      
    }
        
     /**
     * Test if the expected outcome is false for method checkDescription, of class Tasks.
     */
    @Test
    public void testCheckDescriptionIsFalse(){
    
        //call set method to assign the testdata to the task description
        tasks.setTaskDescription("Create Login to authenticate users to autherticate the username and password for login");
        boolean Actual = tasks.checkTaskDescription(); //call method to validate the task description
        //call the method which test for the outcome being false
        assertFalse(Actual);
      
    }
    
/**
=====================================Student Information=================================================
Student Number:     st10251759
Student Name:       Cameron Chetty
Course:             BCAD PROG5112
Group:              1
==========================================================================================================
  -------------------------------------PART THREE----------------------------------------------------------  
*/

    //declare test data arrays
    String[] testDevelopers = {"Mike Smith","Edward Harrison","Samantha Paulson","Glenda Oberholzer"};
    String[] testTaskNames = {"Create Login","Create Add Features","Create Reports","Add Arrays"};
    int[] testTaskDurations = {5,8,2,11};
    String[] testStatus = {"To Do","Doing","Done","To Do"};
    static String[] testTaskIDs = new String[5];
 
      /**
     * Test The developer array contains the expected test data.
     */
    @Test
    public void checkArraysPopulated(){
    
      //String Variables for testing
      String Actual;
      String Expected="";
      //run a for loop 
      //populate the array in the tasks method with test data from the test arrays
       for (int i=0; i < 4; i++)
       {//begin for
       //call sets to set the test data
          tasks.setTaskNum(i);
          tasks.setTaskName(testTaskNames[i]);
          tasks.setDevDetails(testDevelopers[i]);
          tasks.setTaskDuration(testTaskDurations[i]);
          testTaskIDs[i] = tasks.createTaskID();
          tasks.setTaskStatus(testStatus[i]);
          
          tasks.populateArrays();
          //expected result
          Expected += testDevelopers[i];
       }//end for
      //Actual Result
       Actual = tasks.getArrayDevelopers();
       //compare actual and expected
        assertEquals(Expected, Actual);
    }
    
    /**
     * Test The method that finds the task with longest duration and displays its details.
     */
    @Test
    public void checkLongestDuration(){
    
      //String Variables for testing
      String Actual;
      String Expected="";
      //run a for loop 
      
      //populate the array in the tasks method with test data from the test arrays
       for (int i=0; i < 4; i++)
       {//begin for
       //call sets to set the test data
          tasks.setTaskNum(i);
          tasks.setTaskName(testTaskNames[i]);
          tasks.setDevDetails(testDevelopers[i]);
          tasks.setTaskDuration(testTaskDurations[i]);
          testTaskIDs[i] = tasks.createTaskID();
          tasks.setTaskStatus(testStatus[i]);
          
          tasks.populateArrays();
       }//end for
       
       
      //Actual Result from calling longestDuration method
       Actual = tasks.displayLongestDuration();
       //The expected result
       Expected = "Task details for the Task with the longest Duration\nTask Name: Add Arrays   Developer Name: Glenda Oberholzer  Task Duration: 11 hour/s\n";
    
        //compare actual and expected
        assertEquals(Expected, Actual);
    }
    
     /**
     * Test The method that finds and displays the task using Task Name
     */
    @Test
    public void checkSearchForTask(){
    
      //String Variables for testing
      String Actual;
      String Expected="";

      //Actual Result from calling longestDuration method
       Actual = tasks.searchForTask("Create Login");
       //The expected result
       Expected = "Task Name: Create Login  Developer Name: Mike Smith  Task Status: To Do\n";
    
        //compare actual and expected
        assertEquals(Expected, Actual);
    }
    
         /**
     * Test The method that finds and displays the task using Developer details
     */
    @Test
    public void checkSearchDeveloper(){
    
      //String Variables for testing
      String Actual;
      String Expected="";

         //populate the array in the tasks method with test data from the test arrays
       for (int i=0; i < 4; i++)
       {//begin for
       //call sets to set the test data
          tasks.setTaskNum(i);
          tasks.setTaskName(testTaskNames[i]);
          tasks.setDevDetails(testDevelopers[i]);
          tasks.setTaskDuration(testTaskDurations[i]);
          testTaskIDs[i] = tasks.createTaskID();
          tasks.setTaskStatus(testStatus[i]);
          
          tasks.populateArrays();
       }//end for
      
      //Actual Result from calling longestDuration method
       Actual = tasks.searchDeveloper("Samantha Paulson");
       //The expected result
       Expected = "The developer Samantha Paulson worked on the following tasks:\nTask Name: Create Reports  Task Status: Done\n";
    
        //compare actual and expected
        assertEquals(Expected, Actual);
    }
    
        /**
     * Test The method that deletes the task using the task Name
     */
    @Test
    public void checkDeleteTask(){
    
      //String Variables for testing
      String Actual;
      String Expected="";

      
       //run a for loop 
      
      //populate the array in the tasks method with test data from the test arrays
       for (int i=0; i < 4; i++)
       {//begin for
       //call sets to set the test data
          tasks.setTaskNum(i);
          tasks.setTaskName(testTaskNames[i]);
          tasks.setDevDetails(testDevelopers[i]);
          tasks.setTaskDuration(testTaskDurations[i]);
          testTaskIDs[i] = tasks.createTaskID();
          tasks.setTaskStatus(testStatus[i]);
          
          tasks.populateArrays();
       }//end for
       
      //Actual Result from calling longestDuration method
       Actual = tasks.deleteTask("Create Reports");
       //The expected result
       Expected = "Create Reports is successfully deleted";
    
        //compare actual and expected
        assertEquals(Expected, Actual);
    }
    
       /**
     * Test The method that displays the report
     */
    @Test
    public void checkDisplayReport(){
    
      //String Variables for testing
      String Actual;
      String Expected="Displaying All Tasks:\n";

      
       //run a for loop 
      
      //populate the array in the tasks method with test data from the test arrays
       for (int i=0; i < 4; i++)
       {//begin for
       //call sets to set the test data
          tasks.setTaskNum(i);
          tasks.setTaskName(testTaskNames[i]);
          tasks.setDevDetails(testDevelopers[i]);
          tasks.setTaskDuration(testTaskDurations[i]);
          testTaskIDs[i] = tasks.createTaskID();
          tasks.setTaskStatus(testStatus[i]);
          tasks.populateArrays();
          //Expected result using the test data provided
          Expected+="Task Name: "+testTaskNames[i] + "  Developer details: "+testDevelopers[i]+"  Task ID: "+testTaskIDs[i] + "  Task duration: "+testTaskDurations[i]+" hour/s" + "  Task Status: "+testStatus[i]+"\n";
       }//end for
        
        
      //Actual Result from calling longestDuration method
       Actual = tasks.displayReport();
       
      
        //compare actual and expected
        assertEquals(Expected, Actual);
    }
    
    
}//end
