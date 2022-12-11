public class Samsung extends Phone {
    private int price;
    private String processor;

    public Samsung(int price, String processor) {
        this.price = price;
        this.processor = processor;
    }

    @Override
    public void print() {
        System.out.println("Samsung's price: " + price +
                "\nSamsung's processor: " + processor);
    }
}
