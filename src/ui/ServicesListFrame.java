package ui;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import core.BookWithUs;
import model.Booking;
import model.CarRental;
import model.Flight;
import model.Hotel;
import model.Service;
import model.User;
import model.internationalFlights;

public class ServicesListFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private User currentUser;
	private Booking bb;
	private JTextField textField;
	private JTextField textField_1;


//	public static void main(String[] args) {
//	EventQueue.invokeLater(new Runnable() {
//		public void run() {
//			try {
//				ServicesListFrame frame = new ServicesListFrame(new User(".",",",",",3),2);
//				frame.setVisible(true);
//			} catch (Exception e) {
//				e.printStackTrace();
//				}
//		}
//		});
//	}

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
		
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnBack.setBounds(10, 228, 108, 23);
		contentPane.add(btnBack);
		
		JLabel lblMakebookingService = new JLabel("Choose Services:");
		lblMakebookingService.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblMakebookingService.setBounds(10, 11, 294, 21);
		contentPane.add(lblMakebookingService);
		
		
		JCheckBox HotelBox = new JCheckBox("Hotel");
		HotelBox.setBounds(10, 60, 98, 22);
		contentPane.add(HotelBox);
		
		JCheckBox carBox = new JCheckBox("Car");
		carBox.setBounds(161, 60, 98, 22);
		contentPane.add(carBox);
		
		JCheckBox flightBox = new JCheckBox("Flight");
		flightBox.setBounds(313, 60, 98, 22);
		contentPane.add(flightBox);
		
		JLabel lblNewLabel = new JLabel("How many nights?");
		lblNewLabel.setBounds(10, 146, 108, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton DomesticRadioButton = new JRadioButton("Domestic");
		DomesticRadioButton.setBounds(334, 85, 110, 22);
		contentPane.add(DomesticRadioButton);
		
		JRadioButton internationalRadioButton = new JRadioButton("International");
		internationalRadioButton.setBounds(334, 110, 102, 22);
		contentPane.add(internationalRadioButton);
		
		ButtonGroup group = new ButtonGroup();
		group.add(DomesticRadioButton);
		group.add(internationalRadioButton);
		
				
		
		JLabel lblNewLabel_1 = new JLabel("Class");
		lblNewLabel_1.setBounds(313, 130, 131, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Room Type:");
		lblNewLabel_2.setBounds(10, 93, 88, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Car Type");
		lblNewLabel_3.setBounds(161, 93, 98, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("How many days?");
		lblNewLabel_4.setBounds(161, 146, 98, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Date (Day in month):");
		lblNewLabel_5.setBounds(313, 177, 116, 14);
		contentPane.add(lblNewLabel_5);
		
		JComboBox<String> roomType = new JComboBox<>();
		roomType.setModel(new DefaultComboBoxModel<String>(new String[] {null, "Regular", "Suite"}));
		roomType.setBounds(10, 121, 98, 23);
		contentPane.add(roomType);
		
		JComboBox<String> carType = new JComboBox<String>();
		carType.setModel(new DefaultComboBoxModel<String>(new String[] {null,"Luxury", "Reqular"}));
		carType.setBounds(161, 121, 98, 23);
		contentPane.add(carType);
		
		JComboBox<String> flightClass = new JComboBox<>();
		flightClass.setModel(new DefaultComboBoxModel<String>(new String[] {null, "First Class", "Business Class", "Economy"}));
		flightClass.setBounds(313, 149, 116, 17);
		contentPane.add(flightClass);
		
		JComboBox<Integer> monthDay = new JComboBox<>();
		monthDay.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11, 12, 13, 14, 15, 16, 17, 18, 19,20, 21, 22, 23, 24, 25, 26, 27, 28, 29,30}));
		monthDay.setBounds(313, 191, 116, 23);
		contentPane.add(monthDay);
		
		textField = new JTextField();
		textField.setBounds(10, 165, 88, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(161, 165, 88, 23);
		contentPane.add(textField_1);
		JLabel forRoomType = new JLabel("");
		forRoomType.setBounds(10, 195, 131, 14);
		contentPane.add(forRoomType);
		
		JLabel forNegativeOrZeroights = new JLabel("");
		forNegativeOrZeroights.setBounds(10, 214, 131, 14);
		contentPane.add(forNegativeOrZeroights);
		
		JLabel forCarType = new JLabel("");
		forCarType.setBounds(161, 195, 108, 14);
		contentPane.add(forCarType);
		
		JLabel forNegativeZerodays = new JLabel("");
		forNegativeZerodays.setBounds(161, 214, 88, 14);
		contentPane.add(forNegativeZerodays);
		
		JLabel forUnSelectedClass = new JLabel("");
		forUnSelectedClass.setBounds(313, 214, 116, 14);
		contentPane.add(forUnSelectedClass);
		
		JLabel forNonMonthDays = new JLabel("");
		forNonMonthDays.setBounds(313, 233, 123, 14);
		contentPane.add(forNonMonthDays);
		JLabel NoFlightTypeselected = new JLabel("");
		NoFlightTypeselected.setBounds(313, 251, 123, 14);
		contentPane.add(NoFlightTypeselected);
		
		
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean hotel=true;
				boolean car=true;
				boolean flight=true;
				String hotelroom,cartype,flightclass;
				int nights,days,flightdate,visa;
				Service s,c,f;
				Booking b = new Booking();
			if(HotelBox.isSelected()) {
				hotelroom=(String)roomType.getSelectedItem();
				nights=Integer.parseInt(textField.getText());
				if(hotelroom==null) {
					forRoomType.setText("Select aRoom Type..");
					hotel=false;}
				if(nights<=0) {
					forNegativeOrZeroights.setText("Nights can't be zero or negative..");
					hotel=false;
				}
				if(hotel) {
					s=new Hotel(hotelroom.charAt(0),nights);	
					b.addService(s);
				}
			}
			
			if(carBox.isSelected()) {
				cartype=(String)carType.getSelectedItem();
				days=Integer.parseInt(textField_1.getText());
				if(cartype==null) {
					forCarType.setText("Select aCar Type..");
					car=false;}
				if(days<=0) {
					forNegativeZerodays.setText("Days can't be zero or negative..");
					car=false;
				}
				if(car) {
					c=new CarRental(cartype.charAt(0),days);	
					b.addService(c);
				}
			}
			if(flightBox.isSelected()) {
				flightclass=(String)flightClass.getSelectedItem();
				flightdate=(int)monthDay.getSelectedItem();
				if(flightclass==null) {
					forUnSelectedClass.setText("Select aFlight class..");
					flight=false;}
				if(group.getSelection()==null) {
					NoFlightTypeselected.setText("Select domestic or International..");
					flight=false;
				}
				if(flightdate==0) {
					forNonMonthDays.setText("Select a date..");
					flight=false;
				}
				if(flight) {
					if(internationalRadioButton.isSelected()) {
					visa = JOptionPane.showConfirmDialog(ServicesListFrame.this, "Do you have a valid visa?","Visa Check",JOptionPane.YES_NO_OPTION);
					boolean hasVisa = (visa == JOptionPane.YES_OPTION);
						f=new internationalFlights(flightdate,flightclass.charAt(0),hasVisa);
					    b.addService(f);
					}
					else {
						f=new Flight(flightdate,flightclass.charAt(0));
						b.addService(f);}
					}
			}
			if(hotel&&car&&flight) {
				boolean made= BookWithUs.makeBookUser(currentUser,b);
				if(made) {
					JOptionPane.showMessageDialog(ServicesListFrame.this, "Booking made successfully!");	
					BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
					frame_bO.setVisible(true);
					dispose(); //remove this frame.
				}
				else {
				JOptionPane.showMessageDialog(ServicesListFrame.this, "You must select at least one service..");}	
			}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(161, 228, 98, 23);
		contentPane.add(btnNewButton);
			
	
	}
	
	
	
	
	
	
	/**
	 * @wbp.parser.constructor
	 */
	
	public ServicesListFrame(User u,int b){
		currentUser=u;
		bb=u.findBooking(b);

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
		
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnBack.setBounds(10, 228, 108, 23);
		contentPane.add(btnBack);
		
		JLabel lblMakebookingService = new JLabel("Choose Services(You can Add one at a time:");
		lblMakebookingService.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblMakebookingService.setBounds(10, 11, 383, 21);
		contentPane.add(lblMakebookingService);
		
		JRadioButton HotelBox = new JRadioButton("Hotel");
		HotelBox.setHorizontalAlignment(SwingConstants.CENTER);
		HotelBox.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		HotelBox.setBounds(10, 63, 69, 23);
		contentPane.add(HotelBox);
		
		JRadioButton carBox = new JRadioButton("Car");
		carBox.setHorizontalAlignment(SwingConstants.CENTER);
		carBox.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		carBox.setBounds(172, 63, 69, 23);
		contentPane.add(carBox);
		
		JRadioButton flightBox = new JRadioButton("Flight");
		flightBox.setHorizontalAlignment(SwingConstants.CENTER);
		flightBox.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		flightBox.setBounds(305, 63, 69, 23);
		contentPane.add(flightBox);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(HotelBox);
		group1.add(carBox);
		group1.add(flightBox);
		
		
		JLabel lblNewLabel = new JLabel("How many nights?");
		lblNewLabel.setBounds(10, 146, 108, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton DomesticRadioButton = new JRadioButton("Domestic");
		DomesticRadioButton.setBounds(334, 85, 110, 22);
		contentPane.add(DomesticRadioButton);
		
		JRadioButton internationalRadioButton = new JRadioButton("International");
		internationalRadioButton.setBounds(334, 110, 102, 22);
		contentPane.add(internationalRadioButton);
		
		ButtonGroup group = new ButtonGroup();
		group.add(DomesticRadioButton);
		group.add(internationalRadioButton);
		
		
		JLabel lblNewLabel_1 = new JLabel("Class");
		lblNewLabel_1.setBounds(313, 130, 131, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Room Type:");
		lblNewLabel_2.setBounds(10, 93, 88, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Car Type");
		lblNewLabel_3.setBounds(161, 93, 98, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("How many days?");
		lblNewLabel_4.setBounds(161, 146, 98, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Date (Day in month):");
		lblNewLabel_5.setBounds(313, 177, 116, 14);
		contentPane.add(lblNewLabel_5);
		
		JComboBox<String> roomType = new JComboBox<>();
		roomType.setModel(new DefaultComboBoxModel<String>(new String[] {null, "Regular", "Suite"}));
		roomType.setBounds(10, 121, 98, 23);
		contentPane.add(roomType);
		
		JComboBox<String> carType = new JComboBox<String>();
		carType.setModel(new DefaultComboBoxModel<String>(new String[] {null,"Luxury", "Reqular"}));
		carType.setBounds(161, 121, 98, 23);
		contentPane.add(carType);
		
		JComboBox<String> flightClass = new JComboBox<>();
		flightClass.setModel(new DefaultComboBoxModel<String>(new String[] {null, "First Class", "Business Class", "Economy"}));
		flightClass.setBounds(313, 149, 116, 17);
		contentPane.add(flightClass);
		
		JComboBox<Integer> monthDay = new JComboBox<>();
		monthDay.setModel(new DefaultComboBoxModel<Integer>(new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11, 12, 13, 14, 15, 16, 17, 18, 19,20, 21, 22, 23, 24, 25, 26, 27, 28, 29,30}));
		monthDay.setBounds(313, 191, 116, 23);
		contentPane.add(monthDay);
		
		textField = new JTextField();
		textField.setBounds(10, 165, 88, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(161, 165, 88, 23);
		contentPane.add(textField_1);
		
		
		
		
		HotelBox.addActionListener(e -> {
		    roomType.setEnabled(true);
		    textField.setEnabled(true);

		    carType.setEnabled(false);
		    textField_1.setEnabled(false);

		    DomesticRadioButton.setEnabled(false);
		    internationalRadioButton.setEnabled(false);
		    flightClass.setEnabled(false);
		    monthDay.setEnabled(false);
		});

		carBox.addActionListener(e -> {
		    roomType.setEnabled(false);
		    textField.setEnabled(false);

		    carType.setEnabled(true);
		    textField_1.setEnabled(true);

		    DomesticRadioButton.setEnabled(false);
		    internationalRadioButton.setEnabled(false);
		    flightClass.setEnabled(false);
		    monthDay.setEnabled(false);
		});

		flightBox.addActionListener(e -> {
		    roomType.setEnabled(false);
		    textField.setEnabled(false);

		    carType.setEnabled(false);
		    textField_1.setEnabled(false);

		    DomesticRadioButton.setEnabled(true);
		    internationalRadioButton.setEnabled(true);
		    flightClass.setEnabled(true);
		    monthDay.setEnabled(true);
		});

		
		JLabel forRoomType = new JLabel("");
		forRoomType.setBounds(10, 195, 131, 14);
		contentPane.add(forRoomType);
		
		JLabel forNegativeOrZeroights = new JLabel("");
		forNegativeOrZeroights.setBounds(10, 214, 131, 14);
		contentPane.add(forNegativeOrZeroights);
		
		JLabel forCarType = new JLabel("");
		forCarType.setBounds(161, 195, 108, 14);
		contentPane.add(forCarType);
		
		JLabel forNegativeZerodays = new JLabel("");
		forNegativeZerodays.setBounds(161, 214, 88, 14);
		contentPane.add(forNegativeZerodays);
		
		JLabel forUnSelectedClass = new JLabel("");
		forUnSelectedClass.setBounds(313, 214, 116, 14);
		contentPane.add(forUnSelectedClass);
		
		JLabel forNonMonthDays = new JLabel("");
		forNonMonthDays.setBounds(313, 233, 123, 14);
		contentPane.add(forNonMonthDays);
		JLabel NoFlightTypeselected = new JLabel("");
		NoFlightTypeselected.setBounds(313, 251, 123, 14);
		contentPane.add(NoFlightTypeselected);
		
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hotelroom,cartype,flightclass;
				int nights,days,flightdate,visa;
				Service s,c,f;
				Booking bookToModify= bb;
				boolean hotel=true,car=true,flight=true;
				try {
			if(HotelBox.isSelected()) {
				hotelroom=(String)roomType.getSelectedItem();
				nights=Integer.parseInt(textField.getText());
				if(hotelroom==null) {
					forRoomType.setText("Select aRoom Type..");
					hotel=false;}
				if(nights<=0) {
					forNegativeOrZeroights.setText("Nights can't be zero or negative..");
					hotel=false;
				}
				if(hotel) {
					s=new Hotel(hotelroom.charAt(0),nights);	
					bookToModify.addService(s);
					BookWithUs.saveUsers();
					JOptionPane.showMessageDialog(ServicesListFrame.this, "Service added successfully!");	
					BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
					frame_bO.setVisible(true);
					dispose(); //remove this frame.
				}		
			}
				
			if(carBox.isSelected()) {
				cartype=(String)carType.getSelectedItem();
				days=Integer.parseInt(textField_1.getText());
				if(cartype==null) {
					forCarType.setText("Select aCar Type..");
					car=false;}
				if(days<=0) {
					forNegativeZerodays.setText("Days can't be zero or negative..");
					car=false;
				}
				if(car) {
					c=new CarRental(cartype.charAt(0),days);	
					bookToModify.addService(c);
					BookWithUs.saveUsers();
					JOptionPane.showMessageDialog(ServicesListFrame.this, "Service added successfully!");	
					BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
					frame_bO.setVisible(true);
					dispose(); //remove this frame.
				}
			}
			if(flightBox.isSelected()) {
				flightclass=(String)flightClass.getSelectedItem();
				flightdate=(int)monthDay.getSelectedItem();
				if(flightclass==null) {
					forUnSelectedClass.setText("Select aFlight class..");
					flight=false;}
				if(group.getSelection()==null) {
					NoFlightTypeselected.setText("Select domestic or International..");
					flight=false;
				}
				if(flightdate==0) {
					forNonMonthDays.setText("Select a date..");
					flight=false;
				}
				if(flight) {
					if(internationalRadioButton.isSelected()) {
					visa = JOptionPane.showConfirmDialog(ServicesListFrame.this, "Do you have a valid visa?","Visa Check",JOptionPane.YES_NO_OPTION);
					boolean hasVisa = (visa == JOptionPane.YES_OPTION);
						f=new internationalFlights(flightdate,flightclass.charAt(0),hasVisa);
						bookToModify.addService(f);
						BookWithUs.saveUsers();
					    JOptionPane.showMessageDialog(ServicesListFrame.this, "Service added successfully!");	
						BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
						frame_bO.setVisible(true);
						dispose(); //remove this frame.
					}
					else {
						f=new Flight(flightdate,flightclass.charAt(0));
						bookToModify.addService(f);
						BookWithUs.saveUsers();
						JOptionPane.showMessageDialog(ServicesListFrame.this, "Service added successfully!");	
						BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
						frame_bO.setVisible(true);
						dispose(); }//remove this frame.
					}
				}
				}
				catch(RuntimeException LimitReached){
					JOptionPane.showMessageDialog(ServicesListFrame.this, "Service addition Failed! "+LimitReached.getMessage());	
					BookingOptionsFrame frame_bO=new BookingOptionsFrame(currentUser);
					frame_bO.setVisible(true);
					dispose();
				}
			}
		});
			
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(161, 228, 98, 23);
		contentPane.add(btnNewButton);
	}	
	
	}
	

