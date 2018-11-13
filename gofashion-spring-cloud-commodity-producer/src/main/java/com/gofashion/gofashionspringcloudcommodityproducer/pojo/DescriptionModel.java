package com.gofashion.gofashionspringcloudcommodityproducer.pojo;

/**
 * 详情实体类
 */
public class DescriptionModel {

    //商家id
    private Integer gsseller_id;
    //商家名称
    private String gsseller_name;
    //商家地址
    private  String gsseller_address;
    //商品详情id
    private Integer goodsskuabv_id;
    //详情图片
    private  String goodsskuabv_picture;
    //屏幕尺寸
    private String  goodsskuabv_screensize;
    //分辨率
    private String goodsskuabv_resolutionratio;
    //电视类型
    private  String goodsskuabv_typetv;
    //价格
    private  Double goodsskuabv_price;
    //库存
    private Integer goodsskuabv_inventory;
    //标题
    private  String gskuspec_headline;

    public String getGskuspec_headline() {
        return gskuspec_headline;
    }

    public void setGskuspec_headline(String gskuspec_headline) {
        this.gskuspec_headline = gskuspec_headline;
    }

    public Integer getGsseller_id() {
        return gsseller_id;
    }

    public void setGsseller_id(Integer gsseller_id) {
        this.gsseller_id = gsseller_id;
    }

    public Integer getGoodsskuabv_id() {
        return goodsskuabv_id;
    }

    public void setGoodsskuabv_id(Integer goodsskuabv_id) {
        this.goodsskuabv_id = goodsskuabv_id;
    }

    public String getGsseller_name() {
        return gsseller_name;
    }

    public void setGsseller_name(String gsseller_name) {
        this.gsseller_name = gsseller_name;
    }

    public String getGsseller_address() {
        return gsseller_address;
    }

    public void setGsseller_address(String gsseller_address) {
        this.gsseller_address = gsseller_address;
    }

    public String getGoodsskuabv_picture() {
        return goodsskuabv_picture;
    }

    public void setGoodsskuabv_picture(String goodsskuabv_picture) {
        this.goodsskuabv_picture = goodsskuabv_picture;
    }

    public String getGoodsskuabv_screensize() {
        return goodsskuabv_screensize;
    }

    public void setGoodsskuabv_screensize(String goodsskuabv_screensize) {
        this.goodsskuabv_screensize = goodsskuabv_screensize;
    }

    public String getGoodsskuabv_resolutionratio() {
        return goodsskuabv_resolutionratio;
    }

    public void setGoodsskuabv_resolutionratio(String goodsskuabv_resolutionratio) {
        this.goodsskuabv_resolutionratio = goodsskuabv_resolutionratio;
    }

    public String getGoodsskuabv_typetv() {
        return goodsskuabv_typetv;
    }

    public void setGoodsskuabv_typetv(String goodsskuabv_typetv) {
        this.goodsskuabv_typetv = goodsskuabv_typetv;
    }

    public Double getGoodsskuabv_price() {
        return goodsskuabv_price;
    }

    public void setGoodsskuabv_price(Double goodsskuabv_price) {
        this.goodsskuabv_price = goodsskuabv_price;
    }

    public Integer getGoodsskuabv_inventory() {
        return goodsskuabv_inventory;
    }

    public void setGoodsskuabv_inventory(Integer goodsskuabv_inventory) {
        this.goodsskuabv_inventory = goodsskuabv_inventory;
    }
}
