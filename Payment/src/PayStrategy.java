import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
    public static final String ALI_PAY="AliPay";
    public static final String JD_PAY="JdPay";
    public static final String UNION_PAY="UnionPay";
    public static final String WECHAT_PAY="WechatPay";
    public static final String DEFAULT_PAY=ALI_PAY;

    private static Map<String,Payment> PayStrategy=new HashMap<String, Payment>();
    static {
        PayStrategy.put(ALI_PAY,new AliPay());
        PayStrategy.put(WECHAT_PAY,new WechatPay());
        PayStrategy.put(UNION_PAY,new UnionPay());
        PayStrategy.put(JD_PAY,new JDPay());
    }
    public static Payment get(String payKey){
        if(!PayStrategy.containsKey(payKey)){
            return PayStrategy.get(DEFAULT_PAY);
        }
        return PayStrategy.get(payKey);
    }
}
