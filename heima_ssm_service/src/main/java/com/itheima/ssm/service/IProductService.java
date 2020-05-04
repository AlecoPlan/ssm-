package com.itheima.ssm.service;

import com.itheima.ssm.domain.Product;

import java.util.List;

/**
 * @author shkstart
 * @creats 2020-04-30-16:50
 */
public interface IProductService {

    public List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;

}
