
package app;

import java.util.ArrayList;
import java.util.List;
import impl.Chat;
import impl.Chien;
import inter.Animaux;

public class Application {

    public static void main(String[] args) {
        List<Animaux> animaux = new ArrayList<Animaux>();
        animaux.add(new Chien("bill"));
        animaux.add(new Chien("toutou"));
        animaux.add(new Chat());
        animaux.add(new Chat());
        animaux.add(new Chien("milou"));
        animaux.stream().forEach(a -> a.crier());

    }
}
