package certificate.training.java809.question062;

import java.util.Optional;

public class Employee {

    Optional<Address> address;

    public Employee(Optional<Address> address) {
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return address;
    }
    
}
