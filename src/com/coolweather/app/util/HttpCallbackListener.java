package com.coolweather.app.util;

/*HttpUtil类中使用到了HttpCallbackListener接口来回调服务返回的结果*/
public interface HttpCallbackListener {
	void onFinish(String response);
	void onError(Exception e);
}
