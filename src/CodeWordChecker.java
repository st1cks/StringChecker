public class CodeWordChecker implements StringChecker {
    private int min;
    private int max;
    private String str;


    public CodeWordChecker(int min, int max, String str){
        this.min = min;
        this.max = max;
        this.str = str;
    }
    public CodeWordChecker(String str){
        this.min = 6;
        this.max = 20;
        this.str = str;
    }

    public boolean isValid(String string){
        if (str.indexOf("$") >0){
            return false;
        }
        if (str.length()<5 || str.length() >8){
            return false;
        }
        else {
            return true;
        }
    }

}
