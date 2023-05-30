import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import javax.swing.JTextArea;
import java.awt.Insets;

public class Contact extends MainFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField emailTextField;

	public Contact() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 852);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(new Color(30, 30, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("<html><font color = '#90EE90'>L</font>ET'S CHAT</html>");
		heading.setVerticalAlignment(SwingConstants.BOTTOM);
		heading.setForeground(new Color(255, 255, 255));
		heading.setFont(new Font("Yu Gothic", Font.PLAIN, 75));
		heading.setBounds(140, 53, 432, 98);
		contentPane.add(heading);
		
		//Decorations
		JLabel lineTop = new JLabel("");
		lineTop.setIcon(new ImageIcon("C:\\Users\\gio4g\\eclipse-workspace\\PortfolioFinal\\lines(2).png"));
		lineTop.setBounds(140, 146, 488, 61);
		contentPane.add(lineTop);
		
		JLabel lineBottom = new JLabel("");
		lineBottom.setIcon(new ImageIcon("C:\\Users\\gio4g\\eclipse-workspace\\PortfolioFinal\\lines(3).png"));
		lineBottom.setBounds(627, 618, 494, 61);
		contentPane.add(lineBottom);
		
		JPanel divider = new JPanel();
		divider.setBackground(new Color(144, 238, 144));
		divider.setBounds(627, 215, 1, 368);
		contentPane.add(divider);
		
		//form 
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setForeground(new Color(255, 255, 255));
		nameLabel.setVerticalAlignment(SwingConstants.TOP);
		nameLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		nameLabel.setBounds(140, 215, 70, 24);
		contentPane.add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setMargin(new Insets(2, 5, 2, 2));
		nameTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nameTextField.setBackground(new Color(30, 30, 30));
		nameTextField.setForeground(new Color(255, 255, 255));
		nameTextField.setBounds(140, 250, 467, 30);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel emailLabel = new JLabel("Email: ");
		emailLabel.setVerticalAlignment(SwingConstants.TOP);
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		emailLabel.setBounds(140, 295, 70, 24);
		contentPane.add(emailLabel);
		
		emailTextField = new JTextField();
		emailTextField.setMargin(new Insets(2, 5, 2, 2));
		emailTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emailTextField.setForeground(Color.WHITE);
		emailTextField.setColumns(10);
		emailTextField.setBackground(new Color(30, 30, 30));
		emailTextField.setBounds(140, 330, 467, 30);
		contentPane.add(emailTextField);
		
		JLabel messageLabel = new JLabel("Message:");
		messageLabel.setVerticalAlignment(SwingConstants.TOP);
		messageLabel.setForeground(Color.WHITE);
		messageLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		messageLabel.setBounds(140, 371, 95, 24);
		contentPane.add(messageLabel);
	
		JTextArea messageTextArea = new JTextArea();
		messageTextArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		messageTextArea.setForeground(new Color(255, 255, 255));
		messageTextArea.setBorder(new LineBorder(new Color(255, 255, 255)));
		messageTextArea.setBackground(new Color(30, 30, 30));
		messageTextArea.setBounds(140, 404, 467, 125);
		contentPane.add(messageTextArea);
		
		//submit button settings and function
		JButton submitButton = new JButton("SUBMIT");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(nameTextField.getText().isEmpty() || emailTextField.getText().isEmpty() || messageTextArea.getText().isEmpty()) {
					
					//will show a frame if user didn't fill a form or all of it.
					JOptionPane.showMessageDialog(null, "Please fill all form");
					
				}else {
					
					//once the submit button is click the form will reset
					nameTextField.setText("");
					emailTextField.setText("");
					messageTextArea.setText("");
					//will show frame message
					JOptionPane.showMessageDialog(null, "Message submitted. Thank you!");
					
				}	
	
				
			}
		});
		submitButton.setFocusable(false);
		submitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		submitButton.setBorder(new LineBorder(new Color(144, 238, 144)));
		submitButton.setBackground(new Color(30, 30, 30));
		submitButton.setForeground(new Color(255, 255, 255));
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		submitButton.setBounds(140, 549, 140, 34);
		contentPane.add(submitButton);
		
		// Contact
		JLabel contact = new JLabel("<html>Contact<br>deveyragg@students.national-u.edu.ph<br>+63 928 6972 643 <br><br>Address<br>Mandaluyong City, 1550 Metro Manila</html>");
		contact.setVerticalAlignment(SwingConstants.TOP);
		contact.setFont(new Font("Yu Gothic", Font.PLAIN, 20));
		contact.setForeground(new Color(255, 255, 255));
		contact.setBounds(649, 215, 472, 234);
		contentPane.add(contact);
		
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
		pics setLogo = new pics("nami.png",62, 60);
		setLogo.setBounds(600, 690, 62, 48);
		contentPane.add(setLogo);
		
		//                 will set the quote font. and foreground and give to quotes parameters 
		//                 The  <br> tag is used to create a break line 
		quotes setQuotes = new quotes("\"Happiness punch\"<br><font color = '#90EE90'>-Nami</font>", 
		                            new Font("Yu Gothic UI Light", Font.ITALIC, 16),
		                            Color.WHITE);
		setQuotes.setHorizontalAlignment(SwingConstants.CENTER);
		setQuotes.setBounds( 436,728, 386, 74);
		contentPane.add(setQuotes);
		
		
		
		
	}
}
