package com.design.picwanna.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * className: Test
 * description: TODO
 *
 * @author lh
 * @version 1.0
 * @date 18-10-15
 */

@Document(indexName = "ik_test", type = "fulltest")
@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class Test {
    @Id
    private Long id;

    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String content;
}
