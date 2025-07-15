package zairastra.u5w1d2.entities;

import lombok.*;
import zairastra.u5w1d2.entities.enums.Status;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Table {
    private int tableNumb;
    private int maxCover;
    private Status status;
}
