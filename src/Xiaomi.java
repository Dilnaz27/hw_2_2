public class Xiaomi extends Phone{
   private String model;
   private int memory;

    public Xiaomi(String model, int memory) {
        this.model = model;
        this.memory = memory;
    }

    @Override
    public void print() {
        System.out.println("Xiaomi's model: " + model +
                "\nXiaomi's memory: " + memory);
    }

}
