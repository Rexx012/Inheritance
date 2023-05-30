import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Education extends MainFrame {

	private JPanel contentPane;

	public Education() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 852);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 30, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleOne = new JLabel("<html><font color = '#90EE90'>E</font>DUCATIONAL</html>");
		titleOne.setForeground(new Color(255, 255, 255));
		titleOne.setVerticalAlignment(SwingConstants.BOTTOM);
		titleOne.setFont(new Font("Yu Gothic", Font.PLAIN, 75));
		titleOne.setBounds(100, 45, 512, 98);
		contentPane.add(titleOne);
		
		JLabel titleTwo = new JLabel("BACKGROUND");
		titleTwo.setVerticalAlignment(SwingConstants.TOP);
		titleTwo.setForeground(Color.WHITE);
		titleTwo.setFont(new Font("Yu Gothic", Font.PLAIN, 75));
		titleTwo.setBounds(626, 88, 529, 77);
		contentPane.add(titleTwo);
		
		//Decoration
		JPanel underlineOne = new JPanel();
		underlineOne.setBounds(100, 145, 512, 1);
		contentPane.add(underlineOne);
		
		JPanel underlineTwo = new JPanel();
		underlineTwo.setBackground(new Color(144, 238, 144));
		underlineTwo.setBounds(626, 169, 529, 1);
		contentPane.add(underlineTwo);
		
		JLabel schoolOne = new JLabel("<html><b><font color = '#90EE90'>-</font> Mandaluyong High School</b>\r\n<li>Rev. Aglipay, Poblacion, Mandaluyong City, Metro Manila</li>\r\n<li>Studied from 2016-2020 </li>\r\n</html>");
		schoolOne.setForeground(new Color(255, 255, 255));
		schoolOne.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		schoolOne.setBounds(100, 308, 254, 170);
		contentPane.add(schoolOne);
		
		JLabel schoolTwo = new JLabel("<html><b><font color = '#90EE90'>-</font> Arellano University - Plaridel</b>\r\n<li>53 Gen. Kalentong St., Mandaluyong City</li>\r\n<li>Studied from 2020-2022 </li>\r\n<li>Strand - Information Communication Technology</li>\r\n</html>");
		schoolTwo.setForeground(Color.WHITE);
		schoolTwo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		schoolTwo.setBounds(467, 296, 304, 222);
		contentPane.add(schoolTwo);
		
		JLabel schoolThree = new JLabel("<html><b><font color = '#90EE90'>-</font> National University - Manila</b>\r\n<li>551 M.F. Jhocson St, Sampaloc, Manila, 1008 Metro Manila</li>\r\n<li>B.S Information Technology  with specialization in Mobile And Web Applications  </li><li>Expected to graduated 2026  </li></html>");
		schoolThree.setForeground(Color.WHITE);
		schoolThree.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 20));
		schoolThree.setBounds(851, 310, 304, 248);
		contentPane.add(schoolThree);
		
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
	    
	    
        //will give the imagePath and width and height to the pics class parameters 
		pics setLogo = new pics("robin.png",62, 60);
		setLogo.setBounds(600, 690, 62, 48);
		contentPane.add(setLogo);
		
		//                 will set the quote font. and foreground and give to quotes parameters 
		//                 The  <br> tag is used to create a break line 
		quotes setQuotes = new quotes("\"I WANT TO LIVE!!\"<br><font color = '#90EE90'>-Robin</font>", 
		                            new Font("Yu Gothic UI Light", Font.ITALIC, 16),
		                            Color.WHITE);
		setQuotes.setHorizontalAlignment(SwingConstants.CENTER);
		setQuotes.setBounds( 436,728, 386, 74);
		contentPane.add(setQuotes);
		

		
	
	}
}
