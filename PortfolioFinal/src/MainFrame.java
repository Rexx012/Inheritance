import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.border.LineBorder;


public class MainFrame extends JFrame {

	private JPanel contentPane;
	
	
	public static void main(String[] args) {

		try {
			MainFrame frame = new MainFrame();
			frame.setVisible(true);
		} catch (Exception e) {
		   e.printStackTrace();
		}
			
		
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 852);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 30, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//The html font tag is used to apply multiple foreground in Jlabel 
		JLabel heading = new JLabel("<html> <font color = '#90EE90'>DE VEYRA, </font>GIO ALLEN</html>");
		heading.setForeground(new Color(255, 255, 255));
		heading.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 75));
		heading.setBounds(265, 52, 737, 74);
		contentPane.add(heading);
		
		JPanel barOne = new JPanel();
		barOne.setBackground(new Color(192, 192, 192));
		barOne.setBounds(0, 175, 1264, 2);
		contentPane.add(barOne);
		
		JLabel aboutMe = new JLabel("About Me");
		aboutMe.setForeground(new Color(255, 255, 255));
		aboutMe.setFont(new Font("Yu Gothic UI", Font.PLAIN, 48));
		aboutMe.setBounds(151, 239, 212, 81);
		contentPane.add(aboutMe);
		
		//The html tag is used so that the text is automatically go to the new line
		JLabel aboutMeInfo = new JLabel("<html><div style='text-align: justify;'>Welcome to my portfolio! I'm Gio Allen G. Deveyra, a passionate and aspiring web developer specializing in front-end and back-end development. With a strong foundation in HTML and CSS, I create beautiful and responsive websites that deliver a seamless user experience.</div></html>");
		aboutMeInfo.setHorizontalAlignment(SwingConstants.LEFT);
		aboutMeInfo.setHorizontalTextPosition(SwingConstants.LEFT);
		aboutMeInfo.setVerticalAlignment(SwingConstants.TOP);
		aboutMeInfo.setForeground(new Color(255, 255, 255));
		aboutMeInfo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		aboutMeInfo.setBounds(151, 317, 423, 216);
		contentPane.add(aboutMeInfo);
		
		JLabel myPic = new JLabel("");
        myPic.setIcon(new ImageIcon("myPhoto.png"));
        myPic.setBounds(694, 211, 458, 397);
        contentPane.add(myPic);
        
		JButton learnMoreButton = new JButton("Learn More");
		learnMoreButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		//Button Functions
		learnMoreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoreAboutMe goNext = new MoreAboutMe();
				goNext.setVisible(true);
				dispose();
			}
		});
		
		//Button settings
		learnMoreButton.setForeground(new Color(255, 255, 255));
		learnMoreButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		learnMoreButton.setBackground(new Color(30, 30, 30));
		learnMoreButton.setFocusable(false);
		learnMoreButton.setBorder(new LineBorder(new Color(144, 238, 144)));
		learnMoreButton.setBounds(151, 499, 139, 43);
		contentPane.add(learnMoreButton);
		
		 //--------footer--------
		
		JPanel barTwo = new JPanel();
		barTwo.setBackground(new Color(192, 192, 192));
		barTwo.setBounds(315, 733, 650, 1);
		contentPane.add(barTwo);
		
		JPanel barThree = new JPanel();
		barThree.setBackground(Color.LIGHT_GRAY);
		barThree.setBounds(478, 756, 350, 1);
		contentPane.add(barThree);
		
		JPanel barFour = new JPanel();
		barFour.setBackground(Color.LIGHT_GRAY);
		barFour.setBounds(560, 781, 160, 1);
		contentPane.add(barFour);
		
		//                 will give the imagePath and width and height to the pics class parameters 
		pics setLogo = new pics("usopp.png",65, 60);
		setLogo.setBounds(610, 626, 62, 48);
        contentPane.add(setLogo);
        
		//                 will set the quote font. and foreground and give to quotes parameters 
        //                 The html <br> tag is used to create a break line 
        quotes setQuotes = new quotes("\"There comes a time where a man has to stand and fight.\" <br><font color = '#90EE90'>-Ussop</font>", 
                                       new Font("Yu Gothic UI Light", Font.ITALIC, 16),
                                       Color.WHITE);
        setQuotes.setBounds( 446, 660, 386, 74);
        contentPane.add(setQuotes);
        
       
		


	}
}
