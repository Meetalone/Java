package ori.string.test2;

public class StringTest {
    private String str;
    public StringTest() {
    }

    public StringTest(String str) {
        this.str = str;
    }

    /**
     * 获取
     * @return str
     */
    public String getStr() {
        return str;
    }

    /**
     * 设置
     * @param str
     */
    public void setStr(String str) {
        this.str = str;
    }

    public String toString() {
        return "StringTest{str = " + str + "}";
    }

    public char charAt(int index) {
        char [] temp = this.str.toCharArray();
        return temp[index];
    }

    public int length() {
        return this.str.length();
    }
}
