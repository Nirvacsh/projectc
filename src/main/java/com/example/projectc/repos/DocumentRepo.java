package com.example.projectc.repos;

import com.example.projectc.domain.Document;
import org.springframework.data.repository.CrudRepository;

public interface DocumentRepo extends CrudRepository<Document,Long> {
}
