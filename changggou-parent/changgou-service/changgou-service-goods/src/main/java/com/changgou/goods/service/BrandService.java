package com.changgou.goods.service;

import com.changgou.goods.pojo.Brand;

import java.util.List;

public interface BrandService {

    /**
     * 查询所有品牌数据
     * @return
     */
    List<Brand> findAll();

    /**
     * 根据Id查询品牌信息
     * @param id
     * @return
     */
    Brand findById(Integer id);

    /**
     * 新增品牌
     * @param brand
     */
    void add(Brand brand);

    /**
     * 修改品牌
     * @param brand
     */
    void update(Brand brand);
}
