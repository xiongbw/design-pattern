package com.bowy.design.pattern.prototype.model;

/**
 * 地址
 *
 * @author xiongbw
 */
public class Address implements Cloneable {

    /**
     * 城市
     */
    private String city;

    /**
     * 街道
     */
    private String street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    /**
     * 克隆
     *
     * @return 副本对象
     * @implNote 深拷贝
     */
    @Override
    public Address clone() {
        return new Address(this.city, this.street);
    }

}
