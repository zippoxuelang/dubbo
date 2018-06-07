package org.springframework.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dubbo.bean.User;
import org.springframework.dubbo.intf.UserService;

/**
 * @ProjectName: frame
 * @Package: org.springframework.dubbo.service
 * @ClassName: UserServiceImpl
 * @Description: java类作用描述
 * @Author: xiangyf
 * @CreateDate: 2018/6/1 11:11
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/6/1 11:11
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class UserServiceImpl  implements UserService {

    @Override
    public User getUser(User user) {
        return user;
    }

}
