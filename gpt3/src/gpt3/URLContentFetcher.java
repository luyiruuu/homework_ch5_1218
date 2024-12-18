package gpt3;
import  java.net.*;
import java.io.*;

public class URLContentFetcher {
    public static void main(String[] args) {
        // 指定要抓取的 URL
        String urlString = "http://example.com";

        try {
            // 建立 URL 物件
            URL url = new URL(urlString);

            // 開啟連接並取得輸入流
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            // 讀取內容
            String line;
            System.out.println("Fetching content from: " + urlString);
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // 關閉流
            reader.close();
        } catch (MalformedURLException e) {
            System.err.println("URL 格式錯誤: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("無法讀取 URL: " + e.getMessage());
        }
    }
}
