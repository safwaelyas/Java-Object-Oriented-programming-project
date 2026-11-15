package ui;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("icons8-gui-64.png"));
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
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(63, 95, 110, 22);
		contentPane_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2");
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(189, 95, 110, 22);
		contentPane_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("3");
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnNewRadioButton_2.setBounds(322, 95, 110, 22);
		contentPane_1.add(rdbtnNewRadioButton_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		JButton btnAddService = new JButton("Add service");
		btnAddService.setForeground(new Color(255, 140, 0));
		btnAddService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=0;
				if(group.getSelection()==null) {
					JOptionPane.showMessageDialog(ModifyBookingFrame.this, "You need to select a booking to modify first...");
				}
				else {  if(rdbtnNewRadioButton.isSelected())
					n=1;
				else if(rdbtnNewRadioButton_1.isSelected())
					n=2;
				else n=3;
				
				if(currentUser.findBooking(n)==null) 
					JOptionPane.showMessageDialog(ModifyBookingFrame.this, "Booking with this number not found");
				else {
					ServicesListFrame ServiceFrame=new ServicesListFrame(currentUser,n);
					ServiceFrame.setVisible(true);
					dispose();}//remove this frame.
				}

			}
		});
		btnAddService.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnAddService.setBounds(48, 148, 119, 23);
		contentPane_1.add(btnAddService);
		
		JButton btnDeleteService = new JButton("Delete service");
		btnDeleteService.setForeground(new Color(255, 140, 0));
		btnDeleteService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=0;
				if(group.getSelection()==null) {
					JOptionPane.showMessageDialog(ModifyBookingFrame.this, "You need to select a booking to modify first...");
				}
				else {  if(rdbtnNewRadioButton.isSelected())
					n=1;
				else if(rdbtnNewRadioButton_1.isSelected())
					n=2;
				else n=3;
				
				if(currentUser.findBooking(n)==null) 
					JOptionPane.showMessageDialog(ModifyBookingFrame.this, "Booking with this number not found");
				else {
				DeleteServiceFrame frame_dS=new DeleteServiceFrame(currentUser,n);
				frame_dS.setVisible(true);
				dispose();}
				}
				   
			}
		});
		btnDeleteService.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnDeleteService.setBounds(256, 148, 119, 23);
		contentPane_1.add(btnDeleteService);
		
		JButton btnBack = new JButton("<< Back ");
		btnBack.setForeground(new Color(128, 0, 128));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
				frame_bO.setVisible(true);
				dispose(); //remove this frame.
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnBack.setBounds(10, 231, 95, 23);
		contentPane_1.add(btnBack);
		
		JLabel lblModifyBookingService = new JLabel("Modify Booking Service");
		lblModifyBookingService.setForeground(new Color(128, 0, 128));
		lblModifyBookingService.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblModifyBookingService.setBounds(10, 11, 294, 21);
		contentPane_1.add(lblModifyBookingService);
		
		JLabel lblNewLabel = new JLabel("Choose a booking to modify(1,2,3)");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(28, 52, 232, 14);
		contentPane_1.add(lblNewLabel);
		
	
	}

}
