package com.chuyang.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chuyang.common.HttpClientUtil;
import com.chuyang.common.JSONResult;
import com.chuyang.common.JsonUtils;
import com.chuyang.common.RedisOperator;
import com.chuyang.model.WXSessionModel;

@RestController
public class WXLoginController {
	
	@Autowired
	private RedisOperator redis;
	

	@PostMapping("/wxLogin")
	public JSONResult wxLogin(String code) {
		
		System.out.println("wxlogin - code: " + code);
		
//		https://api.weixin.qq.com/sns/jscode2session?
//				appid=APPID&
//				secret=SECRET&
//				js_code=JSCODE&
//				grant_type=authorization_code
		
		String url = "https://api.weixin.qq.com/sns/jscode2session";
		Map<String, String> param = new HashMap<>();
		//开发平台上的AppID
		param.put("appid", "wx0079434ebb13d6d8");
		//开发平台的AppSecret
		param.put("secret", "2252feceba9e1d907bf0fee2c8cfba34");
		param.put("js_code", code);
		param.put("grant_type", "authorization_code");
		
		String wxResult = HttpClientUtil.doGet(url, param);
		System.out.println("wxResult=====" + wxResult);
		
		WXSessionModel model = JsonUtils.jsonToPojo(wxResult, WXSessionModel.class);
		
		// 存入session到redis
//		redis.set("user-redis-session:" + model.getOpenid(),
//							model.getSession_key(),
//							1000 * 60 * 30);
		
		return JSONResult.ok();
	}
	
}
