import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class FlightFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightFrame frame = new FlightFrame();
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
	public FlightFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Flight Booking Service\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 11, 418, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnBack = new JButton("<- Back ");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBounds(10, 436, 79, 23);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1_1 = new JLabel("What is the flight typy?");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 139, 418, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("What day you want to book the flight(1-30)?");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(10, 50, 418, 21);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(172, 94, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("is your flight international?");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(10, 234, 418, 21);
		contentPane.add(lblNewLabel_1_1_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("First ");
		chckbxNewCheckBox.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		chckbxNewCheckBox.setBounds(68, 191, 99, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxBussiness = new JCheckBox("Bussiness");
		chckbxBussiness.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		chckbxBussiness.setBounds(172, 191, 99, 23);
		contentPane.add(chckbxBussiness);
		
		JCheckBox chckbxEconomy = new JCheckBox("Economy");
		chckbxEconomy.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		chckbxEconomy.setBounds(284, 191, 99, 23);
		contentPane.add(chckbxEconomy);
		
		JLabel lblNewLabel_1 = new JLabel("Do you have visa?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 340, 418, 21);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("No");
		chckbxNewCheckBox_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		chckbxNewCheckBox_1.setBounds(148, 288, 79, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Yes");
		chckbxNewCheckBox_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		chckbxNewCheckBox_2.setBounds(242, 288, 99, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Yes");
		rdbtnNewRadioButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(135, 385, 69, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No");
		rdbtnNewRadioButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(246, 385, 62, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JButton btnNext = new JButton("Next ->");
		btnNext.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNext.setBounds(349, 436, 79, 23);
		contentPane.add(btnNext);

	}
}
