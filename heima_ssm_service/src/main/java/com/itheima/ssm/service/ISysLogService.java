package com.itheima.ssm.service;

import com.itheima.ssm.domain.SysLog;

import java.util.List;

/**
 * @author shkstart
 * @creats 2020-05-03-14:50
 */
public interface ISysLogService {

    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll() throws Exception;
}
