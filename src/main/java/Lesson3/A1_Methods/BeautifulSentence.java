package Lesson3.A1_Methods;

public class BeautifulSentence {

    public String splitCamelCase(String s) {

        String split = s.replaceAll(String.format("%s|%s|%s", "(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])", "(?<=[A-Za-z])(?=[^A-Za-z])")," ");
        int length = split.length();
        String beauty = split.substring(0,1).toUpperCase() + split.substring(1,length).toLowerCase();

        return beauty;

    }





}
/* второй способ - https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html#splitByCharacterTypeCamelCase-java.lang.String-
Нужно - https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.0
 */