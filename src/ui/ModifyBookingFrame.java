package ui;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.User;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModifyBookingFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private User currentUser;

	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ModifyBookingFrame frame = new ModifyBookingFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public ModifyBookingFrame(User u) {
		currentUser=u;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 438, 265);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("What would you like to do?");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(-95, 84, 418, 21);
		contentPane_1.add(lblNewLabel_1_1);
		
		JButton btnDeleteBooking = new JButton("Delete booking ");
		btnDeleteBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteBookingFrame frame_dB=new DeleteBookingFrame();
				frame_dB.setVisible(true);
				dispose();
			}
		});
		btnDeleteBooking.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		btnDeleteBooking.setBounds(27, 133, 119, 23);
		contentPane_1.add(btnDeleteBooking);
		
		JButton btnAddService = new JButton("Add service");
		btnAddService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ServicesListFrame ServiceFrame=new ServicesListFrame(currentUser);
				ServiceFrame.setVisible(true);
				dispose(); //remove this frame.
			}
		});
		btnAddService.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnAddService.setBounds(157, 133, 119, 23);
		contentPane_1.add(btnAddService);
		
		JButton btnDeleteService = new JButton("Delete service");
		btnDeleteService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteServiceFrame frame_dS=new DeleteServiceFrame();
				frame_dS.setVisible(true);
				dispose();
			}
		});
		btnDeleteService.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		btnDeleteService.setBounds(286, 133, 119, 23);
		contentPane_1.add(btnDeleteService);
		
		JButton btnBack = new JButton("<< Back ");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
				frame_bO.setVisible(true);
				dispose(); //remove this frame.
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBounds(10, 231, 95, 23);
		contentPane_1.add(btnBack);
		
		JLabel lblModifyBookingService = new JLabel("Modify Booking Service");
		lblModifyBookingService.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblModifyBookingService.setBounds(10, 11, 294, 21);
		contentPane_1.add(lblModifyBookingService);

	}

}
