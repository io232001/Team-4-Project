import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDB{
    List<Employees> employees = new ArrayList<>();
    public EmployeesDB(String name, String surName, int ID, String codiceFiscale, String typeOfWork, String typeOfContract, LocalDate dateOfBirth, List<Employees> employees) {
        this.employees = employees;
    }
}
