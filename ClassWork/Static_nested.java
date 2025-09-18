//create a static nested class that prints a message
class Static_nested {
    static class Nested {
        void display() {
            System.out.println("Hello Java");
        }
    }

    public static void main(String[] args) {
        Static_nested.Nested nestedObject = new Static_nested.Nested();
        nestedObject.display();
    }
}