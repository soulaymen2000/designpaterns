public class gestionCommandeFacade {
    private paiment paiment;
    private inventaire inventaire;
    private expedition expedition;

    public gestionCommandeFacade() {
        paiment = new paiment();
        inventaire = new inventaire();
        expedition = new expedition();
    }
    public void passerCommande(String produit, double montant){
        inventaire.verifierDisponibilite(produit);
        paiment.affecterPaiment(montant);
        expedition.expedieCommande(produit);
    }
}
