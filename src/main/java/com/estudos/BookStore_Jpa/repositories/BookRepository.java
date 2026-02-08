package com.estudos.BookStore_Jpa.repositories;

import com.estudos.BookStore_Jpa.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BookRepository extends JpaRepository<BookModel, UUID> {

    BookModel findBookModelByTitle(String title);

    List<BookModel> findBooksByPublisher_Id(UUID id);
}
