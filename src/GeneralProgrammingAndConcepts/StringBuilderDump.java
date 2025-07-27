package GeneralProgrammingAndConcepts;

public class StringBuilderDump {
    public static void main(String[] args) {

        // This is thread safe
        StringBuffer sb = new StringBuffer();
        sb = new StringBuffer("This is a string buffer");
        System.out.println(sb);

        // This is not thread safe
        StringBuilder stb = new StringBuilder("String Builder");
        stb = new StringBuilder("String Builder");
        System.out.println(stb);

        sb=new StringBuffer("New String");
        stb=new StringBuilder("New String");

        System.out.println(sb.equals(stb));


    }
}
