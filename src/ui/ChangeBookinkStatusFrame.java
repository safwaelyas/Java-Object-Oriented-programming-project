package ui;
import java.awt.Color;
import java.awt.EventQueue;
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
import java.awt.Toolkit;

public class ChangeBookinkStatusFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private User currentUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeBookinkStatusFrame frame = new ChangeBookinkStatusFrame(new User("ala","maha","email",3));
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
	public ChangeBookinkStatusFrame(User u) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("icons8-gui-64.png"));
		currentUser=u;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(34, 168, 355, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCancelbookingService = new JLabel("Change Booking Status Service");
		lblCancelbookingService.setLabelFor(this);
		lblCancelbookingService.setForeground(new Color(128, 0, 128));
		lblCancelbookingService.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblCancelbookingService.setBounds(20, 11, 294, 21);
		contentPane.add(lblCancelbookingService);
		
		JLabel lblNewLabel_1_1 = new JLabel("Which booking you want to modify? (1-2-3):");
		lblNewLabel_1_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(20, 43, 418, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(60, 71, 69, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(176, 71, 69, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("3");
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rdbtnNewRadioButton_2.setBounds(296, 71, 69, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
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
		btnBack.setBounds(10, 204, 88, 23);
		contentPane.add(btnBack);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setForeground(new Color(255, 127, 80));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                  boolean value=false;
                  if(group.getSelection() == null) {
                	    lblNewLabel.setText("need to select an option first...");
                	}
                	else if(rdbtnNewRadioButton.isSelected()) {
                	    value = BookWithUs.CancelBooking(1, currentUser);
                	}
                	else if(rdbtnNewRadioButton_1.isSelected()) {
                	    value = BookWithUs.CancelBooking(2, currentUser);
                	}
                	else if(rdbtnNewRadioButton_2.isSelected()) {
                	    value = BookWithUs.CancelBooking(3, currentUser);
                	}
			if(value) {
				JOptionPane.showMessageDialog(ChangeBookinkStatusFrame.this, "Booking cancelled successfully!");	
				BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
				frame_bO.setVisible(true);
				dispose(); //remove this frame.
			}
			else {
				group.getSelection().setSelected(false);
				JOptionPane.showMessageDialog(ChangeBookinkStatusFrame.this, "Booking with this number not found");
				
			}
			}
		});
		btnNewButton.setBounds(41, 124, 88, 22);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Confirm");
		btnNewButton_1.setForeground(new Color(255, 140, 0));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean value=false;
				if(group.getSelection() == null) {
				    lblNewLabel.setText("need to select an option first...");
				}
				else if(rdbtnNewRadioButton.isSelected()) {
				    value = BookWithUs.ConfirmBooking(1, currentUser);
				}
				else if(rdbtnNewRadioButton_1.isSelected()) {
				    value = BookWithUs.ConfirmBooking(2, currentUser);
				}
				else if(rdbtnNewRadioButton_2.isSelected()) {
				    value = BookWithUs.ConfirmBooking(3, currentUser);
				}
				if(value) {
					JOptionPane.showMessageDialog(ChangeBookinkStatusFrame.this, "Booking Confirmed successfully!");	
					BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
					frame_bO.setVisible(true);
					dispose(); //remove this frame.
				}
				else {
					group.getSelection().setSelected(false);
					JOptionPane.showMessageDialog(ChangeBookinkStatusFrame.this, "Booking with this number not found");
					
				}
			}
		});
		btnNewButton_1.setBounds(165, 124, 88, 22);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setForeground(new Color(255, 140, 0));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean value=false;
				if(group.getSelection() == null) {
				    lblNewLabel.setText("need to select an option first...");
				}
				else if(rdbtnNewRadioButton.isSelected()) {
				    value = BookWithUs.DeleteBooking(1, currentUser);
				}
				else if(rdbtnNewRadioButton_1.isSelected()) {
				    value = BookWithUs.DeleteBooking(2, currentUser);
				}
				else if(rdbtnNewRadioButton_2.isSelected()) {
				    value = BookWithUs.DeleteBooking(3, currentUser);
				}
				if(value) {
					JOptionPane.showMessageDialog(ChangeBookinkStatusFrame.this, "Booking Deleted successfully!");	
					BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
					frame_bO.setVisible(true);
					dispose(); //remove this frame.
				}
				else {
					group.getSelection().setSelected(false);
					JOptionPane.showMessageDialog(ChangeBookinkStatusFrame.this, "Booking with this number not found");
					
				}
			}
		});
		btnNewButton_2.setBounds(301, 124, 88, 22);
		contentPane.add(btnNewButton_2);
		
		

	}

}
