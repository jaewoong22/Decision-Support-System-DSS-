package team1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loog {
	private String userID;
	private String userPass;

	
	public Loog(String userID, String userPass) {
		this.userID=userID;
		this.userPass=userPass;
	}
	public Loog() {
		
	}
	public String toStringID() {
		return this.userID;
	}
	public String toStringPass() {
		return userPass;
	}
	
	public boolean ox() throws FileNotFoundException {
		Scanner scn=new Scanner(new File("login.txt"));
		boolean a=false;
		while(scn.hasNext()) {
			String id=scn.next();
			String pass=scn.next();
			if(id.equals(userID)&&pass.equals(userPass)) {
				a=true;
				break;
			}
		}
		return a;
		
	}
	
	
}
