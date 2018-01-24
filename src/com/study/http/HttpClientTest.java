package com.study.http;

public class HttpClientTest
{

	public static void main(String[] args) throws Exception
	{
/*
		URI uri = new URIBuilder().setScheme("HTTP").setHost("www.baidu.com").setPath("/").setParameter("name", "****")
				.build();
		// 创建客户端对象,相当于打开一个浏览器
		CloseableHttpClient client = HttpClients.createDefault();
		try
		{
			// 创建一个get请求
			HttpGet httpGet = new HttpGet(uri);
			// 执行这个请求,改方法返回一个response对象
			CloseableHttpResponse response = client.execute(httpGet);
			try
			{
				// 得到请求的方式
				System.out.println("request method : " + httpGet.getMethod());
				System.out.println("-------------------------------");

				// 得到返回的状态行,StatusLine为接口,getStatusLine()返回一个实现该接口的对象
				StatusLine statusLine = response.getStatusLine();
				System.out.println(statusLine.getProtocolVersion());
				System.out.println(statusLine.getStatusCode());
				System.out.println(statusLine.getReasonPhrase());
				System.out.println("-------------------------------");

				// getAllHeaders()方法将得到所有的响应头,并返回一个数组
				// Header[] headers = response.getAllHeaders();
				// for (Header h : response.getAllHeaders()) {
				// System.out.println(h.getName() + " : " + h.getValue());
				// }

				HeaderIterator iter = response.headerIterator();
				while (iter.hasNext())
				{
					Header header = iter.nextHeader();
					System.out.println(header.getName() + " : " + header.getValue());
				}

			} finally
			{
				response.close();
			}
		} finally
		{
			client.close();
		}
		*/
	}
}