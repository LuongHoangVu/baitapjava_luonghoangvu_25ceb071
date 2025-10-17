public class TestAuthor {
    public static void main(String[] args) {
        // Tạo đối tượng Author
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');

        // Kiểm tra phương thức toString()
        System.out.println(ahTeck);

        // Kiểm tra phương thức setter
        ahTeck.setEmail("PaulTan@nowhere.com");

        // Kiểm tra phương thức getter
        System.out.println("Tên là: " + ahTeck.getName());
        System.out.println("Giới tính là: " + ahTeck.getGender());
        System.out.println("Email mới là: " + ahTeck.getEmail());
    }
}