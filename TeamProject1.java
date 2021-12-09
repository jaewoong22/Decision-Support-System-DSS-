package team1;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;


public class TeamProject1 extends JFrame {

private JPanel contentPane;
private JTextField txta3;
private JTextField txtb3;
private JTextField txtc3;
private JTextField txta2;
private JTextField txtb2;
private JTextField txtc2;
private JTextField txta1;
private JTextField txtb1;
private JTextField txtc1;
private JLabel lblSelectThe;
private JTextField textResult;
private char strategy;
private button2 button;
private int result;
private String strt;
private Max max;
private Min min;
private int a1;
private int a2;
private int a3;
private int b1;
private int b2;
private int b3;
private int c1;
private int c2;
private int c3;
private TeamProject1 prg;
private LogIn2 login;
private Histo histo;

/**
 * Launch the application.
 */
/*public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				TeamProject1 frame = new TeamProject1();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}*/

/**
 * Create the frame.
 */
public TeamProject1() {
	setTitle("Minimize Objective");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 472);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	//---------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------jpanel01
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.WHITE);
	panel.setBounds(0, 0, 432, 210);
	contentPane.add(panel);
	panel.setLayout(null);
	
	//--------------------------------------------------------input
	
	txta1 = new JTextField();
	txta1.setColumns(10);
	txta1.setBounds(118, 86, 80, 24);
	panel.add(txta1);

	txta2 = new JTextField();
	txta2.setColumns(10);
	txta2.setBounds(228, 86, 80, 24);
	panel.add(txta2);
	
	txta3 = new JTextField();
	txta3.setBounds(338, 86, 80, 24);
	panel.add(txta3);
	txta3.setColumns(10);

	txtb1 = new JTextField();
	txtb1.setColumns(10);
	txtb1.setBounds(118, 123, 80, 24);
	panel.add(txtb1);

	txtb2 = new JTextField();
	txtb2.setColumns(10);
	txtb2.setBounds(228, 122, 80, 24);
	panel.add(txtb2);
	
	txtb3 = new JTextField();
	txtb3.setColumns(10);
	txtb3.setBounds(338, 122, 80, 24);
	panel.add(txtb3);

	txtc1 = new JTextField();
	txtc1.setColumns(10);
	txtc1.setBounds(118, 158, 80, 24);
	panel.add(txtc1);

	txtc2 = new JTextField();
	txtc2.setColumns(10);
	txtc2.setBounds(228, 158, 80, 24);
	panel.add(txtc2);

	txtc3 = new JTextField();
	txtc3.setColumns(10);
	txtc3.setBounds(338, 158, 80, 24);
	panel.add(txtc3);
	
	//-----------------------------------------------------------label
	
	JLabel lblRise = new JLabel("Rates Rise");
	lblRise.setHorizontalAlignment(SwingConstants.CENTER);
	lblRise.setBounds(118, 56, 84, 18);
	panel.add(lblRise);
	
	JLabel lblStable = new JLabel("Rates Stable");
	lblStable.setHorizontalAlignment(SwingConstants.CENTER);
	lblStable.setBounds(228, 56, 84, 18);
	panel.add(lblStable);
	
	JLabel lblFall = new JLabel("Rates Fall");
	lblFall.setHorizontalAlignment(SwingConstants.CENTER);
	lblFall.setBounds(334, 56, 84, 18);
	panel.add(lblFall);
	
	JLabel lblARM1 = new JLabel(" 1-year ARM");
	lblARM1.setHorizontalAlignment(SwingConstants.CENTER);
	lblARM1.setBounds(11, 93, 93, 18);
	panel.add(lblARM1);
	
	JLabel lblARM3 = new JLabel(" 3-year ARM");
	lblARM3.setHorizontalAlignment(SwingConstants.CENTER);
	lblARM3.setBounds(11, 126, 93, 18);
	panel.add(lblARM3);
	
	JLabel lblARM30 = new JLabel("30-year ARM");
	lblARM30.setHorizontalAlignment(SwingConstants.CENTER);
	lblARM30.setBounds(11, 161, 93, 18);
	panel.add(lblARM30);
	
	JLabel lblPlease = new JLabel("* Input the cost");
	lblPlease.setFont(new Font("援대┝", Font.BOLD, 15));
	lblPlease.setBounds(11, 12, 404, 24);
	panel.add(lblPlease);
	
	JButton btnLogOut = new JButton("Log Out");
	btnLogOut.setBounds(302, 11, 115, 29);
	panel.add(btnLogOut);
	btnLogOut.setBackground(UIManager.getColor("Button.background"));
	btnLogOut.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			login=new LogIn2();
			prg.setVisible(false);
			login.setVisible(true);
		}
	});
	
	//---------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------jpanel02
	
	JPanel panel_1 = new JPanel();
	panel_1.setBackground(Color.WHITE);
	panel_1.setBounds(0, 201, 432, 215);
	contentPane.add(panel_1);
	panel_1.setLayout(null);
	
	lblSelectThe = new JLabel("* Select the strategy");
	lblSelectThe.setFont(new Font("援대┝", Font.BOLD, 15));
	lblSelectThe.setBounds(14, 12, 404, 18);
	panel_1.add(lblSelectThe);
	
	//----------------------------------------------------------------------select
	
	JRadioButton radioButton = new JRadioButton("Aggressive Strategy");
	radioButton.setBackground(Color.WHITE);
	radioButton.setBounds(24, 38, 209, 27);
	panel_1.add(radioButton);
	
	JRadioButton radioButton_1 = new JRadioButton("Conservation Strategy");
	radioButton_1.setBackground(Color.WHITE);
	radioButton_1.setBounds(24, 69, 209, 27);
	panel_1.add(radioButton_1);
	

	//Group the radio buttons.----------------�븯�굹留� 媛��뒫
    ButtonGroup group = new ButtonGroup();
    group.add(radioButton);
    group.add(radioButton_1);
    //----------------------------------------------------------------踰꾪듉�씠踰ㅽ듃
	
	JButton btnButton = new JButton("Report");
	btnButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			histo=new Histo();
			try {
				prg.setVisible(false);
				histo.send(prg, button, max, min, login,histo);
				histo.setVisible(true);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			
	}
	});
		
	btnButton.setBounds(33, 153, 105, 27);
	panel_1.add(btnButton);
	
	//-------------------------------------------------------------寃곌낵媛믫몴�떆
	
	textResult = new JTextField();
	textResult.setEditable(false);
	textResult.setBounds(283, 153, 116, 27);
	panel_1.add(textResult);
	textResult.setColumns(10);
	
	JButton btnReport = new JButton("Result");
	btnReport.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			a1=Integer.parseInt(txta1.getText());
			a2=Integer.parseInt(txta2.getText());
			a3=Integer.parseInt(txta3.getText());
			b1=Integer.parseInt(txtb1.getText());
			b2=Integer.parseInt(txtb2.getText());
			b3=Integer.parseInt(txtb3.getText());
			c1=Integer.parseInt(txtc1.getText());
			c2=Integer.parseInt(txtc2.getText());
			c3=Integer.parseInt(txtc3.getText());
			
			max=new Max(a1,a2,a3,b1,b2,b3,c1,c2,c3);
			min=new Min(a1,a2,a3,b1,b2,b3,c1,c2,c3);
			
			if (radioButton.isSelected()) {
				strategy = 'A';}
			else {
				strategy = 'C';
			}
			
			button=new button2(strategy);
			result=button.total(max, min);
			strt=button.strt(max, min);
			textResult.setText(strt+": "+result);
		}
	});
	btnReport.setBounds(153, 152, 115, 29);
	panel_1.add(btnReport);

}

public void send(LogIn2 login, TeamProject1 prg) {
	this.login=login;
	this.prg=prg;
	
}
}

