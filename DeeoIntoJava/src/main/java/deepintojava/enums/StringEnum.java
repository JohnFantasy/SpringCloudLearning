package deepintojava.enums;

public enum StringEnum {
    NAME,
    SEX,
    AGE;

    StringEnum() {

    }

    public static void main(String[] args) {
        String s = StringEnum.AGE.toString();
        System.out.println(s);
        if (1 < 2) {
            String s1 = (String) s;
        }
    }
}
