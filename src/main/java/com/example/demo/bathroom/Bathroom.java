package com.example.demo.bathroom;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Bathroom {
    @Id
    @SequenceGenerator(
            name = "bathroom_sequence",
            sequenceName = "bathroom_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    private Long id;
    private String address;
    private String description;
    private LocalDate dateAdded;

    private Double lat;

    private Double lng;

    private Integer rating;

    private String status;

    private LocalDate lastUpdated;



    public Bathroom() {
    }

    public Bathroom(Long id, String address, String description, LocalDate dateAdded, Double lat, Double lng, Integer rating, String status, LocalDate lastUpdated) {
        this.id = id;
        this.address = address;
        this.description = description;
        this.dateAdded = dateAdded;
        this.lat = lat;
        this.lng = lng;
        this.rating = rating;
        this.status = status;
        this.lastUpdated =lastUpdated;
    }


    public Bathroom(String address, String description, LocalDate dateAdded, Double lat, Double lng, Integer rating, String status, LocalDate lastUpdated) {
        this.address = address;
        this.description = description;
        this.dateAdded = dateAdded;
        this.lat = lat;
        this.lng = lng;
        this.rating = rating;
        this.status = status;
        this.lastUpdated =lastUpdated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }


    public Double getLat() { return lat; }
    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() { return lng; }
    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Integer getRating() { return rating; }
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    @Override
    public String toString() {
        return "Bathroom{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", dateAdded=" + dateAdded +
                ", lat=" + lat +
                ", lng=" + lng +
                ", rating=" + rating +
                ", status='" + status + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
        }
}

