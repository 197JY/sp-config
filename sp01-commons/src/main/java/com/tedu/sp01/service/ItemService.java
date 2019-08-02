package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;
//定义中立的接口,一个接口对应一个服务
public interface ItemService {
	List<Item> getItems(String orderId);//根据订单号获取到订单商品
	void decreaseNumbers(List<Item> list);//根据订单上的商品列表获取到商品id号,从而减少已购商品的库存量
}