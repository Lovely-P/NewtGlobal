public enum EnumExample {
    COREJAVA(10),COLLECTIONS(20), GENERICS(30), JSP(40) , MULTITHREADING(50);

    private int i;

    EnumExample(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}
