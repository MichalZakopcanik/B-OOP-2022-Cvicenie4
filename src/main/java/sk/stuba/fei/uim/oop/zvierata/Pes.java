package sk.stuba.fei.uim.oop.zvierata;

public class Pes extends Zviera {

    public Pes(String meno) {
        this.meno = meno;
    }

    @Override
    public void zvukZvierata() {
        System.out.println("hau hau");
    }
}