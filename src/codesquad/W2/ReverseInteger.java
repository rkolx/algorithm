package codesquad.W2;

public class ReverseInteger {
    public int reverse(int x){

        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(x);
        Long result;

        if (str.charAt(0)=='-'){
            str=str.substring(1);
            sb.append(str).reverse().insert(0,'-');
        }else {
            sb.append(str).reverse();
        }
        result = Long.parseLong(sb.toString());
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
            return 0;
        }

        return Integer.parseInt(String.valueOf(result));
    }
}
