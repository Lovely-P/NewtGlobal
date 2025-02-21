public class Laptop {
    private float screen;
    private Processor processor;
    private String opticalDrive;
    private String keyboard;


    public Laptop() {
        this.screen = 15.6f;
        this.processor = new Processor();
        this.opticalDrive = "Multi Layer";
        this.keyboard = "Backlit";
    }

    public Laptop(float screen, Processor processor, String opticalDrive, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" + "screen=" + screen + ", processor=" + processor + ", opticalDrive='" + opticalDrive + '\'' + ", keyboard='" + keyboard + '\'' + '}';
    }
}
