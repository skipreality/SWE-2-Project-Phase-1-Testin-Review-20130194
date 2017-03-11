/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
public class TrueFalseTest {
    
    public TrueFalseTest() {
    }
    
    @DataProvider(name ="loadgame")
    public Object[][] loadvalue() {
        return new Object[][] {
            new Object[] {"Capital","hi","hi"},
	    new Object[] {"Fruits & Vegies","llo","llo" },
        };
    }
 

    @DataProvider(name ="writegame")
    public Object[][] writevalue() {
        return new Object[][] {
            new Object[] {"Capital"},
            new Object[] {"Fruits & Vegies" },
        };
    }
    
    
    @Test(dataProvider = "loadgame")
    public void LoadGame(String name,String rab,String rab2) throws IOException {
	//1 & t are default values
	//rab this is newvalue I added it to sure that 2 file equale (too rab2) 
	TrueFalseGame tt=new TrueFalseGame(1,name, "t");
	tt.loadGame();
	FileReader in = new FileReader("Games/"+ name +".txt");
	BufferedReader ff=new BufferedReader(in);
	ArrayList<String> newarr = new ArrayList<String>();
	String Q,A;
        while(ff.ready()) {
            Q = ff.readLine();
            A = ff.readLine();
            newarr.add(Q);
            newarr.add(A);
        }
        
        newarr.add(rab);
        tt.q_a.add(rab2);
        in.close();
        Assert.assertEquals(newarr, tt.q_a );
  }
    
    
    @Test(dataProvider = "writegame")
    public void WriteGame(String name) throws IOException {
	// 1 & t are default values beacause function writegame independent on id & name of teacher
	TrueFalseGame tt=new TrueFalseGame(1,name,"t");
	tt.writeGame();
        File read = new File("Games/"+ name +".txt");
	Assert.assertEquals(true, read.exists());
	FileReader in = new FileReader(read);
	BufferedReader ff = new BufferedReader(in);
        String txt = ff.readLine();
        String twoline =ff.readLine();
		
		
	    for(String key: tt.q_a2.keySet()) {
                Assert.assertEquals(txt, key);
                Assert.assertEquals(twoline, tt.q_a2.get(key));
            }
		
            in.close();
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
