package classes;

import java.util.ArrayList;
import java.util.List;

public class Session {
    public int sessionID;
    List<Speler> spelersList = new ArrayList<Speler>();
    List<Vragen> vragenList = new ArrayList<Vragen>();
    public boolean active;
}
