package com.giray.entity;
import com.giray.utility.enums.EBranslar;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_doktor")
public class Doktor { // branþý olur
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    Long id;
    EBranslar branslar;
    String ad;
    String adres;
    String telefon;
    Integer yas;

}
