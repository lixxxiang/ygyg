package com.example.lixiang.dailypic2_android.model.entity;

import java.util.List;

/**
 * Created by lixiang on 2018/1/4.
 */

public class HomePageSlide {

    /**
     * data : [{"dataType":"3","imageUrl":"http://202.111.178.10:28085/upload/image/201712110916000406400_image.png","link":"masterIndex.html?status=1"},{"dataType":"3","imageUrl":"http://202.111.178.10:28085/upload/image/201712051139000387758_image.png","link":"orderData.html","productId":"JL103B_MSS_20171006162735_100002453_101_001_L1B_MSS"},{"dataType":"3","imageUrl":"http://202.111.178.10:28085/upload/image/201712051132000457001_image.png","link":"masterIndex.html?status=2","productId":"JL101A_PMS_20170101164550_000017266_204_0013_001_L1_PAN"},{"dataType":"3","imageUrl":"http://202.111.178.10:28085/upload/image/201711222300000097689_image.png","link":"http://mall.charmingglobe.com/"}]
     * message : success
     * status : 200
     */

    private String message;
    private int status;
    private List<DataBean> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * dataType : 3
         * imageUrl : http://202.111.178.10:28085/upload/image/201712110916000406400_image.png
         * link : masterIndex.html?status=1
         * productId : JL103B_MSS_20171006162735_100002453_101_001_L1B_MSS
         */

        private String dataType;
        private String imageUrl;
        private String link;
        private String productId;

        public String getDataType() {
            return dataType;
        }

        public void setDataType(String dataType) {
            this.dataType = dataType;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }
    }
}
