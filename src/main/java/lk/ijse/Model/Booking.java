package lk.ijse.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bid;
    private String customer;


//    @ManyToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
//    @JoinColumn(name = "cid", referencedColumnName = "cid")
//    private Customer customer;
//
//    @ManyToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
//    @JoinColumn(name = "fid", referencedColumnName = "fid")


    private String film;
    @OneToMany(mappedBy = "booking", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Payment> payment = new ArrayList<>();

    private String time;
    private String date;
    private int seat;
    private int half;
    private double total;

    public Booking() {
    }

    public Booking(String customer, String film, List<Payment> payment, String time, String date, int seat, int half, double total) {
        this.customer = customer;
        this.film = film;
        this.payment = payment;
        this.time = time;
        this.date = date;
        this.seat = seat;
        this.half = half;
        this.total = total;
    }

    public Booking(String customer, String film, String time, String date, int seat, int half, double total) {
        this.customer = customer;
        this.film = film;
        this.time = time;
        this.date = date;
        this.seat = seat;
        this.half = half;
        this.total = total;

    }


    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getHalf() {
        return half;
    }

    public void setHalf(int half) {
        this.half = half;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bid=" + bid +
                ", customer='" + customer + '\'' +
                ", film='" + film + '\'' +
                ", payment=" + payment +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                ", seat=" + seat +
                ", half=" + half +
                ", total=" + total +
                '}';
    }
}


