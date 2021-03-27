package td1.main;

import td1.miscs.Observable;
import td1.modele.Bilan;
import td1.vue.UIGraphe;

public class entrypoint {

	public static void main(String[] args) {

		System.out.println("Hello world");
		System.out.println("------------------");
		
		//creation of bilan
		Bilan bilan = new Bilan();
		bilan.setNum(1);
		System.out.println("------------------");
		
		//creation of Graphe
		UIGraphe graphe = new UIGraphe(1);
		UIGraphe graphe2 = new UIGraphe(2);
		UIGraphe graphe3 = new UIGraphe(3);
		
		// add graph as Observer
		// bilan is observable by UIGraphe
		bilan.addObserver(graphe);
		bilan.addObserver(graphe2);
		bilan.addObserver(graphe3);
		
		// bilan send order of changement to abserver
		bilan.setChanges();

	}

}




