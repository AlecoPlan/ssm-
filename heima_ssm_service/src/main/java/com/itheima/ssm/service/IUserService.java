package com.itheima.ssm.service;

import com.itheima.ssm.domain.Role;
import com.itheima.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @author shkstart
 * @creats 2020-05-01-17:46
 */
public interface IUserService extends UserDetailsService {
    /**
     * 查询所有用户
     * @return
     * @throws Exception
     */
    List<UserInfo> findAll() throws Exception;

    /**
     * 添加用户
     * @param userInfo
     */
    void save(UserInfo userInfo) throws Exception;

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    UserInfo findById(String id) throws Exception;

    /**
     * 查询其他没有的角色
     * @param userId
     * @return
     */
    List<Role> findOtherRoles(String userId);

    void addRoleToUser(String userId, String[] roleIds);
}
