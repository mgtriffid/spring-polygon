package com.mgtriffid.trash.polygon.spring.rest.dto;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Объект с описанием электронного документа РЕКВЕСТ")
public class MyRequest {
    private String someField;
}
