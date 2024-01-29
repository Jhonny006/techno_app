package NewApp.apptecnologia.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "productos")
@NoArgsConstructor
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_producto", nullable = false)
    private Integer idProducto;

    @Column (nullable = false, length = 30)
    private String nombre;

    @Column (nullable = false, length = 30)
    private String marca;

    @Column(name = "precio_venta", nullable = false, columnDefinition = "Decimal(5, 2")
    private Integer precioVenta;

    @Column(name = "codigo_barra", nullable = false, columnDefinition = "Decimal(5, 2")
    private Integer codigoBarra;

    @Column(name ="cantidad", nullable = false, columnDefinition = "Decimal(5, 2)")
    private Integer cantidad;


}
