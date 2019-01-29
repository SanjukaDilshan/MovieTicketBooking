package lk.ijse.DTO;

public class FilmDTO {

    private Integer fid;
    private String name;
    private String language;
    private String startDate;
    private String endDate;
    private double amount;

    public FilmDTO() {
    }

    public FilmDTO(Integer fid, String name, String language, String startDate, String endDate, double amount) {
        this.fid = fid;
        this.name = name;
        this.language = language;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "FilmDTO{" +
                "fid=" + fid +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", amount=" + amount +
                '}';
    }
}
