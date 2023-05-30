import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


	//to be use for the pics part of each frame
	class pics extends JLabel {
		
		public pics(String imagePath, int width, int height) {
	        ImageIcon icon = new ImageIcon(imagePath);
	        Image img = icon.getImage();
	        Image scaledImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	        ImageIcon scaledIcon = new ImageIcon(scaledImg);
	
	        setIcon(scaledIcon);
	    }
	
	}
	// to be use for the quotes part of each frame
	class quotes extends JLabel {
		
		public quotes(String quote, Font font, Color textColor) {
	        setText("<html><center>" + quote + "</center></html>");
	        setForeground(textColor);
	        setFont(font);
		
		}
		
	}
	//re-use to make boxes
	class Boxes extends JPanel {
	
		public Boxes() {
			setBorder(new LineBorder(new Color(144, 238, 144)));
			setBackground(new Color(41, 41, 41));
			setLayout(null);
		}
		
	}


