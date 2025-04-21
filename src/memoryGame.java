import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.Icon;
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
	Icon image1 = createIconImage("2Diamonds.png");
	Icon image11 = createIconImage("2Diamonds.png");
	Icon image2 = createIconImage("3ofClubs.jpg");
	Icon image22 = createIconImage("3ofClubs.jpg");
	Icon image3 = createIconImage("9Diamonds.jpg");
	Icon image33 = createIconImage("9Diamonds.jpg");
	Icon image4 = createIconImage("10Hearts.jpg");
	Icon image44 = createIconImage("10Hearts.jpg");
	//JLabel image5 = createLabelImage("8Spades.jpg");
	Random rand = new Random();
	ArrayList<Icon> list = new ArrayList<>();
	ArrayList<Icon> list2 = new ArrayList<Icon>();
    ArrayList<memoryGameCard> list3 = new ArrayList<memoryGameCard>();
	
	public void setup() {
		
		
		
		frame = new JFrame();
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel = new JPanel();
		secondPanel = new JPanel();
		imagePanel = new JPanel();
		
		GridLayout layout = new GridLayout(2,4);
		secondPanel.setLayout(layout);
		
		//image2.setSize(new Dimension(10,10));
		
		frame.add(mainPanel);
		mainPanel.add(secondPanel);
		
		list2.add(image1);
		list2.add(image2);
		list2.add(image3);
		list2.add(image4);
		list2.add(image11);
		list2.add(image22);
		list2.add(image33);
		list2.add(image44);
		
		Collections.shuffle(list2);
		
		for (Icon image: list2) {
		memoryGameCard card = new memoryGameCard(image);
		secondPanel.add(card);
		//card.setLabel("placeholder");
		card.addActionListener(this);

		list3.add(card);
		
		}
		
		
		
	
		
		
		frame.pack();
	}
	
	private ImageIcon createIconImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new ImageIcon();
		}
		ImageIcon icon = new ImageIcon(imageURL);
	
		return icon;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		memoryGameCard buttonPressed = (memoryGameCard) e.getSource();
		
		buttonPressed.setIcon(buttonPressed.icon);
		
	}
	
	
	
	
	
	
}
