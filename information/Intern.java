package information;

import java.util.HashMap;

public class Intern extends TeamMember {
    private String requestedField;
    private int internID;
    public static HashMap<Long, String> countryOfEachMember = new HashMap<>();

    public Intern(String nameOfInstitute, long nationalID, String fullName, String email, String country, String faculty, String requestedField, int internID) {
        super(nameOfInstitute, nationalID, fullName, email, country, faculty);
        setRequestedField(requestedField);
        setInternID(internID);
        countryOfEachMember.put(nationalID, country);
    }

    public String getRequestedField() {
        return requestedField;
    }

    public void setRequestedField(String requestedField) {
        if (requestedField == null || requestedField.isEmpty()) {
            throw new IllegalArgumentException("The Requested field can't be empty.");
        }
        this.requestedField = requestedField;
    }

    public int getInternID() {
        return internID;
    }

    public void setInternID(int internID) {
        if (internID < 0) {
            throw new IllegalArgumentException("The Intern ID can't be negative.");
        }
        this.internID = internID;
    }

    public void updateCountry(long nationalID, String newCountry) {
        if (countryOfEachMember.containsKey(nationalID)) {
            setCountry(newCountry);
            countryOfEachMember.put(nationalID, newCountry);
        } else {
            throw new IllegalArgumentException("The National ID doesn't exist.");
        }
    }

    @Override
    public void showDetails() {
        System.out.println("Member type: Intern");
        System.out.println("Name of institute: " + getNameOfInstitute());
        System.out.println("Full name: " + getFullName());
        System.out.println("National ID: " + getNationalID());
        System.out.println("Email: " + getEmail());
        System.out.println("Faculty: " + faculty);
        System.out.println("Requested field: " + requestedField);
        System.out.println("Intern ID: " + internID);
        System.out.println("---------------------");
    }
}