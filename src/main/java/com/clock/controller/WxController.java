package com.clock.controller;

import com.alibaba.fastjson.JSONObject;
import com.clock.entity.WxInfo;
import com.clock.utils.HttpClientUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class WxController {
    @RequestMapping("user_login")
    public String userLogin(HttpServletRequest request){
        Map<String ,String> param = new HashMap<>();
        param.put("appid", WxInfo.WX_LOGIN_APPID);
        param.put("secret",WxInfo.WX_LOGIN_SECRET);
        param.put("js_code",request.getParameter("js_code"));
        param.put("grant_type",WxInfo.WX_LOGIN_GRANT_TYPE);
        //发送请求
        String wxResult = HttpClientUtil.doGet(WxInfo.WX_LOGIN_URL,param);
        JSONObject jsonObject = JSONObject.parseObject(wxResult);
        System.out.println(jsonObject.toString());
        return "token value";
    }

}
