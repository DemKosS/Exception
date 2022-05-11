package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductRepositoryTest {
    private ProductRepository repository = new ProductRepository();
    private Product product = new Product(1, "Samsung", 1000);
    private Product product2 = new Product(2, "Apple", 100000);
    private Product product3 = new Product(3, "Huawei", 50000);

    @BeforeEach
    public void setUp() {
        repository.save(product);
        repository.save(product2);
        repository.save(product3);

    }

    @Test
    public void shouldThrowException() {
        int id = 4;
        assertThrows(NotFoundException.class, () -> repository.removeById(id));
    }

    @Test
    public void shouldThrowException1() {
        int id = 3;
        repository.removeById(id);
        Product[] expected = new Product[]{product, product2};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);

    }
}
