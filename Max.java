package team1;

public class Max {
	private int max1, max2, max3;
	private String strategy;
	
	public Max(int a1,int a2, int a3, int b1, int b2, int b3,int c1, int c2, int c3) {
		 if (a1 >= a2 && a1 >= a3) {
	            max1 = a1;
	        } else if (a2 >= a1 && a2 >= a3) {
	            max1 = a2;
	        } else {
	            max1 = a3;
	        }
		 if (b1 >= b2 && b1 >= b3) {
	            max2 = b1;
	        } else if (b2 >= b1 && b2 >= b3) {
	            max2 = b2;
	        } else {
	            max2 = b3;
	        }
		 
		 if (c1 >= c2 && c1 >= c3) {
	            max3 = c1;
	        } else if (c2 >= c1 && c2 >= c3) {
	            max3 = c2;
	        } else {
	            max3 = c3;
	        }
	}
	
	public int max1String() {
		return max1;
	}
	public int max2String() {
		return max2;
	}
	public int max3String() {
		return max3;
	}
	
	public int maxmax() {
		int A; 
		if (max1 <= max2 && max1 <= max3) {
	           A = max1;
	        } else if (max2 <= max1 && max2 <= max3) {
	            A = max2;
	        } else {
	            A = max3;
	        }
		return A;
		 
		
	}
	public String finalStg(Max max) {
		int A=max.maxmax();
		if(A==max1) {
			strategy="1-year-ARM";
		}
		else if(A==max2) {
			strategy="3-year-ARM";
		}
		else {
			strategy="30-years-ARM";
		}
		return strategy;
	}
	
	
	
	

}
