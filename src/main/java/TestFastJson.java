import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.math.BigDecimal;
import java.util.Date;

public class TestFastJson {
    private Date date;
    private String str;
    private Integer in;
    private BigDecimal de;
    public static void main(String[] args) {
        TestFastJson testFastJson = new TestFastJson();
        testFastJson.setDate(new Date());
        Integer integer = new Integer("22");
        testFastJson.setIn(integer);
        BigDecimal bigDecimal = new BigDecimal("111");
        testFastJson.setDe(bigDecimal);
        //String s = JSONObject.toJSONString(testFastJson, SerializerFeature.WriteMapNullValue,SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteNullNumberAsZero);
        String s = JSONObject.toJSONStringWithDateFormat(testFastJson,"yyyy-MM-dd HH:mm:ss",SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteMapNullValue,SerializerFeature.WriteNonStringValueAsString);
        System.out.println(s);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getIn() {
        return in;
    }

    public void setIn(Integer in) {
        this.in = in;
    }

    public BigDecimal getDe() {
        return de;
    }

    public void setDe(BigDecimal de) {
        this.de = de;
    }
}
