package ui;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import core.BookWithUs;
import model.User;
import java.awt.Toolkit;

public class SingInFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					SingInFrame frame = new SingInFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SingInFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("icons8-gui-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entar your name:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(23, 80, 97, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEntarPassword = new JLabel("Entar password:");
		lblEntarPassword.setForeground(new Color(0, 0, 0));
		lblEntarPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEntarPassword.setBounds(23, 110, 97, 14);
		contentPane.add(lblEntarPassword);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(145, 78, 138, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 108, 138, 20);
		contentPane.add(textField_1);
		
		JLabel lblinvalid_or_noaccountfound = new JLabel("");
		lblinvalid_or_noaccountfound.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblinvalid_or_noaccountfound.setBounds(23, 55, 390, 14);
		contentPane.add(lblinvalid_or_noaccountfound);
		
		JLabel lblSignIn = new JLabel("Welcom To Book with us System, Login to your account");
		lblSignIn.setForeground(new Color(128, 0, 128));
		lblSignIn.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSignIn.setBounds(10, 22, 403, 33);
		contentPane.add(lblSignIn);
		
		JButton btnNewButton = new JButton("Don't have account yet? sign up First");
		btnNewButton.setForeground(new Color(199, 21, 133));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateAcauntFrame Frame1_1=new CreateAcauntFrame();
				Frame1_1.setVisible(true);
				  dispose();
			}
		});
		btnNewButton.setBounds(23, 209, 244, 22);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String name = textField.getText();
		        String password = textField_1.getText();

		        try {
		            User u = BookWithUs.login(name, password);  
		            if (u != null) {
		                // Login successful → open next frame
		                BookingOptionsFrame next = new BookingOptionsFrame(u);
		                next.setVisible(true);
		                dispose(); // close login window
		            } else {
		            	lblinvalid_or_noaccountfound.setText("username or password doesn't match, Try Again or sing up first!");
		            }

		        } catch (Exception ex) {
		        	lblinvalid_or_noaccountfound.setText("Error: " + ex.getMessage());
		        }
		    }
		});
		
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_1.setForeground(new Color(199, 21, 133));
		btnNewButton_1.setBounds(169, 149, 88, 22);
		contentPane.add(btnNewButton_1);

	}
}
