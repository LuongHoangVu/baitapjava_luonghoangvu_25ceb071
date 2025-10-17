public class Author {
    // Thuộc tính (biến thành viên)
    private String name;
    private String email;
    private char gender; // 'm' cho nam, 'f' cho nữ

    // Hàm tạo
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getter cho name
    public String getName() {
        return name;
    }

    // Getter cho email
    public String getEmail() {
        return email;
    }

    // Setter cho email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter cho gender
    public char getGender() {
        return gender;
    }

    // Phương thức toString()
    @Override
    public String toString() {
        return "Tác giả[tên" + name + ", email="  + email + ", giới tính=" + gender + "]";
    }

}
