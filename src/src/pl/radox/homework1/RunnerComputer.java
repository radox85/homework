package pl.radox.homework1;

public class RunnerComputer {
    public static void main(String[] args) {
        Computer[] computers = {
                new Computer(40,64,256),
                new Computer(800,256,256),
                new Computer(100,64,64),
                new Computer(16,32,3),
                new Computer(3000,2048,800)
        };

        for (Computer c : computers){
            System.out.println(c.toString());
        }
        System.out.println("\nSorted by cpu:");
        Computer.sort(computers);
        for (Computer c : computers){
            System.out.println(c.toString());
        }
    }

}
