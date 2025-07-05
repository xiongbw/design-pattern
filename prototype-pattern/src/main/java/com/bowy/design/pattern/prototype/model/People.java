package com.bowy.design.pattern.prototype.model;

/**
 * 人
 *
 * @author xiongbw
 */
public class People implements Cloneable {

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

    public People() {
    }

    public People(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    /**
     * 克隆
     *
     * @return 副本对象
     * @implNote 重写 {@link Object#clone()} 方法，实现深拷贝。
     */
    @Override
    public People clone() {
        // 对引用类型的 address 字段也调用 clone()
        Address clonedAddress = this.address != null ? this.address.clone() : null;
        return new People(this.age, this.name, clonedAddress);
    }

}
