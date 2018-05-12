package com.springbootdev.examples.swagger.model.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class AddUserResponse implements Serializable {

    @JsonProperty("user_id")
    private Integer userId;

    private String username;

    @JsonProperty("created_on")
    private String createdOn;
}
