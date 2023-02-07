import java.time.LocalDate;

public class Performance extends Employees {

    private int rating; //valutazioni
    private String review; //commenti
    private int productivityLevel;
    private int skillLevel;
    private int promotions;

    public Performance(String name, String surName, int ID, String codiceFiscale, String typeOfWork, String typeOfContract, LocalDate dateOfBirth, int rating, String review, int productivityLevel, int skillLevel, int promotions) {
        super(name, surName, ID, codiceFiscale, typeOfWork, typeOfContract, dateOfBirth);
        this.rating = rating;
        this.review = review;
        this.productivityLevel = productivityLevel;
        this.skillLevel = skillLevel;
        this.promotions = promotions;
    }


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void calculatePromotion(){}
    public void generateEvaluation(){}
    public void addComment(String comment) {}
    public void updatePerformance(){};
    public void getPerformance(){};
}

