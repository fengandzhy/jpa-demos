package org.frank.jpa.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity //声明实体类
@Table(name = "cst_customer") //建立实体类和表的映射关系
public class Customer implements Serializable {

    @Id//声明当前私有属性为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //配置主键的生成策略
    @Column(name = "cust_id") //指定和表中cust_id字段的映射关系
    private Long customerId;
    
    @Column(name = "cust_name") //指定和表中cust_name字段的映射关系
    private String customerName;

    @Column(name = "cust_source")//指定和表中cust_source字段的映射关系
    private String customerSource;

    @Column(name = "cust_industry")//指定和表中cust_industry字段的映射关系
    private String customerIndustry;

    @Column(name = "cust_level")//指定和表中cust_level字段的映射关系
    private String customerLevel;

    @Column(name = "cust_address")//指定和表中cust_address字段的映射关系
    private String customerAddress;

    @Column(name = "cust_phone")//指定和表中cust_phone字段的映射关系
    private String customerPhone;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSource() {
        return customerSource;
    }

    public void setCustomerSource(String customerSource) {
        this.customerSource = customerSource;
    }

    public String getCustomerIndustry() {
        return customerIndustry;
    }

    public void setCustomerIndustry(String customerIndustry) {
        this.customerIndustry = customerIndustry;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
