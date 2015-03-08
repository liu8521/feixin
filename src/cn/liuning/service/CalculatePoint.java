package cn.liuning.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import cn.liuning.utils.PublicUtils;

/**
 * 
 * 绩点查询
 * 
 * @author mrsliu
 *
 */
public class CalculatePoint {
	public List getMessage(String str1){
		List list = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try{
			 HttpPost httpPost1 = new HttpPost("http://210.44.176.116/cjcx/zcjcx_list.php");
	         List <NameValuePair> nvps1 = new ArrayList <NameValuePair>();
	         nvps1.add(new BasicNameValuePair("post_xuehao", str1));
	         nvps1.add(new BasicNameValuePair("__EVENTARGUMENT", ""));
	         nvps1.add(new BasicNameValuePair("Submit", "提交"));
	         httpPost1.setHeader("Host", "210.44.176.116");
	         httpPost1.setHeader("Referer", "http://210.44.176.116/cjcx/zcjcx_login.html");
	         httpPost1.setEntity(new UrlEncodedFormEntity(nvps1));
	         CloseableHttpResponse response_post1 = httpclient.execute(httpPost1);
	         try {
	        	 String str = EntityUtils.toString(response_post1.getEntity());
	             list = PublicUtils.getList_Htmltojavabean(str);
	         } finally {
	        	 response_post1.close();
	         }
	         return list;
		}catch (Exception e){
			
		}
		return list;
	}
}
