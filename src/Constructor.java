public class Constructor {

    private String name;
    private String age;
    private String email;
    private String idNumber;

    public Constructor(String name, String age, String idNumber, String email) {
        this.name = name;
        this.age =  age;
        this.email = email;
        this.idNumber = idNumber;

    }

    public static void main(String[] args) {
        Constructor First = new Constructor("Matthew Tartaglia", "32", "001", "mattbrs51@gmail.com");
        System.out.println(First.email);
    }




}


