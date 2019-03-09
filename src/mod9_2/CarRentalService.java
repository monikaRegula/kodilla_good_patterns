package mod9_2;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService {

    public boolean rent(final User user, final LocalDateTime carRentForm, final LocalDateTime carRentTo ){
        System.out.println("Renting car for :" + user.getName() + " "+user.getLastName()+ "from:"+carRentForm.toString() + " to:"+carRentTo.toString());
        return true;
    }
}
