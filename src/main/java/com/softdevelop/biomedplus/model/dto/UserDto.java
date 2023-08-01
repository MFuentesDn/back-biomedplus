package com.softdevelop.biomedplus.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserDto implements Serializable {

    private static final long serialVersionUID = 2909228228891829275L;

    private Long id;
    private String name;
    private String psw;
    private String email;
    private RolDto rol;
}
