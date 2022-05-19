package com.inditex.demo.mapper.impl;

import com.inditex.demo.DTO.PricesDTO;
import com.inditex.demo.mapper.PricesMapper;
import com.inditex.demo.persistence.data.domain.Prices;

/**
 * The Class PricesMapperImpl.
 */
public class PricesMapperImpl implements PricesMapper {

	/**
	 * Prices to prices DTO.
	 *
	 * @param prices the prices
	 * @return the prices DTO
	 */
	@Override
	public PricesDTO pricesToPricesDTO(Prices prices) {
		if (prices == null) {
			return null;
		}
		PricesDTO pricesDTO = new PricesDTO();
		pricesDTO.setProductId(prices.getProductId());
		pricesDTO.setBrandId(prices.getBrandId());
		pricesDTO.setPriceList(prices.getPriceList());
		pricesDTO.setStartDate(prices.getStartDate());
		pricesDTO.setEndDate(prices.getEndDate());
		pricesDTO.setPrice(prices.getPrice());
		return pricesDTO;
	}

	/**
	 * Prices DTO to prices.
	 *
	 * @param pricesDTO the prices DTO
	 * @return the prices
	 */
	@Override
	public Prices pricesDTOToPrices(PricesDTO pricesDTO) {
		if (pricesDTO == null) {
			return null;
		}
		Prices prices = new Prices();
		prices.setProductId(pricesDTO.getProductId());
		prices.setBrandId(pricesDTO.getBrandId());
		prices.setPriceList(pricesDTO.getPriceList());
		prices.setStartDate(pricesDTO.getStartDate());
		prices.setEndDate(pricesDTO.getEndDate());
		prices.setPrice(pricesDTO.getPrice());
		return prices;
	}

}
