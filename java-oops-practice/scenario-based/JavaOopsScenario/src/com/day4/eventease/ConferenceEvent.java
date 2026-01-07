package com.day4.eventease;
class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String name, String location, String date,
                            int attendees, User organizer,
                            double venueCost) {

        super(eventId, name, location, date, attendees,
              organizer, venueCost);
    }

    @Override
    public void schedule() {
        System.out.println("📊 Conference scheduled with speaker arrangements");
    }

    @Override
    public void reschedule(String newDate) {
        date = newDate;
        System.out.println("🏢 Conference rescheduled to " + date);
    }

    @Override
    public void cancel() {
        System.out.println("❌ Conference cancelled");
    }
}
