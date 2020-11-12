package ebookonline;

public class Users {
    private int id;
    private String userName;
    private String password;
    private int role;
    private String created;
    private String updated;

    public Users(){
        id = 0;
        userName = "";
        password = "";
        role = 0;
        created = "";
        updated = "";
    }
    public Users(int id, String userName, String password, int role,String created,String updated){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.created = created;
        this.updated = updated;
    }
    public Users(String userName, String password, int role){
        this.userName = userName;
        this.password = password;
        this.role = role;
        created = "";
        updated = "";

    }

    public void setUser(int id, String userName, String password, int role,String created,String updated){
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.created = created;
        this.updated = updated;
    }

    public int getId() {
        return id;
    }

    public int getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreated() {
        return created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}
