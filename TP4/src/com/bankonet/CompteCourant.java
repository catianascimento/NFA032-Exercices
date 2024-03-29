package com.bankonet;

public class CompteCourant {

	private String numero;
	private String intitule;
	private double solde;
	private double montantDecouvertAutorise;
//	static private int nbComptesCourants = 0;

	public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
		new CompteCourant();
		this.numero = numero;
		this.intitule = intitule;
		this.solde = solde < 0.0 ? 0.0 : solde;
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}

	public CompteCourant() {
//		nbComptesCourants++;
	}

	public void crediter(double valeur) {
		this.solde = this.solde + valeur;
		System.out.println("Montant credite: " + valeur);
	}

	public void debiter(double valeur) {
		this.solde = this.solde - valeur;
		System.out.println("Montant debite: " + valeur);
	}

	@Override
	public String toString() {
		return "CompteCourant [numero=" + numero + ", intitule=" + intitule + ", solde=" + solde
				+ ", montantDecouvertAutorise=" + montantDecouvertAutorise + "]";
	}

	public void imprimer() {
		System.out.println("========================= Num�ro de compte:" + this.numero + "=========================");
		System.out.println("Nom compte: " + this.intitule);
		System.out.println("Type compte: " + "Compte Courant");
		System.out.println("Autorisation de decouvert: " + this.montantDecouvertAutorise);
		System.out.println("Solde votre compte: " + this.solde);
		System.out.println("========================================================================\n");
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Double getSolde() {
		return solde;
	}

	public Double getMontantDecouvertAutorise() {
		return montantDecouvertAutorise;
	}

	public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}

//	public static int getNbComptesCourants() {
//		return nbComptesCourants;
//	}

}

