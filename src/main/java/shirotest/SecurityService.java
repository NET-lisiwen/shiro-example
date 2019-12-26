package shirotest;

/**
 * @ProjectName: shrio-example
 * @ClassName: SecurityService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: lisiwen
 * @Date: 2019/12/25 17:49
 **/
public class SecurityService {
     public final static String userName="jay";
     public final static String pwd="123";

    public String  findPasswordByUsername (String userName){
        if(userName.equals(userName)){
            return pwd;
        }else{
            return null;
        }
    }
}
