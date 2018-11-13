package com.gofashion.gofashionspringcloudcommodityproducer.pojo;

/**
 * 商品实体
 *
 * @author scw
 */
public class GoodsModel {

    // 商品id
    private String id;

    // 商品标题
    private String gskuspec_headline;

    //商品名称
    private String gskuspec_name;

    //商品图片
    private String gspubrand_picture;

    //商品一级分类
    private String gspsecondgrade_name;

    //商品二级分类
    private String gspufirstgrade_name;

    //商品品牌名称
    private String gspubrand_name;

    //商品价格
    private String gskuspec_price;

    public String getGskuspec_price() {
        return gskuspec_price;
    }

    public void setGskuspec_price(String gskuspec_price) {
        this.gskuspec_price = gskuspec_price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGskuspec_headline() {
        return gskuspec_headline;
    }

    public void setGskuspec_headline(String gskuspec_headline) {
        this.gskuspec_headline = gskuspec_headline;
    }

    public String getGskuspec_name() {
        return gskuspec_name;
    }

    public void setGskuspec_name(String gskuspec_name) {
        this.gskuspec_name = gskuspec_name;
    }

    public String getGspubrand_picture() {
        return gspubrand_picture;
    }

    public void setGspubrand_picture(String gspubrand_picture) {
        this.gspubrand_picture = gspubrand_picture;
    }

    public String getGspsecondgrade_name() {
        return gspsecondgrade_name;
    }

    public void setGspsecondgrade_name(String gspsecondgrade_name) {
        this.gspsecondgrade_name = gspsecondgrade_name;
    }

    public String getGspufirstgrade_name() {
        return gspufirstgrade_name;
    }

    public void setGspufirstgrade_name(String gspufirstgrade_name) {
        this.gspufirstgrade_name = gspufirstgrade_name;
    }

    public String getGspubrand_name() {
        return gspubrand_name;
    }

    public void setGspubrand_name(String gspubrand_name) {
        this.gspubrand_name = gspubrand_name;
    }
}
