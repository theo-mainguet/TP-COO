public class Fraction {

    int num = 0;
    int denom = 1;

    Fraction() {}
    
    Fraction(int n){
	this.num = n;
	this.denom = denom;
    }
    
    Fraction(int n, int d){
	this.num = n;
	this.denom = d;
    }

    public String toString (){
	return num + "/" + denom;
    }

    public int compareTo(Fraction frac){
	double res1 = this.num/this.denom;
	double res2 = frac.num/frac.denom;
	
	if (res1 > res2){
	    return 1;
	}else if (res1 < res2){
	    return -1;
	}else{
	    return 0;
	}
    }
    
    //ADDITIONNER

    Fraction somme (Fraction fraction){
	if (this.denom == fraction.denom){
	    return new Fraction (this.num + fraction.num, this.denom);
	}else{
	    return new Fraction (this.num * fraction.denom + fraction.num * this.denom, this.denom * fraction.denom);
	}
    }    
    
    void additionner(Fraction fraction){
	if (this.denom == fraction.denom){
	    this.num = fraction.num + this.num;
	}else{
	    this.num = fraction.num * this.denom + fraction.denom + this.num;
	    this.denom = this.denom * fraction.denom;
	}
    }

    //MULTIPLIER

    Fraction produit (Fraction fraction){
	return new Fraction (this.num * fraction.num, this.denom * fraction.denom);
    }

    Fraction produit (int entier){
	return new Fraction(this.num * entier, this.denom);
    }

    void multiplier (Fraction fraction){
	this.num = this.num * fraction.num;
	this.denom = this.denom * fraction.denom;
    }

    void multiplier (int entier){
	this.num = this.num * entier;
    }
}
