package com.zou.dubbo.consumer.api;

import com.arcsoft.websocket.api.service.WebSocketDubboAPI;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @Author: zhouying
 * @Date: 2019/7/4 0004
 * @Description:
 */
@Component
public class DubboAPI {

    @Reference
    private WebSocketDubboAPI webSocketDubboAPI;

    public WebSocketDubboAPI getWebSocketDubboAPI() {
        return webSocketDubboAPI;
    }
}