public class chocolat extends decorateurBoisson{
    public chocolat(boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDiscription() {
        return super.getDiscription()+" avec chocolat";
    }

    @Override
    public double getPrix() {
        return super.getPrix()+1;
    }
}
