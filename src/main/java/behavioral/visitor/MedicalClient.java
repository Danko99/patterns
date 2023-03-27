package behavioral.visitor;

public class MedicalClient extends Client {
    private String medicalCardNumber;

    public MedicalClient(String name, Integer age, String medicalCardNumber) {
        super(name, age);
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(String medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
