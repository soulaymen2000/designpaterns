public class adapterVoitureAncienne implements vehicule{
    private voitureAncienne voitureAncienne;

    public adapterVoitureAncienne(voitureAncienne voitureAncienne){
        this.voitureAncienne = voitureAncienne;
    }

    @Override
    public void conduire() {
        voitureAncienne.demmarer();
        System.out.println("voiture ancienne conduire");
    }
}
