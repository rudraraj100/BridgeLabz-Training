package com.day4.eventease;
class BirthdayEvent extends Event {

    public BirthdayEvent(int eventId, String name, String location, String date,
                         int attendees, User organizer,
                         double venueCost, double serviceCost, double discount) {

        super(eventId, name, location, date, attendees,
              organizer, venueCost, serviceCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("🎉 Birthday event scheduled with decorations & cake!");
    }

    @Override
    public void reschedule(String newDate) {
        date = newDate;
        System.out.println("🎂 Birthday event rescheduled to " + date);
    }

    @Override
    public void cancel() {
        System.out.println("❌ Birthday event cancelled");
    }
}
