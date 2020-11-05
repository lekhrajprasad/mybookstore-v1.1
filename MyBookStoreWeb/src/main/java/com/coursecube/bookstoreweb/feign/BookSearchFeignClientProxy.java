package com.coursecube.bookstoreweb.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coursecube.dto.BookDTO;
import com.coursecube.dto.BookInfoDTO;

@FeignClient(value="MyBookSearchMS",url = "http://localhost:8000")
public interface BookSearchFeignClientProxy {
	
	@GetMapping("/mybooks/{author}/{category}")
	public List<BookDTO> getBooks(@PathVariable String author, @PathVariable String category);

	@GetMapping("/mybooks/{bookId}")
	public BookInfoDTO getBookById(@PathVariable Integer bookId);
}
