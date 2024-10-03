public class Procedure {
    private String procedureName, procedureDate, practitioner;
    private double charge;

    // No-arg constructor
    public Procedure() {}

    // Constructor for name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    // Constructor for all fields
    public Procedure(String procedureName, String procedureDate, String practitioner, double charge) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitioner = practitioner;
        this.charge = charge;
    }

    // Accessor and mutator methods for each field
    public String getProcedureName() { return procedureName; }
    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }
    
    // Repeat accessors and mutators for other attributes...

    // Get charge for calculation
    public double getCharge() {
        return charge;
    }

    // toString method
    public String toString() {
        return String.format(
            "\tProcedure: %s\n\tProcedureDate=%s\n\tPractitioner=%s\n\tCharge=%.2f", 
            procedureName, procedureDate, practitioner, charge);
    }
}