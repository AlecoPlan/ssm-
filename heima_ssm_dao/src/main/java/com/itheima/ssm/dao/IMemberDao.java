package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 * @author shkstart
 * @creats 2020-05-01-16:33
 */
public interface IMemberDao {

    @Select("select *from member where id=#{id}")
    public Member findById(String id) throws Exception;
}
