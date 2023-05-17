package edu.kis.vh.nursery;

/**
 * Klassa HanoiRhymer śledzi ilość odrzuconych elementów.
 * Rozszerza klasę defaultCountingOutRhymer.
 */
public class HanoiRhymer extends defaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * @return Metoda reportRejected zwraca ilość odrzuconych elementów.
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * @param in Metoda countIn inkrementuje wartość odrzuconych elementów, jeżeli rhymer nie jest pusty
     *           i wartośc liczby jest większa od ostatnio dodanego elementu.
     *           W przeciwnym wypadku element zostaje dodany do rhymera używając metody klasy nadrzędnej countIn.
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
