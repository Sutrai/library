public class Library {

    private String name;
    private String author;
    private String code;
    private boolean status;
    private String user;

    public Library(String name, String author, String code, boolean status) {
        this.name = name;
        this.author = author;
        this.code = code;
        this.status = status;
        this.user = "None";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setUser(String user) {this.user = user;}
    public String getUser() {return user;}


    @Override
    public String toString() {
        return "name='" + name + '\'' + ", author='" + author + '\'' + ", code='" + code + '\'' +
                ", status=" + status +
                ", user=" + user;
    }
}
