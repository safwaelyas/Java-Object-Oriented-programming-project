package ui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteServiceFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteServiceFrame frame = new DeleteServiceFrame();
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
	public DeleteServiceFrame() {
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
		
		JLabel lblDeleteService = new JLabel("Delete Service");
		lblDeleteService.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblDeleteService.setBounds(10, 11, 294, 21);
		contentPane_1.add(lblDeleteService);
		
		JLabel lblNewLabel_1_1 = new JLabel("Which service do you want to delete? (1-2-3):");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 65, 418, 21);
		contentPane_1.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(77, 124, 69, 23);
		contentPane_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(183, 124, 69, 23);
		contentPane_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("3");
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		rdbtnNewRadioButton_2.setBounds(273, 125, 69, 23);
		contentPane_1.add(rdbtnNewRadioButton_2);
		
		JButton btnNext = new JButton("Next ->");
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNext.setBounds(328, 204, 100, 23);
		contentPane_1.add(btnNext);
		
		JButton btnBack = new JButton("<- Back ");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBounds(10, 204, 100, 23);
		contentPane_1.add(btnBack);

	}

}
