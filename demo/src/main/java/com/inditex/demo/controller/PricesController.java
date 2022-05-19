package com.inditex.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inditex.demo.DTO.PricesDTO;
import com.inditex.demo.persistence.data.domain.Prices;
import com.inditex.demo.service.PricesService;

/**
 * The Class PricesController.
 */
@RestController
@RequestMapping("/prices")
public class PricesController {

	/** The prices service. */
	@Autowired
	private PricesService pricesService;

	/**
	 * Gets the price.
	 *
	 * @param date      the date
	 * @param productId the product id
	 * @param brandId   the brand id
	 * @return the price
	 */
	@GetMapping("/getPrice")
	public PricesDTO getPrice(@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime date,
			@RequestParam("productId") Long productId, @RequestParam("brandId") Long brandId) {
		PricesDTO prices = pricesService.getPrice(date, productId, brandId);
		return prices;
	}
}
