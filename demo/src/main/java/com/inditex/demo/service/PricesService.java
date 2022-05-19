package com.inditex.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.inditex.demo.DTO.PricesDTO;
import com.inditex.demo.persistence.data.domain.Prices;

/**
 * The Interface PricesService.
 */
public interface PricesService {

	/**
	 * Gets the price.
	 *
	 * @param date      the date
	 * @param productId the product id
	 * @param brandId   the brand id
	 * @return the price
	 */
	public PricesDTO getPrice(LocalDateTime date, Long productId, Long brandId);
}
