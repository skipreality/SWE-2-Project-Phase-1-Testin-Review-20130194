/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
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
public class SearchGameTest {
    
    public SearchGameTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
   
@Test

//is not working normally
public void GetGamesTest() {
    GamesHandler X = new GamesHandler("games.txt");
    ArrayList<Game> list = new ArrayList<Game>();
    Game game = new Game(1,"Capitals","Omnia");
    list.add(game);
    //list.add(new Game(2,"Fruits & Vegies","Mohamed"));
    ArrayList<Game> games = X.getGames();
    Assert.assertEquals(list,games);
}


@Test

//is not working normally
public void testTeachergames() {
    String tn = "Omnia";
    GamesHandler x = new GamesHandler("games.txt");
    ArrayList<Game>estimate = new ArrayList<Game>();
    estimate.add(new Game(1,"Capitals","Omnia"));
    ArrayList<Game>actual = x.teacherGames(tn);
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
