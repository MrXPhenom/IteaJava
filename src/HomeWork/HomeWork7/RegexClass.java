package HomeWork.HomeWork7;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
    void phoneNumberOfUkraineValidation(){
        ArrayList<String> phoneNumberList = new ArrayList<>();

        phoneNumberList.add("+380123456789");
        phoneNumberList.add("+992321584684");
        phoneNumberList.add("+38012345678");
        phoneNumberList.add("+123123456789");
        phoneNumberList.add("+3809876543241");

        String regex = "^\\+380\\d{9}$";

        Pattern pattern = Pattern.compile(regex);

        for (String numbersList: phoneNumberList) {
            Matcher matcher = pattern.matcher(numbersList);
            System.out.println(numbersList + " : " + matcher.matches());
        }
    }

    public static void main(String[] args) {
        RegexClass regexClass = new RegexClass();
        regexClass.phoneNumberOfUkraineValidation();
    }
}
