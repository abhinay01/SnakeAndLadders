package Model;

public class Jumper {
    int startLocation;
    int EndLocation;

    public Jumper() {
        this.startLocation = 0;
        this.EndLocation = 0;
    }

    public int getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(int startLocation) {
        this.startLocation = startLocation;
    }

    public int getEndLocation() {
        return EndLocation;
    }

    public void setEndLocation(int endLocation) {
        EndLocation = endLocation;
    }
}
