import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor

public class Computer {
    private String ComputerModel;
    private int ComputerYear;
    private int ComputerPrice;
    Hard hard;
    Cpu cpu;

}
