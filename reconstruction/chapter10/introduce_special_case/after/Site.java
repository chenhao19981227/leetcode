package reconstruction.chapter10.introduce_special_case.after;

import lombok.Data;

@Data
public class Site {
    Customer customer;

    public Customer getCustomer() {
        return this.customer == null ? new UnknownCustomer() : customer;
    }
}
