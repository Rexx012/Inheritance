import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.SwingConstants;

public class MoreAboutMe extends MainFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MoreAboutMe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 852);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 30, 30));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("<html>MORE ABOUT <font color = '#90EE90'>ME</font></html>");
		heading.setForeground(new Color(255, 255, 255));
		heading.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 87));
		heading.setBounds(296, 52, 668, 74);
		contentPane.add(heading);
		
		JPanel bar = new JPanel();
		bar.setBackground(new Color(192, 192, 192));
		bar.setBounds(0, 175, 1264, 2);
		contentPane.add(bar);
		
		JLabel circle = new JLabel("");
		circle.setIcon(new ImageIcon("C:\\Users\\gio4g\\eclipse-workspace\\PortfolioFinal\\circle.png"));
		circle.setBounds(477, 282, 300, 300);
		
		//button declarations and functions
		JButton skillsButton = new JButton("Skills");
		skillsButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		skillsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SkillsFrame goToSkills = new SkillsFrame();
				 goToSkills.setVisible(true);
				 dispose();
				
			}
		});
		
		JButton worksButton = new JButton("Works");
		worksButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		worksButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Works goToWorks = new Works();
				goToWorks.setVisible(true);
				dispose();
			}
		});
		
		JButton educationButton = new JButton("<html>Educational<br> Background</html>");
		educationButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		educationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Education goToEducation = new Education();
				goToEducation.setVisible(true);
				dispose();
			}
		});
		
		JButton contactButton = new JButton("Contact");
		contactButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contact goToContact = new Contact();
				goToContact.setVisible(true);
				dispose();
			}
		});
		
		
		
		//Buttons settings
		skillsButton.setForeground(new Color(255, 255, 255));
		skillsButton.setOpaque(false);
		skillsButton.setContentAreaFilled(false);
		skillsButton.setFocusable(false);
		skillsButton.setBorder(new LineBorder(new Color(255, 255, 255)));
		skillsButton.setFont(new Font("YouYuan", Font.PLAIN, 20));
		skillsButton.setBounds(296, 284, 244, 93);
		contentPane.add(skillsButton);
		
		worksButton.setOpaque(false);
		worksButton.setForeground(Color.WHITE);
		worksButton.setFont(new Font("YouYuan", Font.PLAIN, 20));
		worksButton.setFocusable(false);
		worksButton.setContentAreaFilled(false);
		worksButton.setBorder(new LineBorder(new Color(255, 255, 255)));
		worksButton.setBounds(720, 284, 244, 93);
		contentPane.add(worksButton);
		
		educationButton.setOpaque(false);
		educationButton.setForeground(Color.WHITE);
		educationButton.setFont(new Font("YouYuan", Font.PLAIN, 20));
		educationButton.setFocusable(false);
		educationButton.setContentAreaFilled(false);
		educationButton.setBorder(new LineBorder(new Color(255, 255, 255)));
		educationButton.setBounds(296, 490, 244, 93);
		contentPane.add(educationButton);

		contactButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contactButton.setOpaque(false);
		contactButton.setForeground(Color.WHITE);
		contactButton.setFont(new Font("YouYuan", Font.PLAIN, 20));
		contactButton.setFocusable(false);
		contactButton.setContentAreaFilled(false);
		contactButton.setBorder(new LineBorder(new Color(255, 255, 255)));
		contactButton.setBounds(720, 490, 244, 93);
		contentPane.add(contactButton);
		
		
		
		//instance for BackButton
		BackButton backButton = new BackButton();
		backButton.setBounds(573, 638, 114, 41);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    MainFrame goBack = new MainFrame();
			    goBack.setVisible(true);
			    dispose();
		    }
		});

		 contentPane.add(backButton);
		 
 	
	
		contentPane.add(circle);
		
		//--------footer--------
		
		//                 will give the imagePath and width and height to the pics class parameters 
		pics setLogo = new pics("zoro.png",62, 60);
		setLogo.setBounds(600, 690, 62, 48);
        contentPane.add(setLogo);
        
		//                 will set the quote font. and foreground and give to quotes parameters 
        //                 The  <br> tag is used to create a break line 
        quotes setQuotes = new quotes("\"Nothing happened.\"<br><font color = '#90EE90'>-Roronoa Zoro</font>", 
                                       new Font("Yu Gothic UI Light", Font.ITALIC, 16),
                                       Color.WHITE);
        setQuotes.setHorizontalAlignment(SwingConstants.CENTER);
        setQuotes.setBounds( 436,728, 386, 74);
        contentPane.add(setQuotes);
        

        
	}
}
