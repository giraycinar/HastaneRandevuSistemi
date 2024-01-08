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
@Table(name = "tbl_hasta")
public class Hasta { // randevularý olur
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
// doktorun hastasý
    Long id;
    @Column(name = "doktor_id")
    Long doktorId;
    String ad;
    String adres;
    String telefon;
    Integer yas;

}
