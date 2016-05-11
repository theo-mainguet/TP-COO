public class EssaiEasyDate{

    public static void main (String [] args){
	EasyDate date1 = new EasyDate("12/10/1996");
	EasyDate date2 = new EasyDate("02/07/1997");
	System.out.println(date1.compareTo(date2));
    }
}
