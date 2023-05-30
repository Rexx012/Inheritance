import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SkillsFrame extends MainFrame{

	private JPanel contentPane;
	
	public SkillsFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 852);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 30, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel skillsHeading = new JLabel("<html><font color = '#90EE90'>S</font>KILLS</html>");
		skillsHeading.setVerticalAlignment(SwingConstants.BOTTOM);
		skillsHeading.setHorizontalAlignment(SwingConstants.LEFT);
		skillsHeading.setForeground(new Color(255, 255, 255));
		skillsHeading.setFont(new Font("Yu Gothic", Font.PLAIN, 75));
		skillsHeading.setBounds(499, 41, 271, 84);
		contentPane.add(skillsHeading);
		
		JPanel barOne = new JPanel();
		barOne.setBounds(390, 137, 500, 1);
		contentPane.add(barOne);
		
		JPanel barTwo = new JPanel();
		barTwo.setBackground(new Color(144, 238, 144));
		barTwo.setBounds(503, 163, 260, 1);
		contentPane.add(barTwo);
		
		//Skills Icons
		JLabel logoThree = new JLabel("");
		logoThree.setIcon(new ImageIcon("C:\\Users\\gio4g\\eclipse-workspace\\PortfolioFinal\\css.png"));
		logoThree.setBounds(963, 230, 64, 64);
		contentPane.add(logoThree);
		
		JLabel logoTwo = new JLabel("");
		logoTwo.setIcon(new ImageIcon("C:\\Users\\gio4g\\eclipse-workspace\\PortfolioFinal\\java.png"));
		logoTwo.setBounds(612, 230, 64, 64);
		contentPane.add(logoTwo);
		
		JLabel logoOne = new JLabel("");
		logoOne.setIcon(new ImageIcon("C:\\Users\\gio4g\\eclipse-workspace\\PortfolioFinal\\html.png"));
		logoOne.setBounds(263, 230, 64, 64);
		contentPane.add(logoOne);
		
		JPanel containerOne = new JPanel();
		containerOne.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		containerOne.setBackground(new Color(41, 41, 41));
		containerOne.setBounds(165, 269, 250, 300);
		contentPane.add(containerOne);
		containerOne.setLayout(null);
		
		JLabel skillTitleOne = new JLabel("HTML");
		skillTitleOne.setVerticalAlignment(SwingConstants.TOP);
		skillTitleOne.setHorizontalAlignment(SwingConstants.LEFT);
		skillTitleOne.setFont(new Font("Yu Gothic", Font.BOLD, 24));
		skillTitleOne.setForeground(new Color(255, 255, 255));
		skillTitleOne.setBounds(93, 42, 73, 31);
		containerOne.add(skillTitleOne);
		
		JLabel htmlText = new JLabel("<html>HTML stands for HyperText Markup Language. It is a standard markup language for web page creation.</html>");
		htmlText.setVerticalAlignment(SwingConstants.TOP);
		htmlText.setHorizontalAlignment(SwingConstants.CENTER);
		htmlText.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		htmlText.setForeground(new Color(255, 255, 255));
		htmlText.setBounds(22, 81, 205, 135);
		containerOne.add(htmlText);
		
		JPanel containerTwo = new JPanel();
		containerTwo.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		containerTwo.setBackground(new Color(41, 41, 41));
		containerTwo.setBounds(515, 269, 250, 300);
		contentPane.add(containerTwo);
		containerTwo.setLayout(null);
		
		JLabel skillTitleTwo = new JLabel("JAVA");
		skillTitleTwo.setBounds(98, 42, 58, 28);
		skillTitleTwo.setVerticalAlignment(SwingConstants.TOP);
		skillTitleTwo.setHorizontalAlignment(SwingConstants.LEFT);
		skillTitleTwo.setForeground(Color.WHITE);
		skillTitleTwo.setFont(new Font("Yu Gothic", Font.BOLD, 24));
		containerTwo.add(skillTitleTwo);
		
		JLabel javaText = new JLabel("<html>Java is a widely used object-oriented programming language and software platform that runs on billions of devices. </html>");
		javaText.setVerticalAlignment(SwingConstants.TOP);
		javaText.setHorizontalAlignment(SwingConstants.CENTER);
		javaText.setForeground(Color.WHITE);
		javaText.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		javaText.setBounds(22, 81, 205, 143);
		containerTwo.add(javaText);
		
		JPanel containerThree = new JPanel();
		containerThree.setBorder(new LineBorder(new Color(144, 238, 144), 1, true));
		containerThree.setBackground(new Color(41, 41, 41));
		containerThree.setBounds(865, 269, 250, 300);
		contentPane.add(containerThree);
		containerThree.setLayout(null);
		
		JLabel skillTitleThree = new JLabel("CSS");
		skillTitleThree.setVerticalAlignment(SwingConstants.TOP);
		skillTitleThree.setHorizontalAlignment(SwingConstants.LEFT);
		skillTitleThree.setForeground(Color.WHITE);
		skillTitleThree.setFont(new Font("Yu Gothic", Font.BOLD, 24));
		skillTitleThree.setBounds(105, 42, 49, 28);
		containerThree.add(skillTitleThree);
		
		JLabel cssText = new JLabel("<html> CSS is a computer language for laying out and structuring web pages.This language contains coding elements and is composed of these “cascading style sheets” . </html>");
		cssText.setVerticalAlignment(SwingConstants.TOP);
		cssText.setHorizontalAlignment(SwingConstants.CENTER);
		cssText.setForeground(Color.WHITE);
		cssText.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		cssText.setBounds(22, 81, 205, 208);
		containerThree.add(cssText);
		
		//instance for BackButton
		BackButton backButton = new BackButton();
	    backButton.setBounds(573, 638, 114, 41);
	    backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MoreAboutMe goBack = new MoreAboutMe();
                goBack.setVisible(true);
                dispose();
            }
        });
	    contentPane.add(backButton);
	        
	    //--------footer--------
	    
		//      will give the imagePath and width and height to the pics class parameters 
		pics setLogo = new pics("sanji.png",62, 48);
		setLogo.setBounds(600, 690, 62, 48);
		contentPane.add(setLogo);
		
		//                 will set the quote font. and foreground and give to quotes parameters 
		//                 The  <br> tag is used to create a break line 
		quotes setQuotes = new quotes("\"Thanks, I needed a light.\"<br><font color = '#90EE90'>-Vinsmoke Sanji</font>", 
		                            new Font("Yu Gothic UI Light", Font.ITALIC, 16),
		                            Color.WHITE);
		setQuotes.setHorizontalAlignment(SwingConstants.CENTER);
		setQuotes.setBounds( 436,728, 386, 74);
		contentPane.add(setQuotes);
	}
}
