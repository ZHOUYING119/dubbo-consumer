package com.zou.dubbo.consumer.service;

import com.arcsoft.websocket.api.bean.WebSocketRequest;
import com.arcsoft.websocket.api.service.WebSocketDubboAPI;
import com.utopia.model.rsp.UtopiaResponseModel;
import com.zou.dubbo.consumer.api.DubboAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zhouying
 * @Date: 2019/7/4 0004
 * @Description:
 */
@Component
@ResponseBody
@RequestMapping("/ws")
public class RequestHandler {

    @Autowired
    private DubboAPI dubboAPI;


    @RequestMapping("/dubbo")
    public String dubboCall() {

        WebSocketRequest request = new WebSocketRequest();
        WebSocketDubboAPI webSocketDubboAPI = dubboAPI.getWebSocketDubboAPI();

        UtopiaResponseModel<String> responseModel = webSocketDubboAPI.sendMessage2Client(request);

        System.out.println(responseModel.toString());

        return responseModel.toString();
    }
}