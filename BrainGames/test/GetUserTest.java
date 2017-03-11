/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author DesTrUcTioN
 */
public class GetUserTest {
    
    public GetUserTest() {
    }
    
    
    
    
    
    @Test
    
    public void GetUserTest() {
        RegistrationForm Us = new RegistrationForm();
        // Test Info (Expected)
        User X = new User("Mohamed","2234660","Amer","Teacher"); 
        // User Info Entery (Actual)
        Us.usernameTF.setText("Mohamed");
        Us.nameTF.setText("Amer");
        Us.passwordField.setText("2234660");
        Us.type.setSelectedItem("Teacher");
        //Test Function
        assertEquals(X, Us.getUser());
    }
    
    @Test
    
    public void UserTestSettersGetters(){
        //Test A sample of Setters & Getters 
        User X = new User();
        X.setName("Omar Khaled");
        assertEquals("Omar Khaled", X.getName()); 
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
