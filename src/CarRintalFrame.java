import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CarRintalFrame extends JFrame {

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
					CarRintalFrame frame = new CarRintalFrame();
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
	public CarRintalFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCarRintalBooking = new JLabel("Car Rintal Booking Service\r\n");
		lblCarRintalBooking.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCarRintalBooking.setBounds(10, 11, 418, 23);
		contentPane.add(lblCarRintalBooking);
		
		JButton btnBack = new JButton("<- Back ");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBounds(10, 231, 79, 23);
		contentPane.add(btnBack);
		
		JButton btnNext = new JButton("Next ->");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNext.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNext.setBounds(349, 231, 79, 23);
		contentPane.add(btnNext);
		
		JLabel lblNewLabel_1_1 = new JLabel("Which car type would you like to choose?");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 57, 418, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnRegular = new JRadioButton("Regular");
		rdbtnRegular.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnRegular.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		rdbtnRegular.setBounds(82, 111, 125, 29);
		contentPane.add(rdbtnRegular);
		
		JRadioButton rdbtnLuxury = new JRadioButton("Luxury");
		rdbtnLuxury.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnLuxury.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		rdbtnLuxury.setBounds(214, 114, 132, 23);
		contentPane.add(rdbtnLuxury);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("How many Days to rent the car?");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(10, 151, 418, 21);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(168, 203, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);

	}
}
