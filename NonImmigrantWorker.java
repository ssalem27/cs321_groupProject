public class NonImmigrantWorker {
    private String firstName;
    private String lastName;
    private String dob;
    private String aNumber;

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setANumber(String aNumber) {
        this.aNumber = aNumber;
    }

    public String getDob() {
        return dob;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getANumber() {
        return aNumber;
    }

}

