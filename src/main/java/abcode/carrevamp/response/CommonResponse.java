package abcode.carrevamp.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> { // T

    private String status;
    private String message;
    private T datas;  // T is a generic type that can be any type of object
}
