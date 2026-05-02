import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class SingInFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entar your name:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblNewLabel.setBounds(63, 86, 97, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEntarPassword = new JLabel("Entar password:");
		lblEntarPassword.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblEntarPassword.setBounds(63, 156, 97, 14);
		contentPane.add(lblEntarPassword);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(210, 84, 138, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(210, 150, 138, 20);
		contentPane.add(textField_1);
		
		JButton btnNext = new JButton("Next ->");
		btnNext.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNext.setBounds(349, 231, 79, 23);
		contentPane.add(btnNext);
		
		JButton btnBack = new JButton("<- Back ");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBounds(10, 231, 79, 23);
		contentPane.add(btnBack);
		
		JLabel lblSignIn = new JLabel("Sign in");
		lblSignIn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblSignIn.setBounds(10, 11, 60, 20);
		contentPane.add(lblSignIn);

	}

}
