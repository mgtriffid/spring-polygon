package com.mgtriffid.trash.polygon.spring.rest.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.time.Instant;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Объект с описанием электронного документа")
public class MyResponse {
    @ApiModelProperty("Идентификатор документа")
    private Long fileDocumentId;

    @ApiModelProperty("Идентификатор пользователя создавшего документ")
    private Long createUserId;

    @ApiModelProperty("Дата создания")
    private Instant createDate;

    @Nullable
    @ApiModelProperty("Идентификатор пользователя изменившего документ")
    private Long updateUserId;

    @Nullable
    @ApiModelProperty("Дата изменения")
    private Instant updateDate;

    @ApiModelProperty("Наименование документа")
    private String name;

    @Nullable
    @ApiModelProperty("Описание документа")
    private String description;

    @Nullable
    @ApiModelProperty("Исходное имя файла документа")
    private String fileName;

    @Nullable
    @ApiModelProperty("Идентификатор файла")
    private String fileUID;

/*  Тут нам не хватило типов, что за FileDocumentStatus? Неизвестно
    @ApiModelProperty("Статус документа")
    private FileDocumentStatus fileDocumentStatus;

    @ApiModelProperty("Тип документа")
    private FileDocumentType fileDocumentType;
*/

    @ApiModelProperty("Тип основной сущности")
    private String primaryEntityTypeId;

    @ApiModelProperty("Идентификатор основной сущности")
    private Long primaryEntityId;

    @Nullable
    @ApiModelProperty("Наименование шага процесса")
    private String taskName;

    @Nullable
    @ApiModelProperty("Размер файла в байтах")
    private Long fileSize;
/*
    Тоже не хватило типов
    @ApiModelProperty("Шаблон")
    private Template template;
*/

    @ApiModelProperty("Расширение файла")
    private String fileExtension;
}