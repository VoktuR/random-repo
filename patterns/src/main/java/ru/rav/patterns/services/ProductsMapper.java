package ru.rav.patterns.services;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.rav.patterns.model.ProductEntity;

import java.sql.ResultSet;
import java.sql.SQLException;


@Component
public class ProductsMapper implements RowMapper<ProductEntity> {

    /**
     * Data Mapper pattern
     */

    @Override
    public ProductEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        return new ProductEntity()
                .setId(resultSet.getLong("id"))
                .setTitle(resultSet.getString("title"))
                .setCategory(resultSet.getString("category"))
                .setPrice(resultSet.getLong("price"));
    }

}
