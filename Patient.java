public class Patient {
    private String firstName, middleName, lastName;
    private String streetAddress, city, state, zipCode;
    private String phoneNumber, emergencyContactName, emergencyContactPhone;

    // No-arg constructor
    public Patient() {}

    // Constructor for name fields only
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Constructor for all fields
    public Patient(String firstName, String middleName, String lastName, String streetAddress,
                   String city, String state, String zipCode, String phoneNumber,
                   String emergencyContactName, String emergencyContactPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Accessor and mutator methods for each field
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    // Repeat accessors and mutators for other attributes...

    // Method to build full name
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    // Method to build full address
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    // Method to build emergency contact
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    // toString method
    public String toString() {
        return String.format("Name: %s\nAddress: %s\nEmergencyContact: %s", 
                buildFullName(), buildAddress(), buildEmergencyContact());
    }
}
