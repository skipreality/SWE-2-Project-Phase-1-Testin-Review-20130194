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
public class AddUserTest {
    
    public AddUserTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    @Test
    //There is an error that this function can't handle it 
    //if we add some people and remove them again then we can't add them any more
    public void AddUserTest() throws Exception {
        System.out.println("addUser");
        User []user = {new User(1,"omnia","shawki","778899","student"),new User(2,"Mohamed","Khaled","556677","teacher")};
        UsersHandler instance = new UsersHandler("users.txt");
        boolean expResult = true;
        
        for(int i=0;i<user.length;i++) {
        boolean result = instance.addUser(user[i]);
        assertEquals(expResult, result);
        System.out.println(expResult);
        }
    
    }
    
    @Test
    
    public void testAddUser() throws Exception {
        UsersHandler obj = new UsersHandler("users.txt");
        User user = new User(9,"raja","rabie","77889900","student");
        boolean estimate = true;
        boolean actual = obj.addUser(user);
        Assert.assertEquals(estimate, actual);
       
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
