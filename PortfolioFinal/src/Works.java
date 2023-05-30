import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Works extends MainFrame {

	private JPanel contentPane;
	
	
	public Works() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 852);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 30, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel worksHeading = new JLabel("<html>WO<font color = '#90EE90'>R</font>KS</html>");
		worksHeading.setVerticalAlignment(SwingConstants.BOTTOM);
		worksHeading.setForeground(new Color(255, 255, 255));
		worksHeading.setFont(new Font("Yu Gothic", Font.PLAIN, 75));
		worksHeading.setBounds(481, 85, 280, 75);
		contentPane.add(worksHeading);
		
		//instantiation of Boxes classes
		Boxes boxOne = new Boxes();
		boxOne.setBounds(167, 216,250,150);
		Boxes boxTwo = new Boxes();
		boxTwo.setBounds(493, 216,250,150);
		Boxes boxThree = new Boxes();
		boxThree.setBounds(820, 216,250,150);
		Boxes boxFour = new Boxes();
		boxFour.setBounds(167, 437,250,150);
		Boxes boxFive = new Boxes();
		boxFive.setBounds(493, 437,250,150);
		Boxes boxSix = new Boxes();
		boxSix.setBounds(820, 437,250,150);
		boxOne.setLayout(null);
		
		//instantiation of pics classes
		pics picOne = new pics("1.png",246,145); 
		picOne.setBounds(2,0,250,150);
		pics picTwo = new pics("2.png",246,145); 
		picTwo.setBounds(2,0,250,150);
		pics picThree = new pics("3.png",246,145); 
		picThree.setBounds(2,0,250,150);
		pics picFour = new pics("4.png",246,145); 
		picFour.setBounds(2,0,250,150);
		pics picFive = new pics("5.png",246,145); 
		picFive.setBounds(2,0,250,150);
		pics picSix = new pics("6.png",246,145); 
		picSix.setBounds(2,0,250,150);
		
		//adding pics to box panels
		boxOne.add(picOne);
		boxTwo.add(picTwo);
		boxThree.add(picThree);
		boxFour.add(picFour);
		boxFive.add(picFive);
		boxSix.add(picSix);
		
		//adding boxes to main panel 
		contentPane.add(boxOne);
		contentPane.add(boxTwo);
		contentPane.add(boxThree);
		contentPane.add(boxFour);
		contentPane.add(boxFive);
		contentPane.add(boxSix);
		
		//work titles
		JLabel workTitle1 = new JLabel("Landing page");
		workTitle1.setVerticalAlignment(SwingConstants.TOP);
		workTitle1.setHorizontalAlignment(SwingConstants.LEFT);
		workTitle1.setForeground(Color.WHITE);
		workTitle1.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		workTitle1.setBounds(167, 189, 210, 32);
		contentPane.add(workTitle1);
		
		JLabel workTitle2 = new JLabel("School website");
		workTitle2.setVerticalAlignment(SwingConstants.TOP);
		workTitle2.setHorizontalAlignment(SwingConstants.LEFT);
		workTitle2.setForeground(Color.WHITE);
		workTitle2.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		workTitle2.setBounds(493, 189, 210, 32);
		contentPane.add(workTitle2);
		
		JLabel workTitle3 = new JLabel("Responsive practice 2");
		workTitle3.setVerticalAlignment(SwingConstants.TOP);
		workTitle3.setHorizontalAlignment(SwingConstants.LEFT);
		workTitle3.setForeground(Color.WHITE);
		workTitle3.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		workTitle3.setBounds(820, 189, 210, 32);
		contentPane.add(workTitle3);
		
		JLabel workTitle5 = new JLabel("Among us");
		workTitle5.setVerticalAlignment(SwingConstants.TOP);
		workTitle5.setHorizontalAlignment(SwingConstants.LEFT);
		workTitle5.setForeground(Color.WHITE);
		workTitle5.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		workTitle5.setBounds(493, 408, 210, 32);
		contentPane.add(workTitle5);
		
		JLabel workTitle6 = new JLabel("Login page");
		workTitle6.setVerticalAlignment(SwingConstants.TOP);
		workTitle6.setHorizontalAlignment(SwingConstants.LEFT);
		workTitle6.setForeground(Color.WHITE);
		workTitle6.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		workTitle6.setBounds(820, 408, 210, 32);
		contentPane.add(workTitle6);
		
		//Designs
		JLabel topDesign = new JLabel("");
		topDesign.setHorizontalAlignment(SwingConstants.CENTER);
		topDesign.setIcon(new ImageIcon("C:\\Users\\gio4g\\eclipse-workspace\\PortfolioFinal\\lines.png"));
		topDesign.setBounds(71, 0, 62, 200);
		contentPane.add(topDesign);
		
		JLabel bottomDesign = new JLabel("");
		bottomDesign.setIcon(new ImageIcon("C:\\Users\\gio4g\\eclipse-workspace\\PortfolioFinal\\lines(1).png"));
		bottomDesign.setHorizontalAlignment(SwingConstants.CENTER);
		bottomDesign.setBounds(1133, 613, 62, 200);
		contentPane.add(bottomDesign);
		
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
		pics setLogo = new pics("strawhat.png",62, 59);
		setLogo.setBounds(600, 690, 62, 48);
		contentPane.add(setLogo);
		
		//                 will set the quote font. and foreground and give to quotes parameters 
		//                 The  <br> tag is used to create a break line 
		quotes setQuotes = new quotes("\"Kaizoku ou ni ore wa naru!\"<br><font color = '#90EE90'>-Monkey D. Luffy</font>", 
		                            new Font("Yu Gothic UI Light", Font.ITALIC, 16),
		                            Color.WHITE);
		setQuotes.setHorizontalAlignment(SwingConstants.CENTER);
		setQuotes.setBounds( 436,728, 386, 74);
		contentPane.add(setQuotes);
		
		JLabel workTitle4 = new JLabel("Responsive practice 1");
		workTitle4.setForeground(new Color(255, 255, 255));
		workTitle4.setHorizontalAlignment(SwingConstants.LEFT);
		workTitle4.setVerticalAlignment(SwingConstants.TOP);
		workTitle4.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		workTitle4.setBounds(167, 408, 210, 32);
		contentPane.add(workTitle4);
		
		
		
		
		
	
		
	}
}
