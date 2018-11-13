package com.gofashion.gofashionspringcloudcommodityproducer.service;

import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;

public interface CommodityShowservice {
    //solr更新数据
    String upsolr() throws IOException, SolrServerException;
}
