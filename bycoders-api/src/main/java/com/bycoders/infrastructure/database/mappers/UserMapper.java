package com.bycoders.infrastructure.database.mappers;

import com.bycoders.domain.entities.IUser;
import com.bycoders.domain.entities.implementations.enummeration.UserEnum;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserMapper implements IUser {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, unique = true, nullable = false)
    private UUID id;

    private String name;

    @Enumerated(EnumType.STRING)
    private UserEnum type;
}


