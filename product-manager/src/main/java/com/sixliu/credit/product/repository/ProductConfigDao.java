package com.sixliu.credit.product.repository;

import java.util.List;

import com.sixliu.credit.product.repository.po.ProductConfig;

/**
*@author:MG01867
*@date:2018年6月15日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public interface ProductConfigDao {

	ProductConfig getById(Integer id);
	
	List<ProductConfig> listByType(Integer typeId);
	
	int insert(ProductConfig product);
}
