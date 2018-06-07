package org.springframework.dubbo.intf;

import org.springframework.dubbo.bean.User;

/**
 * @ProjectName: frame
 * @Package: org.springframework.dubbo.intf
 * @ClassName: UserService
 * @Description: java类作用描述
 * @Author: xiangyf
 * @CreateDate: 2018/6/1 11:05
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/6/1 11:05
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface UserService {

    /**
     * 获取用户信息(测试)
     * @param user
     * @return
     */
    public User getUser(User user);

}
