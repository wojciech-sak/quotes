package com.kodilla.quotes.repository;

import com.kodilla.quotes.model.Quote;
import org.springframework.data.repository.CrudRepository;

public interface QuoteRepository extends CrudRepository<Quote, Long> {

}
