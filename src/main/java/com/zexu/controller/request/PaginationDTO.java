package com.zexu.controller.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaginationDTO {
    //当前页码
    private Integer currentPage;

    //每页显示的记录数
    private Integer pageSize;

    //总记录数
    private Integer total;
}
