package com.example.Rest;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    private Integer studentId;
    @Column
    private String studentName;
    @Column
    private String studentLastname;
    @Column
    private String major;
    @Column
    private String studentYear;
}