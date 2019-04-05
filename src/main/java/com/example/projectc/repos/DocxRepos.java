package com.example.projectc.repos;

import com.example.projectc.domain.DocxContext;
import org.springframework.data.repository.CrudRepository;

public interface DocxRepos extends CrudRepository<DocxContext, Long> {
}
