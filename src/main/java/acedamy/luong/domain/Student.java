package acedamy.luong.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class Student implements Serializable {

    private String name;
    private Date birthday;

    @Override
    public String toString() {
        return name + "|" + birthday;
    }
}
