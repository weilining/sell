<html>
<<<<<<< HEAD

    <head>
        <meta charset="utf-8">
=======
    <head>
        <mate charset="utf-8"></mate>
>>>>>>> 9-3
        <title>卖家商品列表</title>
        <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table">
                    <thead>
                    <tr>
<<<<<<< HEAD
                        <th>
                            编号
                        </th>
                        <th>
                            产品
                        </th>
                        <th>
                            交付时间
                        </th>
                        <th>
                            状态
                        </th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>
                            1
                        </td>
                        <td>
                            TB - Monthly
                        </td>
                        <td>
                            01/04/2012
                        </td>
                        <td>
                            Default
                        </td>
                    </tr>
                    <tr class="success">
                        <td>
                            1
                        </td>
                        <td>
                            TB - Monthly
                        </td>
                        <td>
                            01/04/2012
                        </td>
                        <td>
                            Approved
                        </td>
                    </tr>
                    <tr class="error">
                        <td>
                            2
                        </td>
                        <td>
                            TB - Monthly
                        </td>
                        <td>
                            02/04/2012
                        </td>
                        <td>
                            Declined
                        </td>
                    </tr>
                    <tr class="warning">
                        <td>
                            3
                        </td>
                        <td>
                            TB - Monthly
                        </td>
                        <td>
                            03/04/2012
                        </td>
                        <td>
                            Pending
                        </td>
                    </tr>
                    <tr class="info">
                        <td>
                            4
                        </td>
                        <td>
                            TB - Monthly
                        </td>
                        <td>
                            04/04/2012
                        </td>
                        <td>
                            Call in to confirm
                        </td>
                    </tr>
=======
                        <th>订单id</th>
                        <th>姓名</th>
                        <th>手机号</th>
                        <th>地址</th>
                        <th>金额</th>
                        <th>订单状态</th>
                        <th>支付状态</th>
                        <th>创建时间</th>
                        <th colspan="2">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list orderDTOPage.content as orderDTO>
                    <tr>
                        <td>${orderDTO.orderId}</td>
                        <td>${orderDTO.buyerName}</td>
                        <td>${orderDTO.buyerPhone}</td>
                        <td>${orderDTO.buyerAddress}</td>
                        <td>${orderDTO.orderAmount}</td>
                        <td>${orderDTO.orderStatus}</td>
                        <td>${orderDTO.payStatus}</td>
                        <td>${orderDTO.createTime}</td>
                        <td>详情</td>
                        <td>取消</td>
                    </tr>
                    </#list>
>>>>>>> 9-3
                    </tbody>
                </table>
            </div>
        </div>
        <#--分页-->
        <div class="col-md-12 column">
            <ul class="pagination pull-right">
                <#--等于1-->
                <#if currentPage lte 1>
                    <li class="disabled"><a href="#">上一页</a></li>
                <#else>
                    <li><a href="/sell/seller/order/list?page=${currentPage - 1}&size=${size}">上一页</a></li>
                </#if>

                <#list 1..orderDTOPage.getTotalPages() as index>
                    <#if currentPage == index>
                    <li class="disabled"><a href="#">${index}</a></li>
                    <#else >
                    <li><a href="/sell/seller/order/list?page=${index}&size=${size}">${index}</a></li>
                    </#if>
                </#list>
                <#--大于等于-->
                <#if currentPage gte orderDTOPage.getTotalPages()>
                    <li class="disabled"><a href="#">下一页</a></li>
                <#else>
                    <li><a href="/sell/seller/order/list?page=${currentPage + 1}&size=${size}">下一页</a></li>
                </#if>
            </ul>
        </div>
    </div>
    </body>
<<<<<<< HEAD

</html>
<#--<#list orderDTOPage.content as orderDTO>-->
    <#--${orderDTO.orderId}<br>-->
<#--</#list>-->
=======
</html>
>>>>>>> 9-3
