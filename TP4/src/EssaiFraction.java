public class EssaiFraction{
    
    public static void main(String [] args){
	Fraction f1 = new Fraction (3,2);
	Fraction f2 = new Fraction (1,2);

	System.out.println(f2.compareTo(f1));
	System.out.println(f1.toString());
	System.out.println(f1.somme(f2));
	System.out.println(f1.produit(f2));
	System.out.println(f1.produit(3));
    }
}
