package com.changgou.goods.controller;

import com.changgou.entiy.Result;
import com.changgou.entiy.StatusCode;
import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    /**
     * 查询所有商品
     * @return
     */
    @GetMapping  //将不需要写映射地址
    public Result<List<Brand>> findAll() {
        List<Brand> list = brandService.findAll();
        return new Result<List<Brand>>(true, StatusCode.OK, "查询成功", list);
    }

    @GetMapping("/{id}")
    public Result<Brand> findById(@PathVariable("id") Integer id) {
        Brand brand = brandService.findById(id);
        return new Result<Brand>(true, StatusCode.OK, "查询成功", brand);
    }

    /**
     * 新增品牌
     * RequestBody注解：前台以json格式传输到后台，后台转换对象
     * ResponseBody注解：将后台对象以json格式输出到前台
     *
     * @param brand
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Brand brand) {
        brandService.add(brand);
        return new Result(true, StatusCode.OK, "添加成功");
    }

    /**
     * 修改品牌数据
     * @param brand
     * @param id
     * @return
     */
    @PutMapping(value = "/{id}")
    public Result update(@RequestBody Brand brand, @PathVariable("id") Integer id) {
       //设置ID
        brand.setId(id);
      //修改数据
        brandService.update(brand);
        return new Result(true, StatusCode.OK, "修改成功");
    }
}