package lk.ijse.DTO;

public class BookingDTO {

    private Integer bid;
    private String customer;
    private String film;
    private String time;
    private String date;
    private int seat;
    private int half;
    private double total;

    public BookingDTO() {
    }

    public BookingDTO(Integer bid, String customer, String film, String time, String date, int seat, int half, double total) {
        this.bid = bid;
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
        return "BookingDTO{" +
                "bid=" + bid +
                ", customer='" + customer + '\'' +
                ", film='" + film + '\'' +
                ", time='" + time + '\'' +
                ", date='" + date + '\'' +
                ", seat=" + seat +
                ", half=" + half +
                ", total=" + total +
                '}';
    }
}
