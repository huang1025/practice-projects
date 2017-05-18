package com.huang.http.client;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by huang on 2017/5/17.
 */
public class PostTest {

    @Test
    public void test() {
        // 创建默认的httpClient实例.
        CloseableHttpClient httpclient = HttpClients.createDefault();

        // 创建httppost
        HttpPost httppost = new HttpPost("https://www.apple.com/cn/");

        // 创建参数队列
//        List<NameValuePair> formparams = new ArrayList<>();
//        formparams.add(new BasicNameValuePair("type", "house"));
//        UrlEncodedFormEntity uefEntity;

        try {
//            uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
//            httppost.setEntity(uefEntity);
            System.out.println("executing request " + httppost.getURI());
            CloseableHttpResponse response = httpclient.execute(httppost);
            try {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    System.out.println("--------------------------------------");
                    System.out.println("Response content: " + EntityUtils.toString(entity, "UTF-8"));
                    System.out.println("--------------------------------------");
                }
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭连接,释放资源
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
