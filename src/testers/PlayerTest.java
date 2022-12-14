package testers;

import player.Player;

import static org.junit.Assert.*;

import org.junit.*;
 
public class PlayerTest {
    private Player player;

    @Before
    public void init() {
        player = new Player(null, null);
    }

    @Test
    public void testSetGetName() {
        String name = "Camilo";
        player.setName(name);
        assertEquals("Tester set-get name:\n - Expected --> " + name + "\n - Received --> " + player.getName() , name, player.getName());
    }

    @Test
    public void testGetID() {
        int id = 1;
        assertEquals("Tester getID():\n - Expected --> " + id + "\n - Received --> " + player.getID() , id, player.getID());   
    }
    
}
