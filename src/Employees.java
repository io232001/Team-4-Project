import java.time.LocalDate;

public class Employees {

    private final String name;
    private final String surName;
    private int ID;
    private final String CodiceFiscale;
    private String typeOfWork;
    private String typeOfContract;
    private final LocalDate dateOfBirth;

    public Employees(String name,
                     String surName,
                     int ID,
                     String codiceFiscale,
                     String typeOfWork,
                     String typeOfContract, LocalDate dateOfBirth) {
        this.name = name;
        this.surName = surName;
        this.ID = ID;
        CodiceFiscale = codiceFiscale;
        this.typeOfWork = typeOfWork;
        this.typeOfContract = typeOfContract;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCodiceFiscale() {
        return CodiceFiscale;
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }

    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    public String getTypeOfContract() {
        return typeOfContract;
    }

    public void setTypeOfContract(String typeOfContract) {
        this.typeOfContract = typeOfContract;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
