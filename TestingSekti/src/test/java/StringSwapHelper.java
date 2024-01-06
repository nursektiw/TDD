public class StringSwapHelper {
    public String swaplasttwochars(String str){

        int length = str.length();
//        String strExceptLastTwo = str.substring(0, length-2);
//
//        char lastChar = str.charAt(length-1);
//        char SecondLastChar = str.charAt(length-2);
        if(length<2){
            return str;
        }
        return str.substring(0, length-2)+str.charAt(length-1)+str.charAt(length-2);
    }
}
