public class ContrattoNazionaleDB {
    public Contracts typeOfContract;
    double durationTime;
    double wage;
    boolean trialPeriod;
    boolean internshipAlreadyDone;
    int levelOfContract; //da vedere

    public ContrattoNazionaleDB(double durationTime, double wage, boolean trialPeriod, boolean internshipAlreadyDone, int levelOfContract) {
        this.durationTime = durationTime;
        this.wage = wage;
        this.trialPeriod = trialPeriod;
        this.internshipAlreadyDone = internshipAlreadyDone;
        this.levelOfContract = levelOfContract;
    }
}
