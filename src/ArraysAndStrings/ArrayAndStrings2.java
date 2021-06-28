package ArraysAndStrings;

public class ArrayAndStrings2 {

    public static void main(String args[]){

        String test = " Mr John Smith         ";

        ArrayAndStrings2 arrayAndStrings2 = new ArrayAndStrings2();
        String result = arrayAndStrings2.urlify(test, 15);
        System.out.println(result);
    }

    public String urlify(String urlUnsafeString, int trueLength){

        char[] urlUnsafeCharArr = urlUnsafeString.toCharArray();
        int diff = urlUnsafeCharArr.length - trueLength;
        int originalIndex = urlUnsafeCharArr.length - 1;
        for(int i = trueLength - 1; i >= 0; i--){
            if(urlUnsafeCharArr[i] == ' '){
                urlUnsafeCharArr[originalIndex] = '0';
                urlUnsafeCharArr[--originalIndex] = '2';
                urlUnsafeCharArr[--originalIndex] = '%';
                originalIndex--;
            } else {
                urlUnsafeCharArr[originalIndex] = urlUnsafeCharArr[i];
                originalIndex--;
            }
        }
        System.out.println("Length of result: "+urlUnsafeCharArr.length);
        return new String(urlUnsafeCharArr);
    }

}
