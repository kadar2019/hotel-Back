package simplon.co.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import simplon.co.dao.CityRepository;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Hotel implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String city;
    private double price;
    private String description;
    private boolean promotion;
    private boolean selected;
    private boolean available;
    private String photoName;
    @Transient
    private int quantity;




}
