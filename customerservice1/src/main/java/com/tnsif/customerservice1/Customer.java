package com.tnsif.customerservice1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // id auto generate aagum
    private Integer c_id;

    private String c_name;
    private String address;
    private String email;    // new field
    private String phone;    // new field

    // Constructor
    public Customer() {}

    public Customer(Integer c_id, String c_name, String address, String email, String phone) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    // getters and setters
    public Integer getC_id() { return c_id; }
    public void setC_id(Integer c_id) { this.c_id = c_id; }

    public String getC_name() { return c_name; }
    public void setC_name(String c_name) { this.c_name = c_name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", address=" + address + ", email=" + email + ", phone=" + phone + "]";
    }
}