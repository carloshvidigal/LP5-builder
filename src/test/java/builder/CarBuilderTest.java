package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarBuilderTest {

    @Test
    void shouldGetExceptionForNamelessCar() {
        try {
            CarBuilder carBuilder = new CarBuilder();
            Car car = carBuilder
                    .setBrand("Fiat")
                    .setManufactureYear("2010")
                    .setBrandCountry("Italy")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void shouldGetExceptionForBrandlessCar() {
        try {
            CarBuilder carBuilder = new CarBuilder();
            Car car = carBuilder
                    .setName("Camaro")
                    .setManufactureYear("2014")
                    .setNumberPassengers(4)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Marca inválida", e.getMessage());
        }
    }

    @Test
    void shouldGetExceptionForCarWithoutManufactureYear() {
        try {
            CarBuilder carBuilder = new CarBuilder();
            Car car = carBuilder
                    .setName("Fusion")
                    .setBrand("Ford")
                    .setBrandCountry("EUA")
                    .setCategory("Sedan")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ano de fabricação inválido", e.getMessage());
        }
    }

    @Test
    void shouldGetValidCar() {
            CarBuilder carBuilder = new CarBuilder();
            Car car = carBuilder
                    .setName("Fox")
                    .setBrand("Volkswagen")
                    .setBrandCountry("Alemanha")
                    .setManufactureYear("2022")
                    .build();

            assertNotNull(car);
    }
}
