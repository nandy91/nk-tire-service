package com.nanditha.nktireservice.web.model;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class TirePagedList extends PageImpl<TireDto> {
    public TirePagedList(List<TireDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public TirePagedList(List<TireDto> content) {
        super(content);
    }
}
