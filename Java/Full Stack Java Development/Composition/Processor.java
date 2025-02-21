public class Processor {
    private String brand;
    private int generation;
    private int cores;
    private String cacheMemory;
    private String frequency;

    public Processor() {
        this.brand = "Intel";
        this.generation = 11;
        this.cores = 4;
        this.cacheMemory = "5 MB";
        this.frequency = "2.5GHZ";
    }

    public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory, String frequency, String minFrequency, String maxfrequency) {
        this.brand = brand;
        this.generation = generation;
        this.cores = cores;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{" + "brand='" + brand + '\'' + ", generation=" + generation + ", cores=" + cores + ", cacheMemory='" + cacheMemory + '\'' +
                ", frequency='" + frequency + '\'' + '}';
    }
}
