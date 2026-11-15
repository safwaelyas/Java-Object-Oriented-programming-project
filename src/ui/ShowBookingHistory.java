package ui;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import model.Booking;
import model.User;
import java.awt.Font;
import java.awt.Color;

public class ShowBookingHistory extends JFrame {

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
//					ShowBookingHistory frame = new ShowBookingHistory(new User(".",",",",",3));
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
	public ShowBookingHistory(User u) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("icons8-gui-64.png"));
		currentUser=u;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("<<Back to the main menu>>");
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
				frame_bO.setVisible(true);
				dispose(); //remove this frame.
			}
		});
		btnNewButton.setBounds(112, 234, 217, 22);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textArea.setForeground(new Color(128, 0, 0));
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(10, 30, 403, 188);
		contentPane.add(scrollPane);
		
		Booking[] array = currentUser.getBookList();
		String results="";
		for (int i = 0; i < currentUser.getNob(); i++) {
			results+=array[i].toString();
		}

		textArea.setText(results);

	}
}
