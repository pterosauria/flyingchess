/*
 * 棋盘右下角开始逆时针玩家编号0-3
 * 当前玩家总在右下角
 */
import java.awt.*;
import javax.swing.*;


public class Chessboard {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//
	//对棋子点线性标号，其与坐标点的对应关系数组
	Point[] cellPoints = {new Point(13,13), new Point(12,13), new Point(13,12), new Point(12,12),new Point(11,14),
			new Point(1,12), 	new Point(2,12), 	new Point(1,13), 	new Point(2,13), 	new Point(3,14),
			new Point(1,1), 	new Point(2,1), 	new Point(1,2), 	new Point(2,2), 	new Point(0,3),
			new Point(12,1), 	new Point(13,1), 	new Point(12,2), 	new Point(13,2), 	new Point(11,0),
			new Point(13,10), 	new Point(12,10), 	new Point(11,10), 	new Point(10,11), 	new Point(10,12),
			new Point(10,13), 	new Point(10,14), 	new Point(9,14), 	new Point(8,14), 	new Point(7,14),
			new Point(6,14), 	new Point(5,14), 	new Point(4,14), 	new Point(4,13), 	new Point(4,12),
			new Point(4,11), 	new Point(3,10), 	new Point(2,10), 	new Point(1,10), 	new Point(0,10),
			new Point(0,9), 	new Point(0,8),		new Point(0,7) ,	new Point(0,6),		new Point(0,5),
			new Point(0,4), 	new Point(1,4), 	new Point(2,4), 	new Point(3,04), 	new Point(4,3),
			new Point(4,2), 	new Point(4,1), 	new Point(4,0), 	new Point(5,0), 	new Point(6,0),
			new Point(7,0), 	new Point(8,0), 	new Point(9,0), 	new Point(10,0), 	new Point(10,1),
			new Point(10,2), 	new Point(10,3), 	new Point(11,4), 	new Point(12,4), 	new Point(13,4),
			new Point(14,4), 	new Point(14,5), 	new Point(14,6), 	new Point(14,7), 	new Point(14,8),
			new Point(14,9), 	new Point(14,10)};
	//棋盘数据，-1代表无，0-15代表16颗棋子
	private int[] cellData = new int[92];
	//image资源
	private String[] imagePath={"map.png","map.png","map.png","map.png"};
	//yansedaoshuzi
	public final int blue = 0;
	public final int red = 1;
	public final int yellow = 2;
	public final int green = 3;
	
	public Image bg;
	
	public Chessboard(){
		setColor(Color.BLUE);
	}
	public Chessboard(Color color){
		setColor(color);
	}
	
	//参数：color-玩家颜色
	public void setColor(Color color) {
		//shezhi color
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		if(color == Color.BLUE){
			bg = toolkit.getImage("img/"+imagePath[blue]);
		}
		else if(color == Color.RED){
			bg = toolkit.getImage("img/"+imagePath[red]);
		}
		else if(color == Color.YELLOW ){
			bg = toolkit.getImage("img/"+imagePath[yellow]);
		}
		else if(color == Color.GREEN){
			bg = toolkit.getImage("img/"+imagePath[green]);
		}
	}

	//画棋盘棋子
	public void paintComponent(Graphics g){
	}

}

