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
public class CheckUserTest {
    
    public CheckUserTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    
    
    @Test
    //if we change id it would run normally but it isn't working in case of change any another parameter
    public void CheckUserTest() throws Exception {
        User user = new User(2,"Mohamed","Khaled","556677","teacher");
        UsersHandler obj  = new UsersHandler("users.txt");
        boolean estimate = true;
        boolean actual = obj.checkUser(user);
        Assert.assertEquals(estimate,actual);
    }

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
