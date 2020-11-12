package ebookonline;

public class Customers {
    private int idCus;
    private String nameCus;
    private String address;
    private String email;
    private int phone;
    private int level;
    private String created;
    private String updated;

    public Customers(){
        idCus = 0;
        nameCus = "";
        address = "";
        email = "";
        phone = 0;
        level = 0;
        created = "";
        updated = "";
    }

    public Customers(int id, String name, String address, String email, int phone, int level, String created, String updated){
        this.idCus = id;
        this.nameCus = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.level = level;
        this.created = created;
        this.updated = updated;
    }

    public Customers(int id, String name, String address, String email, int phone, int level){
        this.idCus = id;
        this.nameCus = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.level = level;
    }

    public String getUpdated() {
        return updated;
    }

    public String getCreated() {
        return created;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getIdCus() {
        return idCus;
    }

    public int getLevel() {
        return level;
    }

    public int getPhone() {
        return phone;
    }

    public String getNameCus() {
        return nameCus;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdCus(int idCus) {
        this.idCus = idCus;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setNameCus(String nameCus) {
        this.nameCus = nameCus;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return String.format("%-40d%-40s%-30s%-40s%-30d%-30d\n",idCus,nameCus,address,email,phone,level);
    }
}
