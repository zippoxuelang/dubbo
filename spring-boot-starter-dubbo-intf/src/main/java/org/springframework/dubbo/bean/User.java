package org.springframework.dubbo.bean;

/**
 * @ProjectName: frame
 * @Package: org.springframework.dubbo.bean
 * @ClassName: User
 * @Description: java类作用描述
 * @Author: xiangyf
 * @CreateDate: 2018/6/1 11:06
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/6/1 11:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class User {
    private String code;

    private String userName;

    private String sex;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "code='" + code + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
