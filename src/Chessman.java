import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JComponent;


public class Chessman {

	//wanjia
	Player player;
	//颜色0-3:蓝 红 黄 绿
	int color;
	//id
	int id;
	//地图上的位置
	int point;
	//方向
	int direction = 0;
	//完成标识
	int flag = 0;
	//image
	private String[] imagePath={"b1.png","b2.png","b3.png","b4.png",
			"r1.png","r2.png","r3.png","r4.png",
			"y1.png","y2.png","y3.png","y4.png",
			"g1.png","g2.png","g3.png","g4.png",};
	public Image image;

	//方向编号
	public final int down = 0;
	public final int left = 1;
	public final int right = 2;
	public final int up = 3;
	
	//构造方法
	Chessman(Player player, int id){
		this.player = player;
		this.id = id;
		this.point = player.getLocation()*5+id;
		image = Toolkit.getDefaultToolkit().getImage(imagePath[color]);
		
	}
	
}
