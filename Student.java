
public class Student {
	
	 int rNum;
	 int nGuess;
	 int hGuess=100;
	 int lGuess=0;
	 boolean r;
	
	public Student() {
		
	}
	
	public  void setrNum (int ranNum) {
	    rNum = ranNum;
	}
	
	public void setnGuess (int nexGuess) {
		nGuess = nexGuess;
	}
	
	
	public int getrNum() {
		return rNum;
	}
	
	public int getnGuess() {
		return nGuess;
	}
	
	public int gethGuess() {
		return hGuess;
	}
	
	public int getlGuess() {
		return lGuess;
	}
	
	public boolean compareToRandomNumber(int nGuess,int rNum) {
		if (nGuess == rNum) {
			r = true;
		}else {
			r = false;
		}
		return r;
	}

}
