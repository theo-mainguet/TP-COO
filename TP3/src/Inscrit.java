public class Inscrit {
    
    String dossard;
    int score;
    int temps;

    Inscrit (int dossard, int score, int min, int sec){
	temps = min * 60 + sec;
	this.score = score;
	if (dossard >= 1 && dossard <= 100 && score >= 0 && score <= 50 && sec >= 0 && sec <= 60 && min >= 0 && min <= 60){
	    this.dossard = "N°" + String.valueOf(dossard);
	}
    }

    public String toString (){
	return "[" + dossard + "," + score + " points," + temps +"s]";
    }
}
