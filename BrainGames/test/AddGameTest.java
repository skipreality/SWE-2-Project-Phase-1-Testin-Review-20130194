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
public class AddGameTest {
    
    public AddGameTest() {
    }

    
    
    
    
    
    
        
    @Test  
    
    public void AddGameTest() throws Exception {
        System.out.println("addGame");
        Game []game = {new Game(5,"football", "mohamed"),new Game(7,"volly","ali")};
        GamesHandler instance = new GamesHandler("games.txt");
        boolean expResult = true;
       
        for(int i=0;i<game.length;i++) {
        boolean result = instance.addGame(game[i]);
        System.out.print(result);
        assertEquals(expResult, result);
    }
         
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
