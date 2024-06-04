public class Library {

    private String name;
    private String author;
    private String code;
    private boolean status;

    public Library(String name, String author, String code, boolean status) {
        this.name = name;
        this.author = author;
        this.code = code;
        this.status = status;
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

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", code='" + code + '\'' +
                ", status=" + status +
                '}';
    }
}
