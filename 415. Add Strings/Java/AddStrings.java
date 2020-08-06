public class AddStrings {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuffer sb = new StringBuffer();
        int carry = 0;
        int res = 0;
        int x = 0, y = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            x = i >= 0 ? num1.charAt(i) - '0' : 0;
            y = j >= 0 ? num2.charAt(j) - '0' : 0;
            res = x + y + carry;
            sb.append(res % 10);
            carry = res / 10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}