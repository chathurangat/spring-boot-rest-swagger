package com.springbootdev.examples.swagger.service;

import com.springbootdev.examples.swagger.exception.PersistentException;

public interface GenericService<RQ,RS> {

    RS create(RQ rq) throws PersistentException;
}
