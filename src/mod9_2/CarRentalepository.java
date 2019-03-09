package mod9_2;

import java.time.LocalDateTime;

public class CarRentalepository implements RentalRepository {


    public void createCarRental(User user, LocalDateTime from, LocalDateTime to){
        System.out.println(user.getName()+" "+user.getLastName() +" is renting from: "+from.toString() + "to: "+to.toString());
    }

    @Override
    public boolean createRental(User user, LocalDateTime from, LocalDateTime to) {
        return false;
    }
}
