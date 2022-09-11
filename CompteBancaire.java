package mtis;

import java.util.Scanner;
// 1. Création de la classe CompteBancaire avec ses attributs.
public class CompteBancaire{
private String numeroCompte;
private String nomDuProprietaire;
private double solde;
private String dateOuverture;
private String nomAgenceOuverture;
private String typeDeCompte;
private double montantDepotInitial;

//2.Créer un constructeur sans paramètres et un constructeur avec paramètres
public CompteBancaire() {
	// constructeur sans paramètres
}

public CompteBancaire(String numeroCompte, String nomDuProprietaire, double solde, String dateOuverture,
		String nomAgenceOuverture, String typeDeCompte, double montantDepotInitial) {
	
	this.numeroCompte = numeroCompte;
	this.nomDuProprietaire = nomDuProprietaire;
	this.solde = solde;
	this.dateOuverture = dateOuverture;
	this.nomAgenceOuverture = nomAgenceOuverture;
	this.typeDeCompte = typeDeCompte;
	this.montantDepotInitial = montantDepotInitial;
}
// 3.Créer une méthode versement() qui gère les versements.

public void Versement(double montantAj){
	if (solde == montantDepotInitial){
		solde += montantDepotInitial;
	}else{
	solde += montantAj;
}
}
//4.Créer une méthode retrait() qui gère les retraits
public void retrait(double montantRet) {
	if(solde <= montantRet ) {
		System.out.println("Opération non autorisée!");
	}else {
		solde -= montantRet;
	}
}
//5.Créer une méthode agios() permettant d'appliquer les agios à un pourcentage de 5 % du solde
public void agios() {
	solde *=0.05;
}
//6.Créer une méthode afficher() permettant d’afficher les détails sur le compte
public void afficher() {

	System.out.println("Affichage des informations du compte.");
	System.out.println("Le numéro de votre compte est :"+numeroCompte);
	System.out.println("Le compte eest à la propriété de :"+nomDuProprietaire);
	System.out.println("Votre solde est de :"+solde);
	System.out.println("Compte ouvert le :"+dateOuverture);
	System.out.println("Nom de l'agence d'ouverture du compte :"+nomAgenceOuverture);
	System.out.println("Compte de type :"+typeDeCompte);
	System.out.println("Votre depôt initial est de :"+montantDepotInitial);
}
//7.créer une méthode saisie() qui permet de saisir les informations d'un compte
public void saisie() {
	System.out.println("Veuillez entrer les informations qui vous seront démandées!");
	Scanner clavier = new Scanner(System.in);
	
	System.out.println("Numéro de compte :");
	numeroCompte = clavier.nextLine();
	
	System.out.println("Votre nom complet :");
	nomDuProprietaire = clavier.nextLine();
	
	System.out.println("Votre solde actuel :");
	solde = clavier.nextDouble();
	
	System.out.println("La date(jj/mm/aa) d'ouverture de votre compte :");
	dateOuverture = clavier.nextLine();
	
	System.out.println("Nom de l'agence d'ouverture du compte :");
	nomAgenceOuverture = clavier.nextLine();
	
	System.out.println("Compte de type? :");
	typeDeCompte = clavier.nextLine();
	
	System.out.println("Veuillez entrer le montant de votre depôt initial :");
	montantDepotInitial = clavier.nextDouble();
	
}
//8.créer pour chaque propriété son getter et son setter

public String getNumeroCompte() {
	return numeroCompte;
}
public void setNumeroCompte(String numeroCompte) {
	this.numeroCompte = numeroCompte;
}
public String getNomDuProprietaire() {
	return nomDuProprietaire;
}
public void setNomDuProprietaire(String nomDuProprietaire) {
	this.nomDuProprietaire = nomDuProprietaire;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public String getDateOuverture() {
	return dateOuverture;
}
public void setDateOuverture(String dateOuverture) {
	this.dateOuverture = dateOuverture;
}
public String getNomAgenceOuverture() {
	return nomAgenceOuverture;
}
public void setNomAgenceOuverture(String nomAgenceOuverture) {
	this.nomAgenceOuverture = nomAgenceOuverture;
}
public String getTypeDeCompte() {
	return typeDeCompte;
}
public void setTypeDeCompte(String typeDeCompte) {
	this.typeDeCompte = typeDeCompte;
}
public double getMontantDepotInitial() {
	return montantDepotInitial;
}
public void setMontantDepotInitial(double montantDepotInitial) {
	this.montantDepotInitial = montantDepotInitial;
}
// Nous allons créer une méthode toString pour récupérer et afficher les informations pour une bonne exécution du programme.
@Override
public String toString() {
	return "CompteBancaire [numeroCompte=" + numeroCompte + ", nomDuProprietaire=" + nomDuProprietaire + ", solde="
			+ solde + ", dateOuverture=" + dateOuverture + ", nomAgenceOuverture=" + nomAgenceOuverture
			+ ", typeDeCompte=" + typeDeCompte + ", montantDepotInitial=" + montantDepotInitial + "]";
}

}