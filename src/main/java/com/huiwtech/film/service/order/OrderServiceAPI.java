package com.huiwtech.film.service.order;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.huiwtech.film.controller.order.vo.response.OrderDetailResVO;
import com.huiwtech.film.controller.order.vo.response.OrderPayResVO;
import com.huiwtech.film.controller.order.vo.response.QRCodeResVO;
import com.huiwtech.film.service.common.exception.CommonServiceExcetion;

import java.io.IOException;

public interface OrderServiceAPI {

    /*
        检查座位是否符合现状
     */
    void checkSeats(String fieldId, String seats) throws CommonServiceExcetion, IOException;

    /*
        检查座位是否为已售座位
     */
    void checkSoldSeats(String fieldId, String seats) throws CommonServiceExcetion;


    /*
        保存订单信息
     */
    OrderDetailResVO saveOrder(String seatIds, String seatNames, String fieldId, String userId) throws CommonServiceExcetion;


    /*
        根据用户编号，获取该用户购买过的电影票订单信息
     */
    IPage<OrderDetailResVO> describeOrderInfoByUser(int nowPage, int pageSize, String userId) throws CommonServiceExcetion;

    /*
        获取二维码地址
     */
    QRCodeResVO describeQRCodeAddress(String orderId) throws CommonServiceExcetion;

    /*
        获取订单支付状态
     */
    OrderPayResVO describePayResult(String orderId) throws CommonServiceExcetion;

    /*
        当支付宝返回成功状态时，我们应该进行的处理
     */
    void orderPaySuccess(String orderId) throws CommonServiceExcetion;

}
