package mtis;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	//9 . Créer des instances de la classe CompteBancaire
		// Nous en créerons 4
ArrayList<CompteBancaire> listeCB = new ArrayList<CompteBancaire>();
CompteBancaire c1 = new CompteBancaire();
CompteBancaire c2 = new CompteBancaire();
CompteBancaire c3 = new CompteBancaire();
CompteBancaire c4 = new CompteBancaire();
// 10. Ajouter les objets dans une liste
listeCB.add(c1);
listeCB.add(c2);
listeCB.add(c3);
listeCB.add(c4);
// 11. afficher la liste des objets crées.
// Nous allons procéder par itération en utilisant "for"
for (CompteBancaire c: listeCB) {
     c.saisie();
     }// Pour permettre à l'utilisateur d'entrer ses données.
for (CompteBancaire c: listeCB) {
	c.afficher(); // Pour enfin afficher la liste des comptes bancaires avec leur information.
}
	}

}
