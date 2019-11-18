package com.ewm.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private long id;
    private long customer_id;
    private int restaurant_id;
    private Date create_time;
    private short status;
    private long courier_id;
    private BigDecimal deli_cost;
    private BigDecimal total_cost;
    private Date finish_time;
    private short stars;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public int getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(int restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public long getCourier_id() {
        return courier_id;
    }

    public void setCourier_id(long courier_id) {
        this.courier_id = courier_id;
    }

    public BigDecimal getDeli_cost() {
        return deli_cost;
    }

    public void setDeli_cost(BigDecimal deli_cost) {
        this.deli_cost = deli_cost;
    }

    public BigDecimal getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(BigDecimal total_cost) {
        this.total_cost = total_cost;
    }

    public Date getFinish_time() {
        return finish_time;
    }

    public void setFinish_time(Date finish_time) {
        this.finish_time = finish_time;
    }

    public short getStars() {
        return stars;
    }

    public void setStars(short stars) {
        this.stars = stars;
    }
}
