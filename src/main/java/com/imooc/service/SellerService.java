package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * Created by 韦师兄
 * 2019-03-05 06:30
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
