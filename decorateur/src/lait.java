public class lait extends decorateurBoisson{
    public lait(boisson boisson) {
        super(boisson);
    }
    public String getDiscription() {
        return super.getDiscription()+" avec lait";
    }

    @Override
    public double getPrix() {
        return super.getPrix()+0.5;
    }
}
