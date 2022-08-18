class Inheritance {
    public static void main(String[] args) {
        MoutainBike moutainBike = new MoutainBike(20, 10, 1);
        System.out.println("Gear is : " +  moutainBike.gear);
        System.out.println("Seat height is : " +  moutainBike.seatHeight);
        System.out.println("Bike speed is : " +  moutainBike.speed);

        moutainBike.applyBrake(5);
        System.out.println("Bike speed after applying brake is : " + moutainBike.speed);
    }
}
