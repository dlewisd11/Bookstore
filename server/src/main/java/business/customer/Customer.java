package business.customer;

import java.util.Date;

public class Customer {

    private final long customerId;
    private final String customerName;
    private final String address;
    private final String phone;
    private final String email;
    private final String ccNumber;
    private final Date ccExpDate;

    public Customer(long customerId, String customerName, String address, String phone, String email, String ccNumber, Date ccExpDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.ccNumber = ccNumber;
        this.ccExpDate = ccExpDate;
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() { return address; }

    public String getPhone() { return phone; }

    public String getEmail() { return email; }

    public String getCcNumber() { return ccNumber; }

    public Date getCcExpDate() { return ccExpDate; }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", ccNumber='" + ccNumber + '\'' +
                ", ccExpDate=" + ccExpDate +
                '}';
    }
}
