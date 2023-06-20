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

public class Login {//begin login class
    //beginning of Login class, variable declaration and defining methods
    private String firstName, lastName, userName, userPassword, loginUsername, loginPassword;

    //Construstor metod to pass the parameters from main java class
    public Login(String firstName, String lastName) 
    {//beginning of constructor
        //using this to refer to the variable in the Login class is assign to the string passed through the parameters in main class
        this.firstName = firstName;
        this.lastName = lastName;

    }//end of constructor
    
   //Get method getUser to prompt the user for intial input or re-prompt if input is incorrect
     public void getUsername()
     {//begin getUsername
        userName = JOptionPane.showInputDialog(null, "Please create a username for your account.");//prompt user to create username
     }//end getUsername
    
     
     //boolean checkUserName method which checks the userName entered if its not more than 5 characters and if it contains an underscore
    public boolean checkUserName() 
    {//begin checkUsername
        //use if statement to check if both condtions are truee and therefore method will return true
      if(userName.length() <= 5 && userName.contains("_"))
      {//begin true statement
         return true;
      }//begin true statement 
      else
      {//begin false statement
          return false;
      }//end false statement
     
    } //end checkUserName
    
    
    //This method will be run based on the outcome of checkUserName() which returned true/false
     public void userNameResult() {
        while (!checkUserName()) { // While loop will exercute as long as the username is invalid ===> checks if invalid
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length .","",0); //show error message and specific criteria needed for an appropriate username
            getUsername(); //prompts user to re-enter a username until it matches criteriai.e checkUserName() returns true
        }//while invalid
        if (checkUserName()) //if statement, once user entered the correctly formatted userName
        {  //begin if valid
            JOptionPane.showMessageDialog(null, "Username successfully captured");
        }// end if valid  
    }//end username result method
    
    //Get method getPassword to prompt the user for intial input or re-prompt if input is incorrect
    public void getpassword() 
    {//begin getpassword
        userPassword = JOptionPane.showInputDialog(null, "Please create a password for your account."); //prompt user to create password
    }//end get password
    
    //boolean method will check if password is valid i.e has 8 characters or more, a captial letter, a digit and a specail character
    public boolean checkPasswordComplexity()
            
         /*
    =============Code Attribution====================
    Author: Programiz
    Website: https://www.programiz.com/java-programming/library/string/matches
    Date of Access: 22 April 2023
            
    Author: Zahra Bulbulia
    Website: https://github.com/zb662000/prog1stuff/blob/main/Movie/src/movie/Movie.java
    Date of Access: 24 April 2023        
            
    =============Code Attribution====================
    */
     
    {//begin getpassword()
        //use regex code : ".*[0-9].*" => for digits in string, for Captial letters=> ".*[A-Z].*" , for specail characters=> ".*[!@#$%^&*()].*", thr matches will return true or false based on what the string contains
     if (userPassword.length() >= 8 && userPassword.matches(".*[A-Z].*") && userPassword.matches(".*[0-9].*") && userPassword.matches(".*[!@#$%^&*()].*"))
     {//begin if true statement
         return true;
     }//end if true statement
     else
     {//begin false statement
         return false;     
     }//begin false statement
     
     
    }//end getpassword()
    
    //This method will be run based on the outcome of checkUserPassword() which returned true/false
    public void passwordResult() {
        while (!checkPasswordComplexity())//checks if invalid
        { //begin while checkPasswordComplexity() is invalid
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.","",0);
            getpassword(); //prompts user to re-enter a password that matches criteria 
        }//end while checkPasswordComplexity() is invalid
        if (checkPasswordComplexity())//if statement, once user entered the correctly formatted userPasswordeb 
        {//begin if valid
            JOptionPane.showMessageDialog(null, "Password successfully captured");
        }//end if valid
    }//end password result method
    
    //registerUser() method will return an appropriate message base on validy of userName and userPassword
   public String registerUser() {
        String userNameFalse, userPasswordFalse, registerSuccess;
        if ((checkUserName() == false)) {
            userNameFalse = "Registration unsuccessful. Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
            return userNameFalse; // if username not formatted correctly, will display error message to fix username
        } else if ((checkPasswordComplexity() == false)) {  //if username correctly formatted will then proceed to check if password is not formatted correctly
            userPasswordFalse = "Registration unsuccessful. Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
            return userPasswordFalse;//will return error message to fix password if password check is not true
        } else {//else if both username and password checks are true registration is successful 
            registerSuccess = "You have been successfully registered !";
            return registerSuccess; //returns a registration successful message
        }//end if

    } //registerUser method end
    
   //method to prompt for userInfor to login
    public void getLoginInfor() 
    {//begin login infor
        loginUsername = JOptionPane.showInputDialog(null, "Please enter your username to login to your account.");
        loginPassword = JOptionPane.showInputDialog(null, "Please enter your password to login to your account.");
    }//end login infor
   
   //boolean method to verfy login details match the register details and returns true or false
    public Boolean loginUser() 
   {//begin loginUser()
        
    /*
    =============Code Attribution====================
    Author: w3schools
    Website: https://www.w3schools.com/java/ref_string_equals.asp#:~:text=The%20equals()%20method%20compares,to%20compare%20two%20strings%20lexicographically.
    Date of Access: 22 April 2023
    =============Code Attribution====================
    */
       //if statement using equal to method to compare the login creds with the register creds
        if (loginPassword.equals(userPassword) && loginUsername.equals(userName))//login credentials check
        {//begin if true statement
            return true;
        }//end if true statement
        else
        {//begin false statement
            return false;
        }//end false statement
        
        
    } //loginUser check method end
    
//method to return approperiate message for a successful or unsuccessful login and repompt user if false
public void returnLoginStatus()
    {//begin returnLoginStatus method
    //while the method loginUser() is false, i.e. UserName and Password is false, show error message and repompt user
    while(!loginUser())
    {//begin while loginUser() is false ==> user Login name and password will be repompted
        JOptionPane.showMessageDialog(null, "Username or password is incorrect, please try again","",0);
        getLoginInfor();
    }//end while loginUser() is false ==> user Login name and password will be repompted
    //if the boolean loginSuccess = true
    if(loginUser())
    {//begin if successful login
        JOptionPane.showMessageDialog(null,"Login is Successful"+"\nWelcome "+firstName+", "+lastName+" it is great to see you again");
    }//end if unsuccessful login
    
}//end returnLoginStatus method


//set methods for unit testing to assign the string that we are testing

public void setUserName(String userName)
{//begin 
this.userName = userName;
}//end

public void setPassword(String userPassword)
{//begin
this.userPassword = userPassword;
}//end
   
public void setLoginUserName(String loginUsername)
{//begin
this.loginUsername = loginUsername;
}//end

public void setLoginUserPassword(String loginPassword)
{//begin
this.loginPassword = loginPassword;
}//end 
}//end login class

