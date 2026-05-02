import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class HotelFrame extends JFrame {

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
					HotelFrame frame = new HotelFrame();
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
	public HotelFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hotel Booking Service");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 11, 294, 21);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnRegular = new JRadioButton("Regular");
		rdbtnRegular.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		rdbtnRegular.setBounds(77, 100, 109, 23);
		contentPane.add(rdbtnRegular);
		
		JLabel lblNewLabel_1 = new JLabel("How many nighs you want to stay?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 148, 418, 21);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnSuite = new JRadioButton("Suite");
		rdbtnSuite.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		rdbtnSuite.setBounds(257, 100, 109, 23);
		contentPane.add(rdbtnSuite);
		
		textField = new JTextField();
		textField.setBounds(170, 187, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("<- Back ");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBounds(10, 231, 79, 23);
		contentPane.add(btnBack);
		
		JButton btnNext = new JButton("Next ->");
		btnNext.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNext.setBounds(349, 231, 79, 23);
		contentPane.add(btnNext);
		
		JLabel lblNewLabel_1_1 = new JLabel("Which room type would you like to choose?");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 58, 418, 21);
		contentPane.add(lblNewLabel_1_1);

	}
}
