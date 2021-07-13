package ru.rav.patterns.services;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import ru.rav.patterns.model.ProductEntity;

@RequiredArgsConstructor
@Service
public class ProductsDao {

    private final JdbcTemplate jdbcTemplate;

    public ProductEntity get(Long id) {
        return jdbcTemplate.query("SELECT * FROM Products WHERE id=?",
                new Object[]{id}, new ProductsMapper()).stream()
                .findAny().orElseThrow(RuntimeException::new);
    }
}
