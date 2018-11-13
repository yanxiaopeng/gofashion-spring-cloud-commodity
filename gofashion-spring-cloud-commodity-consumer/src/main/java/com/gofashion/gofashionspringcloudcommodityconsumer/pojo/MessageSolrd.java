package com.gofashion.gofashionspringcloudcommodityconsumer.pojo;

/**
 * solr查询条件
 */
public class MessageSolrd {
    private String catalog_name; //类别
    private String price;//价格
    private String sort;  //排序类型
    private String queryString;  //关键字
    private String type;//商品类别
    private String seller;//商家

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }


}
