package com.inditex.demo.DTO;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class PricesDTO.
 */
@Getter
@Setter
@ToString
public class PricesDTO {

	/** The price id. */
	private Long priceId;

	/** The brand id. */
	private Long brandId;

	/** The start date. */
	private LocalDateTime startDate;

	/** The end date. */
	private LocalDateTime endDate;

	/** The price list. */
	private int priceList;

	/** The product id. */
	private Long productId;

	/** The priority. */
	private int priority;

	/** The price. */
	private Float price;

	/** The curr. */
	private String curr;
}
