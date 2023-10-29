package ClassWorks;

public class BeautifyStrings {

    public static String addFullStop(String string) {
        int indexOfLastElement = string.length()-1;
        char lastCharacter = string.charAt(indexOfLastElement);
        boolean stringDoesNotContainFullStop = !(lastCharacter+" ").equals(" ");
        if (stringDoesNotContainFullStop)
            return string+".";
        else return string;
    }

    public static String capitalizeFirstLetter(String word) {
        String output ="";
        for(int i = 0; i < word.length(); i++){
            if(i != 0){
                output = output + (word.charAt(i) + "").toUpperCase();

            }
            else output += word.charAt(i);
        }

        return output;
        //This is another way
        //return ((word.charAt(0)+"").toUpperCase())+ word.substring(1);

    }


    public static String stringsAreBeautified(String sentence) {
        return addFullStop(capitalizeFirstLetter(sentence));
    }
}
