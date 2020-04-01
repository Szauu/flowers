package szau.flowers.model;

import java.time.LocalDate;
import java.util.UUID;

public class Flower {

    private final UUID uuid;
    private final String name;
    private final String kind;
    private final LocalDate purchaseDate;
    private final LocalDate wateringDate;
    private final Integer daysFromLastWatering;
    private final LocalDate nextWateringDate;

    public Flower(UUID uuid, String name, String kind, LocalDate purchaseDate, LocalDate wateringDate, Integer daysFromLastWatering, LocalDate nextWateringDate) {
        this.uuid = uuid;
        this.name = name;
        this.kind = kind;
        this.purchaseDate = purchaseDate;
        this.wateringDate = wateringDate;
        this.daysFromLastWatering = daysFromLastWatering;
        this.nextWateringDate = nextWateringDate;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public LocalDate getWateringDate() {
        return wateringDate;
    }

    public Integer getDaysFromLastWatering() {
        return daysFromLastWatering;
    }

    public LocalDate getNextWateringDate() {
        return nextWateringDate;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", wateringDate=" + wateringDate +
                ", daysFromLastWatering=" + daysFromLastWatering +
                ", nextWateringDate=" + nextWateringDate +
                '}';
    }
}
