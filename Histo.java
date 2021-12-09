package team1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Histo extends JFrame {

	private JPanel contentPane;
	private JTable newTable;
	private JTextField txtstrt;
	private JTextField txtdeci;
	private JTextField txtresult;
	private JScrollPane scrollPane;
	private TeamProject1 prg;
	private button2 btn;
	private Max max;
	private Min min;
	private LogIn2 login;
	private JLabel lblUser;
	private JTextField txtID;
	private String[][] lastreport ;
	private Histo frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Histo frame = new Histo();
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
	public Histo() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 591, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(233, 16, 321, 327);
		contentPane.add(scrollPane);
		
		JLabel lblStrategy = new JLabel("Strategy");
		lblStrategy.setBounds(15, 77, 69, 20);
		contentPane.add(lblStrategy);
		
		JLabel lblBestDecision = new JLabel("Best Decision");
		lblBestDecision.setBounds(15, 144, 105, 20);
		contentPane.add(lblBestDecision);
		
		JLabel lblBestResult = new JLabel("Best result");
		lblBestResult.setBounds(15, 213, 128, 20);
		contentPane.add(lblBestResult);
		
		txtstrt = new JTextField();
		txtstrt.setEditable(false);
		txtstrt.setBounds(15, 102, 146, 26);
		contentPane.add(txtstrt);
		txtstrt.setColumns(10);
		
		txtdeci = new JTextField();
		txtdeci.setEditable(false);
		txtdeci.setBounds(15, 171, 146, 26);
		contentPane.add(txtdeci);
		txtdeci.setColumns(10);
		
		txtresult = new JTextField();
		txtresult.setEditable(false);
		txtresult.setBounds(15, 249, 146, 26);
		contentPane.add(txtresult);
		txtresult.setColumns(10);
		
		lblUser = new JLabel("User's ID");
		lblUser.setBounds(15, 16, 69, 20);
		contentPane.add(lblUser);
		
		txtID = new JTextField();
		txtID.setEditable(false);
		txtID.setBounds(15, 40, 146, 26);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prg.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnReturn.setBounds(36, 314, 115, 29);
		contentPane.add(btnReturn);
	}
	
	public void send(TeamProject1 prg, button2 btn, Max max, Min min, LogIn2 login, Histo histo) throws FileNotFoundException {
		this.prg=prg;
		this.btn=btn;
		this.max=max;
		this.min=min;
		this.login=login;
		this.frame=histo;
		txtID.setText(login.ID());
		txtstrt.setText(btn.strt2());
		txtdeci.setText(btn.strt(max, min));
		txtresult.setText(Integer.toString(btn.total(max, min)));
		getvar();
		
	}
	
	
	
	
	public void getvar() throws FileNotFoundException {
		Scanner scn=new Scanner(new File("report.txt"));
		lastreport=new String[1000][5];
		int i=0;
		while(scn.hasNext()) {
			for(int j=0;j<3;j++) {
				lastreport[i][j]=scn.next();
			}
			lastreport[i][3]=scn.nextLine();
			i++;		
		}
		lastreport[i][0]=txtID.getText();
		lastreport[i][1]=txtstrt.getText();
		lastreport[i][2]=txtdeci.getText();
		lastreport[i][3]=txtresult.getText();
		String[] rprt=new String[i+1];
		PrintStream prt=new PrintStream(new File("report.txt"));
		i=0;
		while(!(lastreport[i][0]==null)) {
			rprt[i]=lastreport[i][0]+" "+lastreport[i][1]+" "+lastreport[i][2]+" "+lastreport[i][3];
			prt.print(rprt[i]);
			prt.println();
			i++;
		}
		
		String[] name = { "ID", "Strategy", "Decision", "Best result" };
		newTable= new JTable(lastreport,name);
		newTable.setBounds(350, 30, 100, 90);
		newTable.setAutoCreateRowSorter(true);
		scrollPane.getViewport().setView(newTable);
		contentPane.add(scrollPane);
		
		
	}
}
