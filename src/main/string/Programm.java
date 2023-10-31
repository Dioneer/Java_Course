package main.string;

public class Programm {
    public static void main(String[] args) {
//        Abstr ab = new Abstr(10){};
//        ab.show();
        String x = new String("Java");
        String x2 = "Java";
        System.out.println(x.charAt(1));
        System.out.println(x.codePointAt(1));
        System.out.println(x.compareTo(x2));
        System.out.println(x.compareToIgnoreCase(x2));
        System.out.println(x.substring(1,3));
        System.out.println(String.valueOf(65));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.ensureCapacity(20);
        stringBuilder.append("java").append("asd").append('d').append(1);
        stringBuilder.setLength(15);
        stringBuilder.insert(12,'j');
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());
    }
}
