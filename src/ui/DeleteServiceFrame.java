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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.User;

public class DeleteServiceFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private User currentUser;
	private int BookingNumber;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DeleteServiceFrame frame = new DeleteServiceFrame();
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
	public DeleteServiceFrame(User u,int n) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\safsa\\Downloads\\icons8-gui-64.png"));
		currentUser=u;
		BookingNumber=n;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 11, 438, 239);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(189, 143, 48, 14);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblDeleteService = new JLabel("Delete Service");
		lblDeleteService.setForeground(new Color(128, 0, 128));
		lblDeleteService.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblDeleteService.setBounds(10, 11, 294, 21);
		contentPane_1.add(lblDeleteService);
		
		JLabel lblNewLabel_1_1 = new JLabel("Which service you want to delete? (1-2-3):");
		lblNewLabel_1_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(0, 43, 418, 21);
		contentPane_1.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(78, 87, 69, 23);
		contentPane_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(168, 87, 69, 23);
		contentPane_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("3");
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		rdbtnNewRadioButton_2.setBounds(262, 87, 69, 23);
		contentPane_1.add(rdbtnNewRadioButton_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		JButton btnNext = new JButton("Next >>");
		btnNext.setForeground(new Color(128, 0, 128));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int serviceId=0;
				boolean ServiceDeleted=false;
				JRadioButton selectedB=(JRadioButton)group.getSelection();
				if(selectedB==null) {
					lblNewLabel.setText("need to select an option first..."); 
				}
				else {
				if(selectedB==rdbtnNewRadioButton) 
				serviceId = 1;
				else if(selectedB==rdbtnNewRadioButton_1)
					serviceId = 2;
				else
					serviceId = 3;
				ServiceDeleted=currentUser.findBooking(BookingNumber).DeleteService(serviceId);
				if(ServiceDeleted) {
					JOptionPane.showMessageDialog(DeleteServiceFrame.this, "Service deleted successfully!");	
					BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
					frame_bO.setVisible(true);
					dispose(); //remove this frame.
				}
				else {
					group.getSelection().setSelected(false);
					JOptionPane.showMessageDialog(DeleteServiceFrame.this, "Service with this number not found");
					
				}
				}	
			}
		});
		btnNext.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNext.setBounds(328, 204, 100, 23);
		contentPane_1.add(btnNext);
		
		JButton btnBack = new JButton("<< Back ");
		btnBack.setForeground(new Color(128, 0, 128));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModifyBookingFrame frame_mB=new ModifyBookingFrame(currentUser);
				frame_mB.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnBack.setBounds(10, 204, 100, 23);
		contentPane_1.add(btnBack);
		
		

	}

}
