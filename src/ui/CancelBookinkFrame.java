package ui;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import core.BookWithUs;
import model.User;

public class CancelBookinkFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private User currentUser;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					CancelBookinkFrame frame = new CancelBookinkFrame(new User("ala","maha","email",3));
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
	public CancelBookinkFrame(User u) {
		currentUser=u;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(77, 168, 288, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCancelbookingService = new JLabel("Cancel Booking Service");
		lblCancelbookingService.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCancelbookingService.setBounds(10, 11, 294, 21);
		contentPane.add(lblCancelbookingService);
		
		JLabel lblNewLabel_1_1 = new JLabel("Which booking you want to cancel? (1-2-3):");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 65, 418, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(77, 124, 69, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(183, 124, 69, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("3");
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rdbtnNewRadioButton_2.setBounds(273, 125, 69, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		JButton btnNext = new JButton("Next >>");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean value=false;
				if(group.getSelection()==null) {
					lblNewLabel.setText("need to select an option first..."); 
				}
				else if(group.getSelection()==rdbtnNewRadioButton) {
					value =BookWithUs.CancelBooking(1,currentUser);
				}
				else if(group.getSelection()==rdbtnNewRadioButton_1) {
					value =BookWithUs.CancelBooking(2,currentUser);
				}
				else {
					value =BookWithUs.CancelBooking(3,currentUser);
				}
				if(value) {
					JOptionPane.showMessageDialog(CancelBookinkFrame.this, "Booking cancelled successfully!");	
					BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
					frame_bO.setVisible(true);
					dispose(); //remove this frame.
				}
				else {
					group.getSelection().setSelected(false);
					JOptionPane.showMessageDialog(CancelBookinkFrame.this, "Booking with this number not found");
					
				}
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNext.setBounds(340, 204, 88, 23);
		contentPane.add(btnNext);
		
		JButton btnBack = new JButton("<< Back ");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
				frame_bO.setVisible(true);
				dispose(); //remove this frame.
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBounds(10, 204, 88, 23);
		contentPane.add(btnBack);
		
		

	}

}
