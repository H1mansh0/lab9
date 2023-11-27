package ua.edu.ucu.apps.lab.user;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "appusers")
@ToString
public class AppUser {
    @Id
    private int id;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
    private int age;

    @Transient
    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
