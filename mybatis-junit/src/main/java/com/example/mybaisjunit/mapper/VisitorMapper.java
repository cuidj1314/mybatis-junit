package com.example.mybaisjunit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybaisjunit.domain.VisitorDo;
import com.example.mybaisjunit.model.VisitorListQuery;

import java.util.List;

public interface VisitorMapper extends BaseMapper<VisitorDo> {

    List<VisitorDo> insertQuery(VisitorListQuery query);
}
