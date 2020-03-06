package com.cts.bk.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.bk.beans.BookCatalogItem;

@RestController
@RequestMapping("/books")
public class BookCatalogController {

	@RequestMapping("/item")
	BookCatalogItem getBook() {
		return new BookCatalogItem("Alchemist","A book",4);
	}
}
