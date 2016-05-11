package personnages.abstrait;
import personnages.concret.Element;

public interface Magicien extends Vivant {

	public void attaque (Magicien magicien);
	public void subitAttaque (Magicien magicien);
	public Element getElement ();
}
