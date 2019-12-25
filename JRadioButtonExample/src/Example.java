import javax.swing.JFrame;

public class Example {

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(400, 400);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RadioButtonPanel rPanel = new RadioButtonPanel();
		mainFrame.add(rPanel);

	}

}
