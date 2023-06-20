package st10251759_part4_poe;

/*
=====================================Student Information=================================================
Student Number:     st10251759
Student Name:       Cameron Chetty
Course:             BCAD PROG5112
Group:              1
==========================================================================================================
*/
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import st10251759_part4_poe.Login;
/*
    =============Code Attribution====================
    Author: VCSOIT - Sarina
    Website: https://www.youtube.com/watch?v=1Pa15vDWG-8&list=PL480DYS-b_kfHSYf2yzLgto_mwDr_U-Q6&index=4
    Date of Access: 29 April 2023
    =============Code Attribution====================
    */

public class LoginTest {
   //Variable Actual => the boolean value when the method runs 
    //Variable Expected => the boolean value of a patricular result from a method
    public LoginTest() {
    }

    Login login = new Login("Cameron", "Chetty");

    /**
     * test the validity of the username method --> checkUserName() if it is true
     */
    @Test
    public void testCheckUserNameCorrect() {
    login.setUserName("kyl_1");
        boolean Actual = login.checkUserName();
        boolean Expected = true;
    
        assertEquals(Expected, Actual);
    }

    //test the validity of the username methodm --> checkUserName() if it is false
    @Test
    public void testCheckUserNameInCorrect() {
        login.setUserName("kyle!!!!!");
        boolean Actual = login.checkUserName();
        boolean Expected = false;
    
        assertEquals(Expected, Actual);
    }
     /**
     * Test of checkPasswordComplexity method Correct, of class Login.
     */
    @Test
    public void testCheckPasswordComplexityCorrect() {
       login.setPassword("Ch&&sec@ke99!");
       boolean Actual = login.checkPasswordComplexity();
       boolean Expected = true;
    
        assertEquals(Expected, Actual);
    }
     /**
     * Test of checkPasswordComplexity method InCorrect, of class Login.
     */
    @Test
    public void testCheckPasswordComplexityInCorrect() {
       login.setPassword("password");
       boolean Actual = login.checkPasswordComplexity();
       boolean Expected = false;
    
        assertEquals(Expected, Actual);
    }

    
        //test the validity of the username method --> checkUserName() if it is true -- actual should be true
    @Test
    public void testUserNameTrue(){
        
        login.setUserName("kyl_1");
        boolean actual = login.checkUserName();

        assertTrue(actual);
    }

   //test the validity of the username method --> checkUserName() if it is false --actual should be false
    @Test
    public void testUserNameFase() {
        login.setUserName("kyle!!!!!");
        boolean actual = login.checkUserName();
        assertFalse(actual);
    }
    
        /**
     * Test of checkPasswordComplexity method Correct, of class Login.--> return true -- actual should be expected true
     */
    @Test
    public void testPasswordComplexityTrue() {
        login.setPassword("Ch&&sec@ke99!");
        boolean actual = login.checkPasswordComplexity();
        assertTrue(actual);
    }

        /**
     * Test of checkPasswordComplexity method InCorrect, of class Login. --> return false -- actual should be expected false
     */
    @Test
    public void testPasswordComplexityFalse() {
        login.setPassword("password");
        boolean actual = login.checkPasswordComplexity();
        assertFalse(actual);
    }

     /**
     * Test of Login method Correct, of class Login.--> return true -- actual should be expected true
     */
    @Test
    public void testLoginTrue() {
        login.setUserName("kyl_1");
        login.setPassword("Ch&&sec@ke99!");
        login.setLoginUserName("kyl_1");
        login.setLoginUserPassword("Ch&&sec@ke99!");
        boolean actual = login.loginUser();
        assertTrue(actual);
    }   
   
     /**
     * Test of Login method InCorrect, of class Login.--> return false -- actual should be expected false
     */
    @Test
    public void testLoginFalse() {
        login.setUserName("kyl_1");
        login.setPassword("Ch&&sec@ke99!");
        login.setLoginUserName("kyle!!!!");
        login.setLoginUserPassword("password");
        boolean actual = login.loginUser();
        assertFalse(actual);
    }  
}

