package cn.liuning.service;

import cn.liuning.domain.CetScore;
import cn.liuning.utils.PublicUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class CetScoreService
{
  CloseableHttpClient httpclient = HttpClients.createDefault();
  CetScore cetScore;
  public CetScore find_GetofCet(String number, String name) throws Exception { CetScore cetScore;
    try { HttpGet httpGet1 = new HttpGet("http://www.chsi.com.cn/cet/query?zkzh=" + number + "&xm=" + name);
      httpGet1.setHeader("Referer", "http://www.chsi.com.cn/cet/");
      CloseableHttpResponse response3 = this.httpclient.execute(httpGet1);
      
      try { String str = EntityUtils.toString(response3.getEntity(), "utf-8");
        cetScore = PublicUtils.getList_CetHtmltojavabean(str);
      }
      finally
      {
        response3.close();
      }
    } finally {
      this.httpclient.close();
    }
    return cetScore;
  }
}