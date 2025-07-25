package lk.cpa.intern.test.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactResponse implements Serializable {
    private Long _id;
    private String name;
    private String email;
    private String gender;
    private String number;


}
