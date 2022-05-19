package com.inditex.demo.persistence.data.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Prices.
 */
@Entity
@Getter
@Setter
@ToString
@Table(name = "PRICES")
public class Prices {

	/** The price id. */
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long priceId;

	/** The brand id. */
	@Column(name = "BRAND_ID")
	private Long brandId;

	/** The start date. */
	@Column(name = "START_DATE")
	private LocalDateTime startDate;

	/** The end date. */
	@Column(name = "END_DATE")
	private LocalDateTime endDate;

	/** The price list. */
	@Column(name = "PRICE_LIST")
	private int priceList;

	/** The product id. */
	@Column(name = "PRODUCT_ID")
	private Long productId;

	/** The priority. */
	@Column(name = "PRIORITY")
	private int priority;

	/** The price. */
	@Column(name = "PRICE")
	private Float price;

	/** The curr. */
	@Column(name = "CURR")
	private String curr;
}
