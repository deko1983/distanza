import exception.AritmeticaException;

public class Distanza implements Aritmetica<Distanza>  {

    private boolean scalare;

    public Distanza(int m, int cm)  {
        // ??
        // ??
        normalizzaCm();  // gestisci qui i cm che sono maggiori di 99 
    }

    // server per creare una Distanza "scalare" da utilizzare per moltiplicazione e divisione
    public Distanza(int m)  {
        //this.metri = m;
        this.scalare = true;
    }

    // se i cm sfora 99 allora devo riconvertirli in metri e il resto rimane in cm
    private void normalizzaCm()  {

    }

    public boolean isScalare() {
        return scalare;
    }

    // posso solo moltiplicare una Distanza per una Distanza scalare, solleva l'eccezione quando
    // necessario
    @Override
    public Distanza multiply(Distanza f) throws AritmeticaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiply'");
    }

    // posso solo dividere una Distanza per una Distanza scalare, solleva l'eccezione quando
    // necessario
    @Override
    public Distanza subtract(Distanza f) throws AritmeticaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subtract'");
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
