package mod9_2;

import java.time.LocalDateTime;

public interface RentalRepository {
    boolean createRental(User user, LocalDateTime from,LocalDateTime to);
}
