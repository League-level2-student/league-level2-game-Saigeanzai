import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class memoryGameCard extends JButton {

	private static final long serialVersionUID = 1L;
Icon Front;
Icon Back;
	public memoryGameCard(Icon icon, Icon Back) {
		super();
		this.Front = icon;
		this.Back = Back;
		this.setIcon(Back);
	}
	
	
}
