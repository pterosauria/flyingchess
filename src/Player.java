import java.awt.event.*;

public class Player extends MouseAdapter implements MouseListener {
	
	//name
	private String name;
	//棋子
	private Chessman[] chessman = new Chessman[4];
	//位置
	private int location;
	//yanse
	private int color;
	
	public Player() {
	}
	/*
	 * location 
	 */
	public int getLocation(){
		return location;
	}
	
}
