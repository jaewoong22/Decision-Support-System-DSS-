package team1;

public class Min {
	private int min1, min2, min3;
	private String strategy;
	
	public Min(int a1,int a2, int a3, int b1, int b2, int b3,int c1, int c2, int c3) {
		if (a1 <= a2 && a1 <= a3) {
            min1 = a1;
        } else if (a2 <= a1 && a2 <= a3) {
            min1 = a2;
        } else {
            min1 = a3;
        }
	 
	 if (b1 <= b2 && b1 <= b3) {
            min2 = b1;
        } else if (b2 <= b1 && b2 <= b3) {
            min2 = b2;
        } else {
            min2 = b3;
        }
	 
	 if (c1 <= c2 && c1 <= c3) {
            min3 = c1;
        } else if (c2 <= c1 && c2 <= c3) {
            min3 = c2;
        } else {
            min3 = c3;
        }
	}
	public int min1String() {
		return min1;
	}
	public int min2String() {
		return min2;
	}
	public int min3String() {
		return min3;
	}
	public int minmin() {
		int C;
		 if (min1 <= min2 && min1 <= min2) {
	            C = min1;
	        } else if (min2 <= min1 && min2 <= min3) {
	            C = min2;
	        } else {
	            C = min3;
	        }
		 return C;

	}
	public String finalStt(Min min) {
		int A=min.minmin();
		if(A==min1) {
			strategy="1-year-ARM";
		}
		else if(A==min2) {
			strategy="3-year-ARM";
		}
		else {
			strategy="30-year-ARM";
		}
		return strategy;
		
	}
	

	
	
	
	
}
