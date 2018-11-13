package com.gofashion.gofashionspringcloudcommodityconsumer.pojo;

/**
 * 搜索商品的实体类
 *
 * @author scw
 */
public class GoodsSearch {
    private String catalog_name; // 类别
    private String price;  //价格
    private String sort;  //  排序类型
    private String queryString;  // 关键字
    private String description;// 描述
    private String type;// 类型

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getCatalog_name() {
        return catalog_name;
    }

    public void setCatalog_name(String catalog_name) {
        this.catalog_name = catalog_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
