package jia.exercises.lecture3.Aleksander.Zlatkovski;



public class Rational {
	
	private int denom; 
    private int numer; 
	
    public Rational(int numer, int denom) {
		super();
		this.numer = numer;
		this.denom = denom;
	}
    
    public Rational(int numer) {
    	super();
    	this.numer = numer;
    	this.denom = 1;
    }
    
    public Rational add(Rational that) {
    	
    	int num = this.numer * that.denom + that.numer * this.denom;
    	int den = this.denom * that.denom;
    	
        return new Rational(num / gcd(num, den), den / gcd(num, den));
    }
    
    public Rational sub(Rational that) {
    	
    	int num = this.numer * that.denom - that.numer * this.denom;
    	int den = this.denom * that.denom;
    	
        return new Rational(num / gcd(num, den), den / gcd(num, den));
    }
    
    public Rational mult(Rational that) {
    	
    	int num = this.numer * that.numer;
    	int den = this.denom * that.denom;
    	
    	return new Rational(num / gcd(num, den), den / gcd(num, den));
    	
    }
    
    public Rational dev(Rational that) throws java.lang.ArithmeticException  {
    	
    	int num = this.numer * that.denom;
    	int den = this.denom * that.numer;
    		
    		if(den==0) throw new java.lang.ArithmeticException("Delenie na 0");
    		
    		return new Rational(num / gcd(num, den), den / gcd(num, den));
    	
    	}
    
    public String toString() {
    	
    	String s = "";
    	if(denom == 1) return s = this.numer + "";
    	if(numer == 0) return s = 0 + "";
    	return s = this.numer+"/"+this.denom;
    	
    }
    
    private int gcd( int n, int k) {
    	
    	int min = Math.min(Math.abs(n), Math.abs(k));
    	int gcd = min;
    	
    	for(int i = min; i > 0; i--) {
    		if((Math.abs(n) % i)== 0 && (Math.abs(k) % i)==0) return i;
    	}
    	return 1;
    }
    
    /*
    private int gcd(int a, int b) {
    	if(b == 0) return a;
    	return gcd(b,a%b);
    }
    */
    
}







