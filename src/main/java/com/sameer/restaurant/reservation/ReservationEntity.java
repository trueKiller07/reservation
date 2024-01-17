package com.sameer.restaurant.reservation;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="reservation")
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDateTime date;

    @Column(name="user_id")
    private Long userId;

    @Column(name="restaurant_id")
    private Long restaurantId;

    // Hibernate will convert camel case column names to snake case!!!
    // Don't use camelcase columns in DB
    @Column(name="party_size")
    private int partySize;

    public ReservationEntity() {}

    public ReservationEntity(Long userId, int partySize, LocalDateTime date, Long restaurantId) {
        super();
        this.userId = userId;
        this.partySize = partySize;
        this.date = date;
        this.restaurantId = restaurantId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getPartySize() {
        return partySize;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

}
