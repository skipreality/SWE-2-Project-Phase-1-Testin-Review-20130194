/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author DesTrUcTioN
 */
public class SelectUserTest {
    
    public SelectUserTest() {
    }
    
    
    
    
    @Test
    //this function is not working normally because it always return null not search in the file and get the user
    public void SelectUserTest() throws Exception {
        String username = "Mohamed";
        String password = "556677";
        UsersHandler obj = new UsersHandler("users.txt");
        User estimate = new User("Mohamed","556677");
        //error return null function selectUser
        User actual = obj.selectUser(username, password);
        Assert.assertEquals(estimate, actual); 
    }
    
    

  
    //This Function is not Working normally
    @DataProvider(name ="selectuser")
    public Object[][] addvalue() {
        return new Object[][] {
            new Object[] { "omnia", "778899","Teacher" }
        };
    }
 //**************************************************************************** 
  
    @Test(dataProvider = "selectuser")
    //This Function is not Working normally
    public void selectuser(String n, String pw,String type) throws FileNotFoundException {
        UsersHandler testuser =new UsersHandler("users.txt");
        testuser.selectUser("omnia","778899");
        Assert.assertEquals(type,testuser.selectUser(n, pw));
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
