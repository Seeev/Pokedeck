import javax.swing.*;

public class View extends JFrame{

	public View() {
		this.setTitle("Pokedeck");
		this.setSize(400, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    
	    
	    JPanel pan = new JPanel();
	    
	    this.setContentPane(pan);
	    this.setVisible(true);
	}
	
	public static void main(String[] args) {
		View view = new View();
	}
}
