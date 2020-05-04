package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author shkstart
 * @creats 2020-04-30-16:47
 */
public interface IProductDao {

    /**
     * 查询所有产品信息
     * @return
     * @throws Exception
     */
    @Select("select * from product")
    public List<Product> findAll() throws Exception;

    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus)values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);

    /**
     * 根据id查询产品信息
     * @param id
     * @return
     * @throws Exception
     */
    @Select("select * from product where id=#{id}")
    public Product findById(String id) throws Exception;
}
