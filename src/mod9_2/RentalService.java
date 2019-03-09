package mod9_2;

import java.time.LocalDateTime;

public interface RentalService {

     boolean rent(User user, LocalDateTime from, LocalDateTime to);
}
