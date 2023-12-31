package lit.unichristus.edu.br.mssupportequipment.models;

import jakarta.persistence.*;
import lit.unichristus.edu.br.mssupportequipment.enums.SituationEnum;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "support_equipment")
public class SupportequipmentModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private Date createdDate;

    private boolean isDeleted;
    @Serial
    private static final long serialVersionUID = 1L;
//    --------------------------

    @Column(nullable = false, length = 30)
    private String description;
    @Column(nullable = false, length = 30)
    private String brand;

    @Column(nullable = false, length = 30)
    private String productModel;

    @Column(nullable = false, length = 30)
    private String serialNumber;

    @Column(nullable = false, length = 30)
    private String patrimony;

    @Column(nullable = false, length = 30)
    private SituationEnum situation;

    @Column(nullable = true, length = 30)
    private Integer amount;

    @Column(nullable = false, length = 30)
    private Date lastChange;

    @OneToOne(cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "room_id")
    private RoomModel room;

    @ManyToOne(cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name = "campus_id")
    private CampusModel campus;


    public SupportequipmentModel() {
    }

    public SupportequipmentModel(String description, String brand, String productModel, String serialNumber, String patrimony, SituationEnum situation, Integer amount, Date lastChange, RoomModel room, CampusModel campus) {
        this.description = description;
        this.brand = brand;
        this.productModel = productModel;
        this.serialNumber = serialNumber;
        this.patrimony = patrimony;
        this.situation = situation;
        this.amount = amount;
        this.lastChange = lastChange;
        this.room = room;
        this.campus = campus;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPatrimony() {
        return patrimony;
    }

    public void setPatrimony(String patrimony) {
        this.patrimony = patrimony;
    }

    public SituationEnum getSituation() {
        return situation;
    }

    public void setSituation(SituationEnum situation) {
        this.situation = situation;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getLastChange() {
        return lastChange;
    }

    public void setLastChange(Date lastChange) {
        this.lastChange = lastChange;
    }

    public RoomModel getRoom() {
        return room;
    }

    public void setRoom(RoomModel room) {
        this.room = room;
    }

    public CampusModel getCampus() {
        return campus;
    }

    public void setCampus(CampusModel campus) {
        this.campus = campus;
    }
}
