package com.estudos.BookStore_Jpa.repositories;

import com.estudos.BookStore_Jpa.models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PublisherRepository extends JpaRepository<PublisherModel, UUID> {
}
