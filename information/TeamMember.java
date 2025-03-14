package information;

public abstract class TeamMember {
    private String nameOfInstitute;
    private long nationalID;
    private String fullName;
    private String email;
    private String country;
    protected String faculty;

    protected TeamMember(String nameOfInstitute, long nationalID, String fullName, String email, String country, String faculty) {
        setNameOfInstitute(nameOfInstitute);
        setNationalID(nationalID);
        setFullName(fullName);
        setEmail(email);
        setCountry(country);
        this.faculty = faculty;
    }

    protected abstract void showDetails();

    public String getNameOfInstitute() {
        return nameOfInstitute;
    }

    public void setNameOfInstitute(String nameOfInstitute) {
        if (nameOfInstitute == null || nameOfInstitute.isEmpty() || !Character.isUpperCase(nameOfInstitute.charAt(0))) {
            throw new IllegalArgumentException("The Institute name must start with a capital letter and it can't be empty.");
        }
        this.nameOfInstitute = nameOfInstitute;
    }

    public long getNationalID() {
        return nationalID;
    }

    public void setNationalID(long nationalID) {
        if (nationalID < 100000 || nationalID > 999999) {
            throw new IllegalArgumentException("The National ID must have least 6 digits and be positive.");
        }
        this.nationalID = nationalID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty() || !Character.isUpperCase(fullName.charAt(0))) {
            throw new IllegalArgumentException("The Full name must start with a capital letter and it can't be empty.");
        }
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("The Email must have the @ character.");
        }
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || !Character.isUpperCase(country.charAt(0))) {
            throw new IllegalArgumentException("The Country name must start with a capital letter and it can't be empty.");
        }
        this.country = country;
    }
}