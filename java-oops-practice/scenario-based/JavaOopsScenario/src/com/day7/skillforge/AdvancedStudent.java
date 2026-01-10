package com.day7.skillforge;
class AdvancedStudent extends Student {

    AdvancedStudent(String name, String email) {
        super(name, email);
    }

    @Override
    public void generateCertificate() {
        if (getProgress() == 100) {
            System.out.println("Advanced Course Certificate awarded to " + name);
        } else {
            System.out.println("Advanced course not completed.");
        }
    }
}
