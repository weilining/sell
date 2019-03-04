package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Created by 韦师兄
 * 2019-03-05 06:21
 */
@Entity
@Data
public class SellerInfo {

    @Id
    private String sellerId;

    private String username;
    private String password;
    private String openid;
    private Timestamp createTime;
    private Timestamp updateTime;

}