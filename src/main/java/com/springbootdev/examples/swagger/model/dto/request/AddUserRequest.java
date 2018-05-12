package com.springbootdev.examples.swagger.model.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@ApiModel(value = "UserRequest")
public class AddUserRequest implements Serializable {

    @NotNull(message = "Name is required")
    @ApiModelProperty(notes = "Name of the user")
    private String name;

    @NotNull(message = "Username is required")
    @ApiModelProperty(notes = "Username of the user")
    private String username;

    @NotNull(message = "Password is required")
    @ApiModelProperty(notes = "Password of the user")
    private String password;
}
