package mod9_2;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {

        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(
                new MailService(),new CarRentalService(), new CarRentalepository());

        User user = new User("John","Galecki");

        LocalDateTime rentFrom = LocalDateTime.of(2017,8,1,12,0);
        LocalDateTime rentTo = LocalDateTime.of(2017,8,10,12,0);

        CarRentalService carRentalService = new CarRentalService();
        boolean isRented = carRentalService.rent(user,rentFrom,rentTo);

        MailService mailService = new MailService();
        CarRentalepository carRentalepository = new CarRentalepository();

        if (isRented){
            mailService.sendEmail(user);
            carRentalepository.createCarRental(user,rentFrom,rentTo);
        }else{
            System.out.println("Car rent has been rejected!");
        }


    }
}
