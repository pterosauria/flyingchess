
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame(int x, int y, int width, int height, JComponent c) {
		//无标题栏和边框
		setUndecorated(true);
		//位置和大小
		setBounds(x,y,width,height);
		//layout
		setLayout(null);


		//退出按钮
		ImageIcon icon =new ImageIcon(Toolkit.getDefaultToolkit().getImage("img/quitButton.jpg").getScaledInstance(30,30, Image.SCALE_DEFAULT));
		JButton b = new JButton(icon);
		add(b);
		b.setBounds(getWidth()-30,0,30,30);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		//title
		JLabel label = new JLabel("飞行棋");
		add(label);
		label.setBounds(0,0,getWidth()-30,30);
		MouseAdapter mouseAdapter = new MouseAdapter(){
			int x,y;
			public void mousePressed(MouseEvent e){
				this.x=e.getX();
				this.y=e.getY();
			}
			public void mouseDragged(MouseEvent e){
				setLocation(getX()+e.getX()-this.x,getY()+e.getY()-this.y);
			}
		};
		label.addMouseMotionListener(mouseAdapter);
		label.addMouseListener(mouseAdapter);
		
		//view panel
		if(c!=null){
			add(c);
			c.setBounds(0,30,getWidth(),getHeight()-30);
		}
		
		setVisible(true);
	}
	
	/*
	 * 
	 */
	public void setContent(JComponent c){
		if(c != null){
			add(c);
			c.setBounds(0,30,getWidth(),getHeight()-30);
		}
	}

}
