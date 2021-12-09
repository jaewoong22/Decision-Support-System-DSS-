package team1;

public class button2 {
	private char strategy;
	
	
	public button2(char strategy) {
		this.strategy=strategy;
	}
	public String getStrategyString() {
		 if(strategy == 'A') {
		  return "AA";}
		 else {
		  return "CC";
		 }
		}

		public char getStrategy() {
		 return strategy;
		}
		public int total(Max max, Min min) {
			int A;
			if(strategy=='A') {
				A=min.minmin();
			}
			else {
				A=max.maxmax();
			}
			return A;

	}
		public String strt(Max max, Min min) {
			String strt;
			if(strategy=='A') {
				strt=min.finalStt(min);
			}
			else {
				strt=max.finalStg(max);
			}
			return strt;
		}
		public String strt2() {
			if(strategy=='A') {
				return "Aggressive";
			}
			else {
				return "Conservative";
			}
		}

}
