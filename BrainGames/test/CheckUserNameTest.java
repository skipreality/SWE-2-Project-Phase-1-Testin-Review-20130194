/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.testng.Assert;
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
public class CheckUserNameTest {
    
    public CheckUserNameTest() {
    }
    
    
    
    
    
    
    @Test
    //testing only username from the file working normally 
    public void testCheckUsername() throws Exception {
        User username = new User(2,"Mohamed","Amer","556677","teacher");
        UsersHandler obj = new UsersHandler("users.txt");
        boolean estimate = true;
        boolean actual = obj.checkUsername(username);
        Assert.assertEquals(estimate, actual);
        
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
