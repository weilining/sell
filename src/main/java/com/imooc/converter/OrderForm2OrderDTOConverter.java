package com.imooc.converter;

import com.imooc.dto.OrderDTO;
import com.imooc.form.OrderForm;
import org.springframework.beans.BeanUtils;

/**
 * Created by 韦师兄
 * 2019-02-10 13:03
 */
public class OrderForm2OrderDTOConverter {
    private static OrderDTO convert(OrderForm orderForm){

        OrderDTO orderDTO=new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());


        orderDTO.setOrderDetailList();

//        BeanUtils.copyProperties();

    }
}
