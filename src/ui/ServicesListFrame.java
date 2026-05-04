package ui;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import model.User;

public class ServicesListFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private User currentUser;
	private int BookingNumber;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServicesListFrame frame = new ServicesListFrame(new User(".",",",",",3));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//
	/**
 * Create the frame.
	 */
	
	public ServicesListFrame(User u) {
		currentUser=u;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("<< Back ");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
				frame_bO.setVisible(true);
				dispose(); //remove this frame.
			}
		});
		
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBounds(26, 228, 108, 23);
		contentPane.add(btnBack);
		
		JLabel lblMakebookingService = new JLabel("Choose Services:");
		lblMakebookingService.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblMakebookingService.setBounds(10, 11, 294, 21);
		contentPane.add(lblMakebookingService);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Hotel");
		chckbxNewCheckBox.setBounds(10, 60, 98, 22);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Car");
		chckbxNewCheckBox_1.setBounds(161, 60, 98, 22);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Flight");
		chckbxNewCheckBox_2.setBounds(313, 60, 98, 22);
		contentPane.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel = new JLabel("How many nights?");
		lblNewLabel.setBounds(10, 146, 108, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Domestic");
		rdbtnNewRadioButton.setBounds(334, 85, 110, 22);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("International");
		rdbtnNewRadioButton_1.setBounds(334, 110, 96, 22);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Class");
		lblNewLabel_1.setBounds(313, 146, 131, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Room Type:");
		lblNewLabel_2.setBounds(10, 100, 88, 14);
		contentPane.add(lblNewLabel_2);
		
		JList list_1 = new JList();
		list_1.setBounds(10, 121, 88, 14);
		contentPane.add(list_1);
		
		JList list_2 = new JList();
		list_2.setBounds(10, 169, 88, 14);
		contentPane.add(list_2);
		
		JList list = new JList();
		list.setBounds(161, 121, 98, 14);
		contentPane.add(list);
		
		JList list_3 = new JList();
		list_3.setBounds(161, 169, 98, 14);
		contentPane.add(list_3);
		
		JLabel lblNewLabel_3 = new JLabel("Car Type");
		lblNewLabel_3.setBounds(161, 100, 98, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("How many days?");
		lblNewLabel_4.setBounds(161, 146, 98, 14);
		contentPane.add(lblNewLabel_4);
		
		JList list_4 = new JList();
		list_4.setBounds(313, 169, 116, 14);
		contentPane.add(list_4);
		
		JLabel lblNewLabel_5 = new JLabel("Date (Day in month):");
		lblNewLabel_5.setBounds(313, 194, 116, 14);
		contentPane.add(lblNewLabel_5);
		
		JList list_5 = new JList();
		list_5.setBounds(313, 214, 116, 14);
		contentPane.add(list_5);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(161, 228, 98, 23);
		contentPane.add(btnNewButton);
	

	}
	
	/**
	 * @wbp.parser.constructor
	 */
	public ServicesListFrame(User u,int n) {
		currentUser=u;
		BookingNumber=n;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("<< Back ");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
				frame_bO.setVisible(true);
				dispose(); //remove this frame.
			}
		});
		
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBounds(26, 228, 108, 23);
		contentPane.add(btnBack);
		
		JLabel lblMakebookingService = new JLabel("Choose Services:");
		lblMakebookingService.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblMakebookingService.setBounds(10, 11, 294, 21);
		contentPane.add(lblMakebookingService);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Hotel");
		chckbxNewCheckBox.setBounds(10, 60, 98, 22);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Car");
		chckbxNewCheckBox_1.setBounds(161, 60, 98, 22);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Flight");
		chckbxNewCheckBox_2.setBounds(313, 60, 98, 22);
		contentPane.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel = new JLabel("How many nights?");
		lblNewLabel.setBounds(10, 146, 108, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Domestic");
		rdbtnNewRadioButton.setBounds(334, 85, 110, 22);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("International");
		rdbtnNewRadioButton_1.setBounds(334, 110, 96, 22);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Class");
		lblNewLabel_1.setBounds(313, 146, 131, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Room Type:");
		lblNewLabel_2.setBounds(10, 100, 88, 14);
		contentPane.add(lblNewLabel_2);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Reqular", "Suite", "\"None\""};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setBounds(10, 121, 88, 14);
		contentPane.add(list_1);
		
		JList list_2 = new JList();
		list_2.setBounds(10, 169, 88, 14);
		contentPane.add(list_2);
		
		JList list = new JList();
		list.setBounds(161, 121, 98, 14);
		contentPane.add(list);
		
		JList list_3 = new JList();
		list_3.setBounds(161, 169, 98, 14);
		contentPane.add(list_3);
		
		JLabel lblNewLabel_3 = new JLabel("Car Type");
		lblNewLabel_3.setBounds(161, 100, 98, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("How many days?");
		lblNewLabel_4.setBounds(161, 146, 98, 14);
		contentPane.add(lblNewLabel_4);
		
		JList list_4 = new JList();
		list_4.setBounds(313, 169, 116, 14);
		contentPane.add(list_4);
		
		JLabel lblNewLabel_5 = new JLabel("Date (Day in month):");
		lblNewLabel_5.setBounds(313, 194, 116, 14);
		contentPane.add(lblNewLabel_5);
		
		JList list_5 = new JList();
		list_5.setBounds(313, 214, 116, 14);
		contentPane.add(list_5);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(161, 228, 98, 23);
		contentPane.add(btnNewButton);
	

	}
}
