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

public class BookingOptionsFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingOptionsFrame frame = new BookingOptionsFrame();
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
	public BookingOptionsFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("What would you like to do?");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 57, 418, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnMakeBooking = new JButton("Make booking");
		btnMakeBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMakeBooking.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		btnMakeBooking.setBounds(26, 116, 119, 23);
		contentPane.add(btnMakeBooking);
		
		JButton btnModifyBooking = new JButton("Modify booking");
		btnModifyBooking.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		btnModifyBooking.setBounds(26, 165, 119, 23);
		contentPane.add(btnModifyBooking);
		
		JButton btnCancelBooking = new JButton("Cancel booking");
		btnCancelBooking.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnCancelBooking.setBounds(160, 116, 119, 23);
		contentPane.add(btnCancelBooking);
		
		JButton btnConfirmBooking = new JButton("Confirm booking");
		btnConfirmBooking.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		btnConfirmBooking.setBounds(289, 117, 119, 23);
		contentPane.add(btnConfirmBooking);
		
		JButton btnShowBookingHistory = new JButton("Booking history");
		btnShowBookingHistory.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		btnShowBookingHistory.setBounds(160, 165, 119, 23);
		contentPane.add(btnShowBookingHistory);
		
		JButton btnLogOut = new JButton("Log out!");
		btnLogOut.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		btnLogOut.setBounds(289, 166, 119, 23);
		contentPane.add(btnLogOut);

	}

}
