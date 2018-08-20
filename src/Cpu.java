import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor

public class Cpu {
    private String CPUtype;
    private int CPUCores;
    private double CPUHerc;
    private String CPUContry;
}
