package ru.rav.patterns.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class ProductEntity {

    private Long id;

    private String title;

    private String category;

    private long price;

}
