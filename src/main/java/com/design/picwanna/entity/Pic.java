//package com.design.picwanna.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;
//import org.springframework.data.elasticsearch.annotations.Field;
//import org.springframework.data.elasticsearch.annotations.FieldType;
//
//import java.util.Date;
//import java.util.List;
//
///**
// * className: Pic
// * description: TODO
// *
// * @author lh
// * @version 1.0
// * @date 18-10-12
// */
//@Document(indexName = "picwanna", type = "pic")
//@Data
//@Slf4j
//@NoArgsConstructor
//@AllArgsConstructor
//public class Pic {
//    @Id
//    private Long id;
//
//    @Field(type = FieldType.Text)
//    private String userId;
//
//    @Field(type = FieldType.Text)
//    private String pic;
//
//    @Field(type = FieldType.Text)
//    private String description;
//
//    /**
//     *es里Date是UTC格式
//     */
//    @Field(type = FieldType.Date)
//    private Date publicTime;
//
//    /**
//     *访问量
//     */
//    @Field(type = FieldType.Long)
//    private Long hits;
//
//    /**
//     *点赞数
//     */
//    @Field(type = FieldType.Long)
//    private Long agree;
//
//    /**
//     *踩数
//     */
//    @Field(type = FieldType.Long)
//    private Long disagree;
//
//    /**
//     *喜欢即收藏量
//     */
//    @Field(type = FieldType.Long)
//    private Long like;
//
//    /**
//     *图片标签
//     */
//    @Field(type = FieldType.Text)
//    private String[] tags;
//}
