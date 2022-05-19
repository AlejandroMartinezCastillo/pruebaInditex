package com.inditex.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.inditex.demo.DTO.PricesDTO;
import com.inditex.demo.service.PricesService;

/**
 * The Class PricesControllerImplTest.
 */
@RunWith(MockitoJUnitRunner.class)
public class PricesControllerImplTest {

	/** The prices controller. */
	@InjectMocks
	PricesController pricesController;

	/** The prices service. */
	@Mock
	PricesService pricesService;

	/**
	 * Inits the.
	 */
	@Before
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

	/**
	 * Gets the price test.
	 *
	 * @return the price test
	 * @throws ParseException the parse exception
	 */
	@Test
	public void getPriceTest() throws ParseException {
		String dateString = "2020-06-14 10:00:00";
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime date = LocalDateTime.parse(dateString, dateFormat);
		Long productId = 35455L;
		Long brandId = 1L;

		int priceList = 1;
		String startDateString = "2020-06-14 00:00:00";
		LocalDateTime startDate = LocalDateTime.parse(startDateString, dateFormat);
		String endDateString = "2020-12-31 23:59:59";
		LocalDateTime endDate = LocalDateTime.parse(endDateString, dateFormat);
		Float price = 35.5f;

		PricesDTO pricesDTO = new PricesDTO();
		pricesDTO.setProductId(productId);
		pricesDTO.setBrandId(brandId);
		pricesDTO.setPriceList(priceList);
		pricesDTO.setStartDate(startDate);
		pricesDTO.setEndDate(endDate);
		pricesDTO.setPrice(price);

		Mockito.when(pricesService.getPrice(date, productId, brandId)).thenReturn(pricesDTO);

		PricesDTO result = pricesController.getPrice(date, productId, brandId);

		assertEquals(pricesDTO, result);

		verify(pricesService, times(1)).getPrice(date, productId, brandId);
	}

}
