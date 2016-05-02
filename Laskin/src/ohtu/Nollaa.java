package ohtu;

import javax.swing.JTextField;

public class Nollaa implements Komento {

    private Sovelluslogiikka sovelluslogiikka;
    private JTextField syotekentta;
    private JTextField tuloskentta;
    private int edellinen;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovelluslogiikka = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.edellinen = 0;
    }
    
    @Override
    public void suorita() {
        edellinen = sovelluslogiikka.tulos();
        sovelluslogiikka.nollaa();        
    }
    
    @Override
    public void peru() {
        sovelluslogiikka.setTulos(edellinen);
    }
}
