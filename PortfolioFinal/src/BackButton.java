import javax.swing.*;
import java.awt.*;

public class BackButton extends JButton {
	
	public BackButton() {
		
		setText("GO BACK");
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setOpaque(false);
        setBorderPainted(false);
        setFocusable(false);
        setContentAreaFilled(false);
        setFont(new Font("Yu Gothic", Font.BOLD, 16));
        setForeground(new Color(144, 238, 144));

		
	}

}
