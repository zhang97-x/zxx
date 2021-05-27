package com.changgou.goods.dao;

import com.changgou.goods.pojo.Brand;
import tk.mybatis.mapper.common.Mapper;

/**
 * 接口继承了Mapper，自动实现了常用的增删改查方法
 */
public interface BrandMapper extends Mapper<Brand> {
}
