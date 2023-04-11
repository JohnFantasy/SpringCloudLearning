package deepintojava.javaFoundation.dataType;

public class DataTypeTest {

    public static void main(String[] args) {


        String string = "apple,banana,orange";
        // Split the string by comma
        String[] splitString = string.split(",");
        // Use a loop to replace spaces with '\ ' and add single quotes around each substring
        for (int i = 0; i < splitString.length; i++) {
            if (splitString[i].contains(" ")) {
                splitString[i] = "'" + splitString[i].replace(" ", "\\ ") + "'";
            } else {
                splitString[i] = "'" + splitString[i] + "'";
            }
        }
        // Join the substrings with comma
        String newString = String.join(",", splitString);
        System.out.println(newString);

    }
}
