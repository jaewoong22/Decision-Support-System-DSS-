package team1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Join2 {
	String NID;
	String NPass;
	
	public Join2(String NID, String NPass) {
		this.NID=NID;
		this.NPass=NPass;	
	}
	public String toStringNID() {
		return NID;
	}
	
	public String toStringNPass() {
		return NPass;
	}
	public void join(String NID, String NPass) throws FileNotFoundException {
		Join2 Join2=new Join2(NID,NPass);
		Scanner scn = new Scanner(new File("login.txt"));
		String[] IDs = new String[1000];
		String[] Passes=new String[1000];
		int i=0;
		while(scn.hasNext()) {
			IDs[i]=scn.next();
			Passes[i]=scn.next();
			i++;		
		}
		IDs[i]=Join2.toStringNID();
		Passes[i]=Join2.toStringNPass();
		i=0;
		PrintStream prt=new PrintStream(new File("login.txt"));
		while(1==1) {
			prt.print(IDs[i]+" ");
			prt.println(Passes[i]);
			i++;
			if(IDs[i]==null) {
				break;
			}
		}
		
		
	}

	
	
}
