package com.inditex.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * The Class DemoApplicationTest.
 */
@SpringBootTest(classes = DemoApplication.class)
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class DemoApplicationTest {

	/** The mock mvc. */
	@Autowired
	private MockMvc mockMvc;

	/**
	 * Integration test 1.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void integrationTest1() throws Exception {
		mockMvc.perform(get("/prices/getPrice?productId=35455&brandId=1&date=2020-06-14 10:00:00")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.content()
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("productId", is(35455))).andExpect(jsonPath("brandId", is(1)))
				.andExpect(jsonPath("priceList", is(1))).andExpect(jsonPath("startDate", is("2020-06-14T00:00:00")))
				.andExpect(jsonPath("endDate", is("2020-12-31T23:59:59"))).andExpect(jsonPath("price", is(35.5)));
	}

	@Test
	public void integrationTest2() throws Exception {
		mockMvc.perform(get("/prices/getPrice?productId=35455&brandId=1&date=2020-06-14 16:00:00")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.content()
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("productId", is(35455))).andExpect(jsonPath("brandId", is(1)))
				.andExpect(jsonPath("priceList", is(2))).andExpect(jsonPath("startDate", is("2020-06-14T15:00:00")))
				.andExpect(jsonPath("endDate", is("2020-06-14T18:30:00"))).andExpect(jsonPath("price", is(25.45)));
	}

	@Test
	public void integrationTest3() throws Exception {
		mockMvc.perform(get("/prices/getPrice?productId=35455&brandId=1&date=2020-06-14 21:00:00")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.content()
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("productId", is(35455))).andExpect(jsonPath("brandId", is(1)))
				.andExpect(jsonPath("priceList", is(1))).andExpect(jsonPath("startDate", is("2020-06-14T00:00:00")))
				.andExpect(jsonPath("endDate", is("2020-12-31T23:59:59"))).andExpect(jsonPath("price", is(35.5)));
	}

	@Test
	public void integrationTest4() throws Exception {
		mockMvc.perform(get("/prices/getPrice?productId=35455&brandId=1&date=2020-06-15 10:00:00")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.content()
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("productId", is(35455))).andExpect(jsonPath("brandId", is(1)))
				.andExpect(jsonPath("priceList", is(3))).andExpect(jsonPath("startDate", is("2020-06-15T00:00:00")))
				.andExpect(jsonPath("endDate", is("2020-06-15T11:00:00"))).andExpect(jsonPath("price", is(30.5)));
	}

	@Test
	public void integrationTest5() throws Exception {
		mockMvc.perform(get("/prices/getPrice?productId=35455&brandId=1&date=2020-06-16 21:00:00")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.content()
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("productId", is(35455))).andExpect(jsonPath("brandId", is(1)))
				.andExpect(jsonPath("priceList", is(4))).andExpect(jsonPath("startDate", is("2020-06-15T16:00:00")))
				.andExpect(jsonPath("endDate", is("2020-12-31T23:59:59"))).andExpect(jsonPath("price", is(38.95)));
	}
}
