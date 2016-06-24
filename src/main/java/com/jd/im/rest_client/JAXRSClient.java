package com.jd.im.rest_client;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public class JAXRSClient {

	public static void main(String[] args) {
		String baseAddress = "http://localhost:8080/ws/rest";

		List<Object> providerList = new ArrayList<Object>();
		providerList.add(new JacksonJsonProvider());

		Product p = WebClient.create(baseAddress, providerList)
				.path("/product/1")
				.accept(MediaType.APPLICATION_JSON)
				.get(Product.class);
		//for (Object product : productList) {
			System.out.println(p.getId());
		//}
			
			
			WebClient wc = WebClient.create(baseAddress, providerList)
					.path("/products")
					.accept(MediaType.APPLICATION_JSON);
			List<Product> list = wc.get(new GenericType<List<Product>>() {});
			for (Product product : list) {
				//p = JSON.parseObject(product.toString(), Product.class);
				System.out.println(product);
			}
	}
}
