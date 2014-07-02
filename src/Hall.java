import java.util.ArrayList;
import java.awt.Graphics;
import javax.swing.JComponent;


public class Hall extends JComponent {
	
	ArrayList rooms = new ArrayList();
	Net net;
	Player player;

	public Hall(Net net, Player player) {
		this.net = net;
		this.player = player;
	}
	/*
	 * 增加一个room
	 * 
	 */
	public void add(Room room){
		rooms.add(room);
	}
	/*
	 * 显示
	 */
	public void paintComponent(Graphics g){
		
	}
}
