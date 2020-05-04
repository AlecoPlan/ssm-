package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.domain.Role;

import java.util.List;

/**
 * @author shkstart
 * @creats 2020-05-02-14:38
 */
public interface IRoleService {

    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(String roleId) throws Exception;

    void deleteRoleById(String roleId) throws Exception;

    List<Permission> findOtherPermissions(String roleId) throws Exception;

    void addPermissionToRole(String roleId, String[] permissionIds);
}
