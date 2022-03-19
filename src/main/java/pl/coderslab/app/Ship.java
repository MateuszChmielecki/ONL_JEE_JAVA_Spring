package pl.coderslab.app;

public class Ship {
    private Captain captain;

    public Ship(Captain captain) {
        this.captain = captain;
    }

    public Captain getCaptain() {
        return captain;
    }
}
