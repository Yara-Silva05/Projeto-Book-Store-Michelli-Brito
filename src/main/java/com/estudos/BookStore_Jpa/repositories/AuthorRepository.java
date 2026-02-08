package com.estudos.BookStore_Jpa.repositories;

import com.estudos.BookStore_Jpa.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository <AuthorModel, UUID>{


}
