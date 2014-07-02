
public class Launch {
	
	public static void main(String[] args){
		
		Player player = new Player();
		Net net = new Net();
		Hall hall = new Hall(net,player);
		MainFrame frame = new MainFrame(150,30,600,630,hall);
		
		
		
	}

}
