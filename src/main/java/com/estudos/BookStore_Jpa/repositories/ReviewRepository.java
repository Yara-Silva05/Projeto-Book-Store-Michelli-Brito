package com.estudos.BookStore_Jpa.repositories;

import com.estudos.BookStore_Jpa.models.ReviewModel;
import com.fasterxml.jackson.annotation.JacksonAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<ReviewModel, UUID> {
}
