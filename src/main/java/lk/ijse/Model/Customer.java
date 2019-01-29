package lk.ijse.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;
    private String name;
    private String nic;
    private String address;
    private int tp;

//    @OneToMany(mappedBy = "customer", cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
//    private List<Booking> booking = new ArrayList<>();

    public Customer() {
    }

//    public Customer(String name, String nic, String address, int tp, List<Booking> booking) {
//        this.name = name;
//        this.nic = nic;
//        this.address = address;
//        this.tp = tp;
//        this.booking = booking;
//    }

    public Customer(String name, String nic, String address, int tp) {
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.tp = tp;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

//    public List<Booking> getBooking() {
//        return booking;
//    }
//
//    public void setBooking(List<Booking> booking) {
//        this.booking = booking;
//    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", address='" + address + '\'' +
                ", tp=" + tp +
                '}';
    }
}
