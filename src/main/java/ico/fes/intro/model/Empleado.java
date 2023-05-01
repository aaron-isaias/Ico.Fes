package ico.fes.intro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Empleado {
    private int id;
    private double sueldo;
    private String departamento;
    private String Nombre;
    private String FechaNacimiento;
    
}
