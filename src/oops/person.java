package oops;

public class person {
    String n;
    int age;
    public  person(String n,int age){
        this.n=n;
        this.age = age;
    }
    // Overriding the toString() method for a custom representation
    @Override
    public String toString() {
        return "Person's name is: " + n+", Age is: " + age;
    }
    public static void main(String[] args){
        person p1 = new person("Alice",45);
        person p2 = new person("Bob",56);

        System.out.println(p1.toString()); // This will call the overridden toString() method
        System.out.println(p2.hashCode()); // This will call the overridden toString() method
        Book b1 = new Book("Java");
        Book b2 = new Book("Java");

        System.out.println(b1.equals(b2));
    }

}

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    public boolean equals(Object object) {
        Book b = (Book) object;
        return this.title.equals(b.title);
    }
}
