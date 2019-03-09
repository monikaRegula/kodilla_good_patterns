package mod9_2;

public class MailService implements InformationService {

    public void sendEmail(User user){
        System.out.println("Welcome "+user.getName() +" in car renting ! :)");
    }

    @Override
    public void inform(User user) {
        System.out.println("Welcome in renting cars");
    }
}
