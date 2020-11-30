package com.safa.springboot.api.doc.Swagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "My Pet object", description = "My Pet")
public class Pet {

    @ApiModelProperty(value = "id for Pet object")
    private int id;

    @ApiModelProperty(value = "name for Pet object")
    private String name;

    @ApiModelProperty(value = "date for Pet object")
    private Date date;
}
