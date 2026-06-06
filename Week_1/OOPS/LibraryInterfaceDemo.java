interface LibraryUser{
    public void registerAccount();
    public void requestBook();
}

class KidUser implements LibraryUser{
    int age;
    String bookType;

    public KidUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if(age < 12){
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if(bookType.equals("Kids")){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

class AdultUser implements LibraryUser{
    int age;
    String bookType;

    public AdultUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if(age > 12){
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if(bookType.equals("Fiction")){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult fiction books");
        }
    }
}
public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kid = new KidUser(10, "Kids");
        kid.registerAccount();
        kid.requestBook();

        AdultUser adult = new AdultUser(18, "Fiction");
        adult.registerAccount();
        adult.requestBook();
    }
}