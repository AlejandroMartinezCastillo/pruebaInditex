package com.inditex.demo.persistence.data.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.inditex.demo.persistence.data.domain.Prices;

/**
 * The Interface PricesRepository.
 */
public interface PricesRepository extends JpaRepository<Prices, Long> {

	/**
	 * Find price by date product brand.
	 *
	 * @param date      the date
	 * @param productId the product id
	 * @param brandId   the brand id
	 * @return the list
	 */
	@Query("SELECT p FROM Prices p WHERE :date BETWEEN p.startDate and p.endDate and p.productId = :productId and p.brandId = :brandId ORDER BY p.priority DESC")
	List<Prices> findPriceByDateProductBrand(@Param("date") LocalDateTime date, @Param("productId") Long productId,
			@Param("brandId") Long brandId);
}
