import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ServicesListFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServicesListFrame frame = new ServicesListFrame();
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
	public ServicesListFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("<- Back ");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBounds(26, 228, 79, 23);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1_1 = new JLabel("choose services to add to your booking:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 75, 418, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Book Hotel");
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		btnNewButton.setBounds(26, 137, 108, 23);
		contentPane.add(btnNewButton);
		
		JButton btnRentACar = new JButton("Rent a Car");
		btnRentACar.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		btnRentACar.setBounds(300, 137, 108, 23);
		contentPane.add(btnRentACar);
		
		JButton btnBookAFlight = new JButton("Book a Flight");
		btnBookAFlight.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		btnBookAFlight.setBounds(160, 137, 119, 23);
		contentPane.add(btnBookAFlight);
		
		JLabel lblMakebookingService = new JLabel("Make Booking Service");
		lblMakebookingService.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblMakebookingService.setBounds(10, 11, 294, 21);
		contentPane.add(lblMakebookingService);

	}

}
