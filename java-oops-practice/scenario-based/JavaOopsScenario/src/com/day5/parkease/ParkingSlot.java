package com.day5.parkease;


class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    // Internal booking record
    private String bookingLog;

    ParkingSlot(int slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public boolean assignSlot(Vehicle vehicle) {
        if (!isOccupied &&
            vehicle.getClass().getSimpleName().equals(vehicleTypeAllowed)) {

            isOccupied = true;
            bookingLog = "Slot " + slotId + " booked for " +
                         vehicle.getClass().getSimpleName();
            return true;
        }
        return false;
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLog = "Slot " + slotId + " released";
    }

    // Log exposure only (controlled)
    public void showBookingLog() {
        System.out.println(bookingLog);
    }
}
