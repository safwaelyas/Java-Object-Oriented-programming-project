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

import model.User;

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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1");
		rdbtnNewRadioButton.setBounds(28, 95, 110, 22);
		contentPane_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2");
		rdbtnNewRadioButton_1.setBounds(153, 95, 110, 22);
		contentPane_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("3");
		rdbtnNewRadioButton_2.setBounds(265, 94, 110, 22);
		contentPane_1.add(rdbtnNewRadioButton_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("What would you like to do?");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(-97, 46, 418, 21);
		contentPane_1.add(lblNewLabel_1_1);
		
		JButton btnAddService = new JButton("Add service");
		btnAddService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=0;
				if(group.getSelection()==null) {
					JOptionPane.showMessageDialog(ModifyBookingFrame.this, "You need to select a booking to modify first...");
				}
				else { if(group.getSelection()==rdbtnNewRadioButton)
					n=1;
				else if(group.getSelection()==rdbtnNewRadioButton_1)
					n=2;
				else n=3;
				
				if(currentUser.findBooking(3)==null) 
					JOptionPane.showMessageDialog(ModifyBookingFrame.this, "Booking with this number not found");
				else {
					ServicesListFrame ServiceFrame=new ServicesListFrame(currentUser,n);
					ServiceFrame.setVisible(true);
					dispose();}//remove this frame.
				}

			}
		});
		btnAddService.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnAddService.setBounds(48, 148, 119, 23);
		contentPane_1.add(btnAddService);
		
		JButton btnDeleteService = new JButton("Delete service");
		btnDeleteService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=0;
				if(group.getSelection()==null) {
					JOptionPane.showMessageDialog(ModifyBookingFrame.this, "You need to select a booking to modify first...");
				}
				else { if(rdbtnNewRadioButton.isSelected())
					n=1;
				else if(rdbtnNewRadioButton_1.isSelected())
					n=2;
				else n=3;
				
				if(currentUser.findBooking(3)==null) 
					JOptionPane.showMessageDialog(ModifyBookingFrame.this, "Booking with this number not found");
				else {
				DeleteServiceFrame frame_dS=new DeleteServiceFrame(currentUser,n);
				frame_dS.setVisible(true);
				dispose();}
				}
				   
			}
		});
		btnDeleteService.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		btnDeleteService.setBounds(256, 148, 119, 23);
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
		
		JLabel lblNewLabel = new JLabel("Choose a booking to modify(1,2,3)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(31, 74, 232, 14);
		contentPane_1.add(lblNewLabel);
		
	
	}

}
