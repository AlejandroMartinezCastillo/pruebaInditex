package com.inditex.demo.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inditex.demo.DTO.PricesDTO;
import com.inditex.demo.mapper.PricesMapper;
import com.inditex.demo.persistence.data.domain.Prices;
import com.inditex.demo.persistence.data.repository.PricesRepository;
import com.inditex.demo.service.PricesService;

/**
 * The Class PricesServiceImpl.
 */
@Service("prices")
public class PricesServiceImpl implements PricesService {

	/** The prices repository. */
	@Autowired
	private PricesRepository pricesRepository;

	/** The prices mapper. */
	@Autowired
	private PricesMapper pricesMapper;

	/**
	 * Gets the price.
	 *
	 * @param date      the date
	 * @param productId the product id
	 * @param brandId   the brand id
	 * @return the price
	 */
	@Override
	public PricesDTO getPrice(LocalDateTime date, Long productId, Long brandId) {
		List<Prices> prices = pricesRepository.findPriceByDateProductBrand(date, productId, brandId);
		PricesDTO priceDTO = new PricesDTO();
		if (!prices.isEmpty()) {
			priceDTO = pricesMapper.pricesToPricesDTO(prices.get(0));
		}
		return priceDTO;
	}
}
