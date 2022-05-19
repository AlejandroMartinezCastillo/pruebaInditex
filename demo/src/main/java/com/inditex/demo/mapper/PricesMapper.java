package com.inditex.demo.mapper;

import org.mapstruct.Mapper;

import com.inditex.demo.DTO.PricesDTO;
import com.inditex.demo.persistence.data.domain.Prices;

/**
 * The Interface PricesMapper.
 */
@Mapper(componentModel = "spring")
public interface PricesMapper {

	/**
	 * Prices to prices DTO.
	 *
	 * @param prices the prices
	 * @return the prices DTO
	 */
	PricesDTO pricesToPricesDTO(Prices prices);

	/**
	 * Prices DTO to prices.
	 *
	 * @param pricesDTO the prices DTO
	 * @return the prices
	 */
	Prices pricesDTOToPrices(PricesDTO pricesDTO);
}
