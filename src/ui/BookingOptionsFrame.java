package ui;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.User;

public class BookingOptionsFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private User currentUser;
	

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					BookingOptionsFrame frame = new BookingOptionsFrame(new User(".",",",",",3));
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
	public BookingOptionsFrame(User u) {
		currentUser=u;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(39, 227, 348, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("What would you like to do?");
		lblNewLabel_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(10, 43, 418, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnModifyBooking = new JButton("Modify booking");
		btnModifyBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(currentUser.getNob()==0) {
					lblNewLabel.setText("No Bookings Found!!,make a booking first");
			}
				else {
				ModifyBookingFrame frame_m=new ModifyBookingFrame(currentUser);
				frame_m.setVisible(true);
				dispose(); }//remove this frame.
			}});
		
		btnModifyBooking.setBackground(Color.PINK);
		btnModifyBooking.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnModifyBooking.setBounds(226, 89, 161, 23);
		contentPane.add(btnModifyBooking);
		
		JButton btnCancelBooking = new JButton("Cancel/Confirm/Delete booking");
		btnCancelBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(currentUser.getNob()==0) {
					lblNewLabel.setText("No Bookings Found!!,make a booking first");
			}
				else {
					ChangeBookinkStatusFrame frame_c=new ChangeBookinkStatusFrame(currentUser);
					frame_c.setVisible(true);
					dispose(); }//remove this frame.
			
			}
		});
		
		btnCancelBooking.setBackground(Color.PINK);
		btnCancelBooking.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnCancelBooking.setBounds(107, 123, 211, 23);
		contentPane.add(btnCancelBooking);
		
		JButton btnShowBookingHistory = new JButton("Show Booking history");
		btnShowBookingHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(currentUser.getNob()==0) {
					lblNewLabel.setText("No Bookings Found!!,make a booking first");}
				else {
				ShowBookingHistory newframe=new ShowBookingHistory(currentUser);
				newframe.setVisible(true);
				dispose();}
				
			}
		});
		
		btnShowBookingHistory.setBackground(Color.PINK);
		btnShowBookingHistory.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnShowBookingHistory.setBounds(107, 157, 211, 23);
		contentPane.add(btnShowBookingHistory);
		
		JButton btnLogOut = new JButton("Log out!");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SingInFrame framelogin=new SingInFrame();
				framelogin.setVisible(true);
				dispose(); //remove this frame.
			}
		});
		btnLogOut.setForeground(Color.RED);
		btnLogOut.setBackground(Color.PINK);
		btnLogOut.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnLogOut.setBounds(128, 188, 161, 23);
		contentPane.add(btnLogOut);
		
		JButton btnNewButton = new JButton("Make Booking");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ServicesListFrame ServiceFrame=new ServicesListFrame(currentUser);
				ServiceFrame.setVisible(true);
				dispose(); //remove this frame.
			}
		});
		btnNewButton.setBounds(52, 89, 148, 23);
		contentPane.add(btnNewButton);	

	}

}
