package com.clock.utils;

import com.sun.javafx.fxml.builder.URLBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

public class HttpClientUtil {
    public static String doGet(String url, Map<String, String> param){
        //创建Httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String resultString= "";
        CloseableHttpResponse response = null;
        try {
            URIBuilder builder = new URIBuilder(url);
            if (param!=null){
                for(String key:param.keySet()){
                    builder.addParameter(key,param.get(key));
                }
            }
            URI uri = builder.build();
            HttpGet httpGet = new HttpGet(uri);
            response = httpClient.execute(httpGet);
            if (response.getStatusLine().getStatusCode()==200){
                resultString = EntityUtils.toString(response.getEntity(),"UTF-8");

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (response!=null){
                    response.close();
                }
                httpClient.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return resultString;
    }
}
