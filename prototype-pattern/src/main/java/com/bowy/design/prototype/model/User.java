package com.bowy.design.prototype.model;

/**
 * 用户
 *
 * @author xiongbw
 */
public class User implements Cloneable {

    /**
     * 年龄
     */
    private int age;

    /**
     * 姓名
     */
    private String name;

    /**
     * 地址
     */
    private Address address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    /**
     * 克隆
     *
     * @return 副本对象
     * @implNote 采用默认 {@link Object#clone()} 方法，实现浅拷贝。
     */
    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e.getMessage());
        }
    }

}
