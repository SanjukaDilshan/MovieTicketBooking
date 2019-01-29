package lk.ijse.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fid;

    private String name;
    private String language;
    private String startDate;
    private String endDate;
    private double amount;


//    @OneToMany(mappedBy = "film", cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
//    private List<Booking> booking = new ArrayList<>();

    public Film() {
    }

    public Film(String name, String language, String startDate, String endDate, double amount) {
        this.name = name;
        this.language = language;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
    }

//    public Film(String name, String language, String startDate, String endDate, double amount, List<Booking> booking) {
//        this.name = name;
//        this.language = language;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.amount = amount;
//        this.booking = booking;
//    }



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
        return "Film{" +
                "fid=" + fid +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", amount=" + amount +
                '}';
    }
}
