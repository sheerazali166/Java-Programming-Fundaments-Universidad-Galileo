package Classes_Objects_And_Methods.Screencast_Of_Classes_Objects_And_Methods;

import java.util.Date;

public class Human {

    char gender; // 'F' or 'M'
    String firstName;
    String lastName;
    Human humanPartner;
    int identificationNumber;
    int yearBirth;
    int monthBirth;
    int dayBirth;

    public Human(String _firstName, String _lastName, char _gender) {

        this.firstName = _firstName;
        this.lastName = _lastName;
        this.gender = _gender;

    }

    public void speak(String words) {

        System.out.println(words);

    }

    public void addPartner(Human _humanPartner) {

        this.humanPartner = _humanPartner;
        _humanPartner.humanPartner = this;

    }

    public Human getPartner() {

        return this.humanPartner;
    }

    public void setId(int id) {
        this.identificationNumber = id;
    }

    public int getId() {

        return this.identificationNumber;
    }

    public void setBirthDate(int _yearBirth, int _monthBirth, int _dayBirth) {

        this.monthBirth = _monthBirth;
        this.dayBirth = _dayBirth;
        this.yearBirth = _yearBirth;
    }

    public int getAge() {

        Date dateToday = new Date();

        // the current year represented by this date, minus 1900
        int currentYear = dateToday.getYear() + 1900;
        int age = currentYear - yearBirth;

        // 0 is January, so add 1
        int currentMonth = dateToday.getMonth() + 1;

        if (currentMonth < monthBirth) {
            age = age - 1;

        } else if (currentMonth == monthBirth) {

            // day of the Month
            int currentDay = dateToday.getDate();

            if (dayBirth > currentDay) {
                age = age - 1;
            }
        }

        return age;
    }

    public String getPartnerName() {
        return this.humanPartner.getFullName();
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
