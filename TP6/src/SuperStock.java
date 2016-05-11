
public class SuperStock {
	private Stock stock;
	
	public SuperStock(int maxArticles){
		this.stock = new Stock (maxArticles);
	}
	
	public void ajoutArticle(ArticlesEnStock a){
		this.stock.ajoutArticle(a);
	}
	
	public ArticlesEnStock getArticleByPosition(int num){
		return this.stock.getArticleByPosition(num);
	}
	
	public int nbReferences(){
		return this.stock.nbReferences();
	}
	
	public String toString(){
		return this.stock.toString();
	}
	
	public ArticlesEnStock getByNom(String nom){
		for (int i = 1; i <= stock.nbReferences(); i++){
			if (nom.equals(stock.getArticleByPosition(i).getNom())){
				return stock.getArticleByPosition(i);
			}
		}
		return null;
	}
	
	public ArticlesEnStock getByCode(String code){
		for (int i = 1; i <= stock.nbReferences(); i++){
			if (code.equals(stock.getArticleByPosition(i).getCode())){
				return stock.getArticleByPosition(i);
			}
		}
		return null;
	}
}
