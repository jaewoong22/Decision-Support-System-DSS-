package team1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;

public class Join extends JFrame {

	private JPanel contentPane;
	private JTextField txtNID;
	private JTextField txtNPass;
	private JTextField txtWellcome;
	private JButton btnJoin;
	private JButton btnReturn;
	private Join frame;
	private Join2 Join2;
	private LogIn2 Login;
	private JTextField txtName;
	private JLabel lblAge;
	private JLabel lblStudentNumber;
	private JLabel lblNewId;
	private JTextField txtSts;
	private JButton btnExit;
	private JSpinner spinner;
	private JLabel lblNewPassword;
	private JLabel lblName;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
////			public void run() {
////				try {
////					frame = new Join();
////					frame.setVisible(true);
////				} catch (Exception e) {
////					e.printStackTrace();
////				}
////			}
////		});
//	}

	/**
	 * Create the frame.
	 */
	public Join() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 451, 444);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewId = new JLabel("New ID");
		lblNewId.setBounds(15, 187, 69, 20);
		contentPane.add(lblNewId);
		
		lblNewPassword = new JLabel("New Password");
		lblNewPassword.setBounds(15, 240, 120, 20);
		contentPane.add(lblNewPassword);
		
		txtNID = new JTextField();
		txtNID.setBounds(220, 184, 146, 26);
		contentPane.add(txtNID);
		txtNID.setColumns(10);
		
		txtNPass = new JTextField();
		txtNPass.setBounds(220, 237, 146, 26);
		contentPane.add(txtNPass);
		txtNPass.setColumns(10);
		
		txtWellcome = new JTextField();
		txtWellcome.setEditable(false);
		txtWellcome.setBounds(124, 294, 146, 26);
		contentPane.add(txtWellcome);
		txtWellcome.setColumns(10);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(19), null, null, new Integer(1)));
		spinner.setBounds(220, 86, 82, 26);
		contentPane.add(spinner);
		
		btnJoin = new JButton("Join");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name=txtName.getText();
				String NID=txtNID.getText();
				String NPass=txtNPass.getText();
				int age=(int) spinner.getValue();
				int sts=Integer.parseInt(txtSts.getText());
				Join2=new Join2(NID,NPass);
				Join3 Join3=new Join3(name,age,sts);
				try {
					if(Join3.ox()) {
						Join2.join(NID,NPass);
						txtWellcome.setText("Wellcome, "+name);
					}
					else {
						txtWellcome.setText("Unvalid!");
					}
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		btnJoin.setBounds(15, 336, 115, 29);
		contentPane.add(btnJoin);
		
		btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Login.setVisible(true);
				
			}
		});
		btnReturn.setBounds(161, 336, 115, 29);
		contentPane.add(btnReturn);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(299, 336, 115, 29);
		contentPane.add(btnExit);
		
		txtName = new JTextField();
		txtName.setBounds(220, 39, 146, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		lblName = new JLabel("Name");
		lblName.setBounds(15, 42, 69, 20);
		contentPane.add(lblName);
		
		lblAge = new JLabel("Age");
		lblAge.setBounds(15, 89, 69, 20);
		contentPane.add(lblAge);
		
		lblStudentNumber = new JLabel("Student number");
		lblStudentNumber.setBounds(15, 142, 120, 20);
		contentPane.add(lblStudentNumber);
		
		txtSts = new JTextField();
		txtSts.setText("");
		txtSts.setBounds(220, 139, 146, 26);
		contentPane.add(txtSts);
		txtSts.setColumns(10);
		
	
		
	
	}
	
	
	public void Send(LogIn2 Login, Join frame) {
		this.Login=Login;
		this.frame=frame;
		
	}
	
}
