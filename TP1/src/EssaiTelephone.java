public class EssaiTelephone{
    public static void main(String[] args){
	for(int i=0; i < 45; i = i + 11){
	    Telephone t = new Telephone (i,i,i,i,i);
	    System.out.println(t.toString());
	}
    }
}
