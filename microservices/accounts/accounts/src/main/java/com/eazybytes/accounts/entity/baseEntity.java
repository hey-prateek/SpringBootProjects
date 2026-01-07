package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter @Setter @ToString
@EntityListeners(AuditingEntityListener.class) //Registers AuditingEntityListener with a JPA entity so Spring Data JPA can automatically populate auditing fields like @CreatedDate, @LastModifiedDate, @CreatedBy, @LastModifiedBy during persist and update operations.
public class baseEntity {

    @CreatedDate //pre-defined annotation to fill this date automatically, not required to be put manually by us
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @CreatedBy //similar to @CreatedDate annotation
    @Column(updatable = false)
    private String createdBy;

    @LastModifiedDate //similar to @CreatedDate annotation
    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @LastModifiedBy //similar to @CreatedDate annotation
    @Column(insertable = false)
    private String updatedBy;
}
