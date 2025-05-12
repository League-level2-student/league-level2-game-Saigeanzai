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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class memoryGame implements ActionListener {

	JFrame frame;
	JPanel mainPanel;
	JPanel secondPanel;
	JPanel imagePanel;
	Icon image1 = createIconImage("2Diamonds.png");
	Icon image11 = createIconImage("2Diamonds.png");
	Icon image2 = createIconImage("3ofClubs.jpg");
	Icon image22 = createIconImage("3ofClubs.jpg");
	Icon image3 = createIconImage("9Diamonds.jpg");
	Icon image33 = createIconImage("9Diamonds.jpg");
	Icon image4 = createIconImage("10Hearts.jpg");
	Icon image44 = createIconImage("10Hearts.jpg");
	Icon cardBack = createIconImage("CardBack.jpg");
	// JLabel image5 = createLabelImage("8Spades.jpg");
	Random rand = new Random();
	ArrayList<Icon> list = new ArrayList<>();
	ArrayList<Icon> list2 = new ArrayList<Icon>();
	ArrayList<memoryGameCard> list3 = new ArrayList<memoryGameCard>();
	boolean imageOn = false;
	private memoryGameCard firstCard;
	private memoryGameCard secondCard;

	public void setup() {

		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel = new JPanel();
		secondPanel = new JPanel();
		imagePanel = new JPanel();

		GridLayout layout = new GridLayout(2, 4);
		secondPanel.setLayout(layout);

		// image2.setSize(new Dimension(10,10));

		frame.add(mainPanel);
		mainPanel.add(secondPanel);

		JOptionPane.showMessageDialog(null, "Flip all the cards to win");
		
		list2.add(image1);
		list2.add(image1);
		list2.add(image2);
		list2.add(image2);
		list2.add(image3);
		list2.add(image3);
		list2.add(image4);
		list2.add(image4);

		Collections.shuffle(list2);

		for (Icon image : list2) {
			memoryGameCard card = new memoryGameCard(image, cardBack);
			secondPanel.add(card);
			// card.setLabel("placeholder");
			card.addActionListener(this);
			list3.add(card);

		}

		frame.setSize(1000, 800);

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

		if (firstCard == (null) && secondCard == (null)) {
			buttonPressed.setIcon(buttonPressed.Front);
			this.firstCard = buttonPressed;
		}

		else if (secondCard == null) {
			buttonPressed.setIcon(buttonPressed.Front);
			this.secondCard = buttonPressed;

			if (firstCard.getIcon() == secondCard.getIcon()) {
				System.out.println("match!");
				if (allCardsFaceUp()) {
					System.out.println("You win!");
				}
				firstCard = null;
				secondCard = null;
			}

		}

		else {
			firstCard.setIcon(cardBack);
			secondCard.setIcon(cardBack);
			firstCard = null;
			secondCard = null;
			
		}
		/*
		 * 
		 * if (imageOn==false) { buttonPressed.setIcon(buttonPressed.icon);
		 * imageOn=true; } else if (imageOn==true) { buttonPressed.setIcon(null);
		 * imageOn=false; }
		 * 
		 * if (this.oldIcon.equals(null)) { this.oldIcon = buttonPressed; }
		 * 
		 * else if (buttonPressed.equals(this.oldIcon)) {
		 * 
		 * System.out.println("testing"); } else { buttonPressed.setIcon(null);
		 * this.oldIcon.setIcon(null); this.oldIcon = null; }
		 * 
		 * 
		 */

	}

	private boolean allCardsFaceUp() {
		for (memoryGameCard image : list3) {
			if (image.getIcon()==cardBack) {
			return false;
			}
		}
		return true;
	}
}
