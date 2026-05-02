import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class CreateAcauntFrame extends JFrame {
	public CreateAcauntFrame() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entar your name:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblNewLabel.setBounds(93, 99, 97, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblEntarEmail = new JLabel("Entar email:");
		lblEntarEmail.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblEntarEmail.setBounds(93, 156, 97, 14);
		getContentPane().add(lblEntarEmail);
		
		JLabel lblWelcomToBooking = new JLabel("Welcom To Booking System");
		lblWelcomToBooking.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblWelcomToBooking.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomToBooking.setBounds(10, 11, 469, 20);
		getContentPane().add(lblWelcomToBooking);
		
		JLabel lblEntarPassword = new JLabel("Entar password:");
		lblEntarPassword.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblEntarPassword.setBounds(93, 211, 97, 14);
		getContentPane().add(lblEntarPassword);
		
		textField = new JTextField();
		textField.setBounds(254, 97, 138, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(254, 154, 138, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(254, 209, 138, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Next ->");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(390, 295, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(10, 295, 89, 23);
		getContentPane().add(btnExit);
		
		JButton btnNewButton_1 = new JButton("Do you have an acount?  sing in ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(120, 240, 239, 23);
		getContentPane().add(btnNewButton_1);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, lblEntarEmail, lblWelcomToBooking, lblEntarPassword, textField, textField_1, textField_2, btnNewButton, btnExit, btnNewButton_1}));
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAcauntFrame frame = new CreateAcauntFrame();
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
	public CreateAcauntFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	}
}
