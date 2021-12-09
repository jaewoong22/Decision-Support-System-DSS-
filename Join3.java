package team1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Join3 {
	private String name;
	private int age;
	private int stsnum;
	
	public Join3(String name, int age, int stsnum){
		this.stsnum=stsnum;
		this.name=name;
		this.age=age;
	}
	public String toStringName() {
		return name;
	}
	public boolean ox() throws FileNotFoundException {
		Scanner scn=new Scanner(new File("name.txt"));
		boolean a=false;	
		while(scn.hasNextLine()) {
			String n=scn.next();
			int ag=scn.nextInt();
			int sts=scn.nextInt();
			if(n.equals(name)&&ag==age&&stsnum==sts) {
				a=true;
				break;
			}
		
		
	}
		return a;


}
}