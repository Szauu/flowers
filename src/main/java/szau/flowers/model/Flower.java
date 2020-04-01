package szau.flowers.model;

import java.time.LocalDate;
import java.util.UUID;

public class Flower {

    private final UUID flowerId;
    private final String name;
    private final String kind;
    private final LocalDate purchaseDate;
    private final LocalDate wateringDate;
    private final Integer daysFromLastWatering;
    private final LocalDate nextWateringDate;

    public Flower(UUID flowerId, String name, String kind, LocalDate purchaseDate, LocalDate wateringDate, Integer daysFromLastWatering, LocalDate nextWateringDate) {
        this.flowerId = flowerId;
        this.name = name;
        this.kind = kind;
        this.purchaseDate = purchaseDate;
        this.wateringDate = wateringDate;
        this.daysFromLastWatering = daysFromLastWatering;
        this.nextWateringDate = nextWateringDate;
    }

    public UUID getFlowerId() {
        return flowerId;
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
                "uuid=" + flowerId +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", wateringDate=" + wateringDate +
                ", daysFromLastWatering=" + daysFromLastWatering +
                ", nextWateringDate=" + nextWateringDate +
                '}';
    }
}
