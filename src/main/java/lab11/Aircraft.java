package src.main.java.lab11;

public class Aircraft {
    private AircraftState state;
    private int altitude;
    private long cruisingTime;

    public Aircraft() {
        this.state = AircraftState.ON_STAND;
        this.altitude = 0;
        this.cruisingTime = 0;
    }

    public AircraftState getState() {
        return state;
    }

    public void setState(AircraftState state) {
        this.state = state;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public long getCruisingTime() {
        return cruisingTime;
    }

    public void setCruisingTime(long cruisingTime) {
        this.cruisingTime = cruisingTime;
    }

    public void handleTakeOff() throws InterruptedException {
        if (state != AircraftState.ON_STAND) {
            System.out.println("Aircraft is not on stand.");
            return;
        }

        // R1 - Taxing for 10 seconds
        setState(AircraftState.TAXING);
        System.out.println("Aircraft is taxing...");
        Thread.sleep(10000); // 10 seconds
        System.out.println("Aircraft completed taxing.");

        // R2 - Taking off for 5 seconds
        setState(AircraftState.TAKING_OFF);
        System.out.println("Aircraft is taking off...");
        Thread.sleep(5000); // 5 seconds
        System.out.println("Aircraft completed takeoff.");

        // R3 - Ascend to cruising altitude
        setState(AircraftState.ASCENDING);
        System.out.println("Aircraft is ascending...");
    }

    public void ascendToAltitude(int targetAltitude) throws InterruptedException {
        if (state != AircraftState.ASCENDING) {
            System.out.println("Aircraft must be ascending to reach cruising altitude.");
            return;
        }

        // R4 - Ascending to target altitude in increments of 1,000 meters
        for (int i = 1; i <= targetAltitude; i++) {
            Thread.sleep(10000); // 10 seconds per 1,000 meters
            setAltitude(i * 1000);
            System.out.println("Aircraft reached " + getAltitude() + " meters altitude.");
        }

        // Now aircraft is at cruising altitude
        setState(AircraftState.CRUISING);
        System.out.println("Aircraft is now cruising at " + getAltitude() + " meters.");

        // Start tracking cruising time
        long startTime = System.currentTimeMillis();

        // Simulating cruising time (waiting for user to land the aircraft)
        while (state == AircraftState.CRUISING) {
            Thread.sleep(1000); // Simulate each second in cruising state
            cruisingTime++;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total time spent in cruising: " + cruisingTime + " seconds.");
    }

    public void handleLanding() throws InterruptedException {
        if (state != AircraftState.CRUISING) {
            System.out.println("Aircraft must be at cruising altitude to land.");
            return;
        }

        // R5 - Start descending
        setState(AircraftState.DESCENDING);
        System.out.println("Aircraft is descending...");

        // R6 - Descend in increments of 1,000 meters
        while (getAltitude() > 0) {
            Thread.sleep(10000); // 10 seconds per 1,000 meters
            setAltitude(getAltitude() - 1000);
            System.out.println("Aircraft descended to " + getAltitude() + " meters.");
        }

        // R7 - Aircraft has landed
        setState(AircraftState.LANDED);
        System.out.println("Aircraft has landed.");
    }
}
