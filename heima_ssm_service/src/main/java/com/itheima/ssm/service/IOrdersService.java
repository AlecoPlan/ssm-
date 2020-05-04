package com.itheima.ssm.service;

import com.itheima.ssm.domain.Orders;

import java.util.List;

/**
 * @author shkstart
 * @creats 2020-05-01-13:33
 */
public interface IOrdersService {



    List<Orders> findAll(int page, int size) throws Exception;

    Orders findById(String ordersId) throws Exception;
}
