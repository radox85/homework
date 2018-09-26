package pl.radox.homework1;

public class Computer {
    private int cpu;
    private int ram;
    private int diskCapacity;

    public Computer(int cpu, int ram, int diskCapacity) {
        this.cpu = cpu;
        this.ram = ram;
        this.diskCapacity = diskCapacity;
    }

    @Override
    public String toString() {
        return "Computer: " +
                "cpu=" + cpu +
                ", ram=" + ram +
                ", diskCapacity=" + diskCapacity;
    }

    static void sort(Computer[] tab){
        int i = 1;
        while (i < tab.length){
            int j = i;
            while (j > 0 && tab[j].cpu < tab[j-1].cpu){
                Computer temp = tab[j-1];
                tab[j-1] = tab[j];
                tab[j]=temp;
                j--;
            }
            i++;
        }
    }
}
