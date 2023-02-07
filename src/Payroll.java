import java.time.LocalDate;

public class Payroll extends Employees {

    private boolean presenza; //presence
    private int oreAssenze; //absentHours
    private int oreContratto; //contractHours
    private int oreEffettuate; //hoursWorked
    private double trattenuteStato;
    private double retribuzioneLorda;
    private double retribuzioneNetta;

    public Payroll(String name, String surName, int ID, String codiceFiscale, String typeOfWork, String typeOfContract, LocalDate dateOfBirth, boolean presenza, int oreAssenze, int oreContratto, int oreEffettuate, double trattenuteStato, double retribuzioneLorda, double retribuzioneNetta) {
        super(name, surName, ID, codiceFiscale, typeOfWork, typeOfContract, dateOfBirth);
        this.presenza = presenza;
        this.oreAssenze = oreAssenze;
        this.oreContratto = oreContratto;
        this.oreEffettuate = oreEffettuate;
        this.trattenuteStato = trattenuteStato;
        this.retribuzioneLorda = retribuzioneLorda;
        this.retribuzioneNetta = retribuzioneNetta;
    }

    public boolean isPresenza() {
        return presenza;
    }

    public int getOreAssenze() {
        return oreAssenze;
    }

    public int getOreContratto() {
        return oreContratto;
    }

    public int getOreEffettuate() {
        return oreEffettuate;
    }

    public double getTrattenuteStato() {
        return trattenuteStato;
    }

    public void setTrattenuteStato(double trattenuteStato) {
        this.trattenuteStato = trattenuteStato;
        this.retribuzioneNetta = this.retribuzioneLorda - trattenuteStato;
    }

    public double getRetribuzioneLorda() {
        return retribuzioneLorda;
    }

    public void setRetribuzioneLorda(double retribuzioneLorda) {
        this.retribuzioneLorda = retribuzioneLorda;
        this.retribuzioneNetta = retribuzioneLorda - this.trattenuteStato;
    }

    public double getRetribuzioneNetta() {
        return retribuzioneNetta;
    }

    public void setRetribuzioneNetta(double retribuzioneNetta) {
        this.retribuzioneNetta = retribuzioneNetta;
    }

    public void setPresenza(boolean presenza) {
        this.presenza = presenza;
    }

    // Metodo per inserire le ore di assenza
    public void setOreAssenze(int oreAssenze) {
        this.oreAssenze = oreAssenze;
    }

    // Metodo per inserire le ore di contratto
    public void setOreContratto(int oreContratto) {
        this.oreContratto = oreContratto;
    }

    // Metodo per inserire le ore effettuate
    public void setOreEffettuate(int oreEffettuate) {
        this.oreEffettuate = oreEffettuate;
    }
}
