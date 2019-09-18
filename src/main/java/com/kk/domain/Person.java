package com.kk.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author :Mr.kk
 * @date: 2019/9/18 16:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "person",type = "person")
public class Person {

    @Id
    private Integer id;

    private String name;

    private Integer age;
}
