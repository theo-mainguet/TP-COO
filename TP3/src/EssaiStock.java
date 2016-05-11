public class EssaiStock {
    
    public static void main (String [] args){
	// 1) on cree un stock de 20 catégories d'articles
	Stock s = new Stock (20);
	System.out.println(s.toString());
	// 3) on ajoute la categorie pc de code "xdf10"
	s.ajoutArticle(new ArticlesEnStock("PC", "xdf10"));
	System.out.println(s.toString());
	// 4) on ajoute 20 articles de nom pc au stock
	s.getArticleByPosition(0).ajouter(20);
	System.out.println(s.toString());
	// 5) on cree la categorie ecran de code "koz106" et on ajoute 30 articles
	s.ajoutArticle(new ArticlesEnStock("Ecran", "koz106"));
	s.getArticleByPosition(1).ajouter(30);
	System.out.println(s.toString());
	// 6) on retire 10 ecrans du stock
	s.getArticleByPosition(1).retirer(10);
	System.out.println(s.toString());
	// 7) on affiche la quantite d'ecran en stock
	System.out.println("Ecrans en stock : " + s.getArticleByPosition(1).getQuantite());
	// 8) on affiche le nombre total d'articles en stock
	int nbStock = 0;
	for (int i = 0; i < s.nbReferences(); i++){
	    nbStock = nbStock + s.getArticleByPosition(i).getQuantite();
	}
	System.out.println("Articles en stock : " + nbStock);
    }
}
