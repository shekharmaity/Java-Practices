package StringPrac;

public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer();
        sBuffer.append("shekhar");
        System.out.println(sBuffer);
        sBuffer.append(" maity");
        System.out.println(sBuffer);
        System.out.println(sBuffer.capacity());
        System.out.println(sBuffer.reverse());
        System.out.println(sBuffer.insert(10,"Test"));
        System.out.println(sBuffer.capacity()); //34
        // default capacity is 16
        // increase capacity formula (oldcapcaity * 2)+2 = (16 *2)+2 = 34

    }
}
