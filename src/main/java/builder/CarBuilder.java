package builder;

public class CarBuilder {

    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    public Car build() {
        if (car.getName().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (car.getBrand().equals("")) {
            throw new IllegalArgumentException("Marca inválida");
        }
        if (car.getManufactureYear().equals("")){
            throw new IllegalArgumentException("Ano de fabricação inválido");
        }
        return car;
    }

    public CarBuilder setName(String name) {
        car.setName(name);
        return this;
    }

    public CarBuilder setBrand(String brand) {
        car.setBrand(brand);
        return this;
    }

    public CarBuilder setManufactureYear(String manufactureYear) {
        car.setManufactureYear(manufactureYear);
        return this;
    }

    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    public CarBuilder setModelYear(String modelYear) {
        car.setModelYear(modelYear);
        return this;
    }

    public CarBuilder setReleaseYear(String releaseYear) {
        car.setReleaseYear(releaseYear);
        return this;
    }

    public CarBuilder setNumberPassengers(int numberPassengers) {
        car.setNumberPassengers(numberPassengers);
        return this;
    }

    public CarBuilder setBrandCountry(String brandCountry) {
        car.setBrandCountry(brandCountry);
        return this;
    }

    public CarBuilder setProductionCountry(String productionCountry) {
        car.setProductionCountry(productionCountry);
        return this;
    }

    public CarBuilder setChassis(String chassis) {
        car.setChassis(chassis);
        return this;
    }

    public CarBuilder setCategory(String category) {
        car.setCategory(category);
        return this;
    }












}
