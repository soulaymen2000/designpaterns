public abstract class decorateurBoisson implements boisson {
    protected boisson boisson;

    public decorateurBoisson(boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String getDiscription() {
        return boisson.getDiscription();
    }

    @Override
    public double getPrix() {
        return boisson.getPrix();
    }
}
