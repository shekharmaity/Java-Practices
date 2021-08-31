package ImmutableDemo;

public final class ImmutableDemo {
    private final String name;
    private final int rollNo;

    public ImmutableDemo(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}
