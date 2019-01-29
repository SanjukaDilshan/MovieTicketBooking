package lk.ijse.DTO;

public class CustomerDTO {

    private Integer cid;
    private String name;
    private String nic;
    private String address;
    private int tp;

    public CustomerDTO() {
    }

    public CustomerDTO(Integer cid, String name, String nic, String address, int tp) {
        this.cid = cid;
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

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", address='" + address + '\'' +
                ", tp=" + tp +
                '}';
    }
}
