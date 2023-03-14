package abcode.carrevamp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarImage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private CarEntity car;

    @Lob                  // @Lob is used to store large data in database (like image), this will store the image in binary format
    private String base64;

    private String contentType;
}
