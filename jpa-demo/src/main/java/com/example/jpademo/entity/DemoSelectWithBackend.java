package com.example.jpademo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * 下拉框选项列表
 */
@Data
@Entity
@Accessors(chain = true)
@Table(name = "low_code_demo.select_with_backend")
public class DemoSelectWithBackend {

    /**
     * 自增主键
     */
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value")
    private String value;

    @Column(name = "label")
    private String label;

}
