import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class memoryGame implements ActionListener {

	JFrame frame;
	JPanel mainPanel;
	JPanel secondPanel;
	JPanel imagePanel;
	JButton card1;
	JButton card2;
	JButton card3;
	JButton card4;
	JButton card5;
	JLabel image1 = createLabelImage("2Diamonds.png");
	JLabel image2 = createLabelImage("3ofClubs.jpg");
	JLabel image3 = createLabelImage("9Diamonds.jpg");
	JLabel image4 = createLabelImage("10Hearts.jpg");
	JLabel image5 = createLabelImage("8Spades.jpg");
	ArrayList<JLabel> list = new ArrayList<>();
	List<String> list2 = Arrays.asList("");

	
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
		card3 = new JButton();
		card4 = new JButton();
		card5 = new JButton();
		
		GridLayout layout = new GridLayout(2,4);
		secondPanel.setLayout(layout);
		
		image2.setSize(new Dimension(10,10));
		
		frame.add(mainPanel);
		mainPanel.add(secondPanel);
		secondPanel.add(card1);
		secondPanel.add(card2);
		secondPanel.add(card3);
		secondPanel.add(card4);
		secondPanel.add(card5);
		card1.add(image1);
		card2.add(image2);
		card3.add(image3);
		card4.add(image4);
		card5.add(image5);
		
		card1.addActionListener(this);
		
	
		
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed.equals(card1)) {
			
		}
	}
	
	
	
	
	
	
}
