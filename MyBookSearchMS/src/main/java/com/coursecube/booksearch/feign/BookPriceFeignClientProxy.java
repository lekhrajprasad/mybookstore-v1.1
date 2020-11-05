package com.coursecube.booksearch.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coursecube.booksearch.dto.BookPriceInfo;

@FeignClient(value="abc",url = "http://localhost:9000")
public interface BookPriceFeignClientProxy {
	
	@GetMapping("/bookPrice/{bookId}")
	public BookPriceInfo getBookPrice(@PathVariable Integer bookId);
}
