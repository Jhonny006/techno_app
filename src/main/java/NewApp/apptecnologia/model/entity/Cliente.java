package NewApp.apptecnologia.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "clientes")
@NoArgsConstructor
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "id_cliente", nullable = false)
    private Integer idCliente;

    @Column (nullable = false, length = 60)
    private String nombre;

    @Column (nullable = false, length = 50)
    private String email;

    @Column (nullable = false, length = 20)
    private String telefono;

    @Column ( length = 100)
    private String direccion;
}
