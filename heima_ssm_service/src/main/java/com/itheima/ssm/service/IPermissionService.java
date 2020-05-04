package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;

import java.util.List;

/**
 * @author shkstart
 * @creats 2020-05-02-15:14
 */

public interface IPermissionService {

    public List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;

    Permission findById(String id) throws Exception;

    void deleteById(String id) throws Exception;
}
