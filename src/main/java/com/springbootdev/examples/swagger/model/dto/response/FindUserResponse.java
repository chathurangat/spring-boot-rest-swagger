package com.springbootdev.examples.swagger.model.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Builder
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class FindUserResponse implements Serializable
{
    @JsonProperty("user_id")
    private Integer userId;
    private String name;
    private String username;
}
