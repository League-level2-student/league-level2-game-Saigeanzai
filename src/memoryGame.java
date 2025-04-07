import java.awt.Dimension;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class memoryGame {

	JFrame frame;
	JPanel mainPanel;
	JPanel secondPanel;
	JPanel imagePanel;
	JButton card1;
	JButton card2;
	JLabel image1 = createLabelImage("2Diamonds.png");
	JLabel image2 = createLabelImage("3Clubs.jpg");
	
	public void setup() {
		
		frame = new JFrame();
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel = new JPanel();
		secondPanel = new JPanel();
		imagePanel = new JPanel();
		card1 = new JButton();
		card2 = new JButton();
		
		image2.setSize(new Dimension(10,10));
		
		frame.add(mainPanel);
		mainPanel.add(secondPanel);
		secondPanel.add(card1);
		secondPanel.add(card2);
		card1.add(image1);
		card2.add(image2);
		
	
		
		
		frame.pack();
	}
	
	private JLabel createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		ImageIcon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
	
		return imageLabel;
	}
	
	
	
	
	
	
}
