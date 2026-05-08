package ui;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import core.BookWithUs;
import core.WeakPasswordException;
import java.awt.Toolkit;

public class CreateAcauntFrame extends JFrame {
	
	/**
	  Create the frame.
	 */

	public CreateAcauntFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\safsa\\Downloads\\icons8-gui-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entar your name:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(32, 91, 97, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblEntarEmail = new JLabel("Entar email:");
		lblEntarEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEntarEmail.setBounds(32, 120, 97, 14);
		getContentPane().add(lblEntarEmail);
		
		JLabel lblWelcomToBooking = new JLabel("Welcome To Book with us System...");
		lblWelcomToBooking.setForeground(new Color(128, 0, 128));
		lblWelcomToBooking.setToolTipText("");
		lblWelcomToBooking.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblWelcomToBooking.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomToBooking.setBounds(-94, 11, 520, 25);
		getContentPane().add(lblWelcomToBooking);
		
		JLabel lblEntarPassword = new JLabel("Entar password:");
		lblEntarPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEntarPassword.setBounds(32, 150, 97, 14);
		getContentPane().add(lblEntarPassword);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(199, 89, 138, 20);
		getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textField_email = new JTextField();
		textField_email.setBounds(199, 118, 138, 20);
		getContentPane().add(textField_email);
		textField_email.setColumns(10);
		
		textField_pass = new JTextField();
		textField_pass.setBounds(199, 148, 138, 20);
		getContentPane().add(textField_pass);
		textField_pass.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(53, 192, 362, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("sign up  ");
		btnNewButton_1.setForeground(new Color(199, 21, 133));
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String userName;
				String email;
				String pass;
				userName= textFieldName.getText();
				email= textField_email.getText();
			    pass= textField_pass.getText();
		try {
			boolean emailValue=email.contains("@");
			if(!emailValue) 
                throw new RuntimeException("Invalid email format, Email must have an address '@'!");
        else
           	if(pass.length() < 8 || !BookWithUs.passwordValid(pass)) {
		                throw new WeakPasswordException("\ninvalid Password.\nPassword must be at least 8 characters>>\nPassword must contain a capital letter>>\nTry again!");
		            }
			int number=BookWithUs.signUp(userName, email,pass);
			if(number==-1) {
				textFieldName.setText("");
				textField_email.setText("");
				textField_pass.setText("");
				lblNewLabel_1.setText("Can't sign up, User-Limit reached!!");
				}
			else {
			SingInFrame framelogin=new SingInFrame();
			framelogin.setVisible(true);
			dispose();}
		}
			catch (WeakPasswordException e1) {
				textFieldName.setText("");
				textField_email.setText("");
				textField_pass.setText("");
				lblNewLabel_1.setText(e1.getMessage());
	        } catch (RuntimeException e2) {
	        	    textFieldName.setText("");
				textField_email.setText("");
				textField_pass.setText("");
	        	  lblNewLabel_1.setText(e2.getMessage());
	        } 
			
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1.setBounds(178, 215, 88, 23);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblEnterYourInformations = new JLabel("Enter your informations below >>");
		lblEnterYourInformations.setForeground(new Color(128, 0, 128));
		lblEnterYourInformations.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEnterYourInformations.setBounds(32, 33, 294, 32);
		contentPane.add(lblEnterYourInformations);
		

		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, lblEntarEmail, lblWelcomToBooking, lblEntarPassword, textFieldName, textField_email, textField_pass, btnNewButton_1, lblEnterYourInformations, lblNewLabel_1}));
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textField_email;
	private JTextField textField_pass;

	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CreateAcauntFrame frame = new CreateAcauntFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	
}
