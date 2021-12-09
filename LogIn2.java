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
import java.awt.Color;

public class LogIn2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtPass;
	private String userID;
	private String userPass;
	private static LogIn2 frame;
	private Join Join;
	private Loog log;
	private TeamProject1 prg;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LogIn2();
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
	public LogIn2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(34, 36, 69, 20);
		contentPane.add(lblId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(34, 90, 69, 20);
		contentPane.add(lblPassword);
		
		txtID = new JTextField();
		txtID.setBounds(212, 33, 146, 26);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setText("");
		txtPass.setBounds(212, 87, 146, 26);
		contentPane.add(txtPass);
		txtPass.setColumns(10);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(155, 174, 115, 29);
		contentPane.add(btnExit);
		
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				userID=txtID.getText();
				userPass=txtPass.getText();
				log=new Loog(userID,userPass);
				try {
					boolean ox=log.ox();
					if(ox==true) {
						prg= new TeamProject1();
						prg.setVisible(true);
						prg.send(frame, prg);
						frame.setVisible(false);
						}
	
					else {
						btnExit.setText("try again!");
					}
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
			}
		});
		btnLogIn.setBounds(15, 174, 115, 29);
		contentPane.add(btnLogIn);
		
		JButton btnJoin = new JButton("Join");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Join=new Join();
			frame.setVisible(false);
			Join.Send(frame, Join);
			Join.setVisible(true);
			
			}
		});
		btnJoin.setBounds(298, 174, 115, 29);
		contentPane.add(btnJoin);
		
	
	}
	
	public String ID() {
		return userID;
	}
}
