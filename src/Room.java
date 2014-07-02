import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.JComponent;


public class Room extends JComponent implements MouseListener {

	Player[] player = new Player[4];
	Chessboard cb = new Chessboard();
	Chessman[] cm = new Chessman[16];
	
	public Room() {
		
	}
	
	/*
	 * 显示
	 */
	public void paintComponent(Graphics g){
		g.drawImage(cb.bg,0,0,getWidth(),getHeight(),this);
		//棋子
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				g.drawImage(cm[i*4+j].image,cb.cellPoints[cm[i*4+j].point].x*getWidth()/15,
						cb.cellPoints[cm[i*4+j].point].x*getHeight()/15,getWidth()/15,getHeight()/15,this);
			}
		}
	}
	/*
	 * mouse listener
	 */
	public void mouseClicked(MouseEvent e){
		
	}
	public void mousePressed(MouseEvent e){
		
	}
	public void mouseReleased(MouseEvent e){
		
	}
	public void mouseEntered(MouseEvent e){
		
	}
	public void mouseExited(MouseEvent e){
		
	}

}
