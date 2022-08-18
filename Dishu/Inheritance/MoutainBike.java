public class MoutainBike extends Bicycle {
    public int seatHeight;

    public MoutainBike(int startHeight, int startSpeed, int startGear) {
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }

    public void seatHeight(int newValue) {
        seatHeight = newValue;
    }

   
}
