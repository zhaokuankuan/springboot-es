package com.kk.repository;


import com.kk.domain.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * dao操作层
 * @author :Mr.kk
 * @date: 2019/9/18 16:36
 */
public interface PersonRepository extends ElasticsearchRepository<Person,Integer> {
}
