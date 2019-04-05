package com.idyoga.yoga.model;

import java.util.List;

/**
 * Created by domain on 2018-03-23.
 * Email:sunlongyue@foxmail.com
 * describe:
 */

public class ExprienceAppointmentInfoBean {

    /**
     * code : 1
     * msg : 操作成功
     * time : 1522487750
     * data : {"shopInfo":{"id":63684083,"name":"广州","address":"123","logopath":"http://testyogabook.hq-xl.com/static/images/logo/shop_1455076031.png","hotline":"123","merid":0,"payinfos_id":33,"mobile":"13500000000","is_for_platform":0,"chain_id":214,"longitude":"0.0000000","latitude":"0.0000000","province":1,"city":17,"area":4},"userInfo":{"id":11379,"name":"domain","ui_id":11574,"mobile":"13097340262","sex":1,"nickname":"domain","is_deleted":0,"headpicUrl":null,"openid":null},"courseAppList":[],"courseDetail":{"id":4325,"shop_id":63684083,"parent_shop_id":84172561,"lesson_id":377,"start_time":1526961600,"end_time":1526965200,"classroom_id":201,"number":10,"create_time":1521453274,"update_time":1521453274,"is_deleted":0,"cancel_use_time":0,"course_color":null,"limit_number":0,"limit_cencel_time":0,"is_pay":2,"price":"1000.00","is_recommend":0,"appointment_limit_time":0,"start":1526961600,"end":1526965200,"lessonName":"头痛缓解瑜伽","lessonId":377,"lessonTime":60,"lessonImg":"","introduce":"五官系列","lessonContent":"","classroomName":"私教课室","classroomId":201,"allAppNum":0,"appFromYueKeNum":0,"appFromQuanYiNum":0,"tutorList":[{"id":246,"name":"夏老师"}],"isExpired":0,"quanYiIsFull":1,"quanYiCanAppNum":0,"yueKeCanAppNum":10},"usingMembership":[{"shopId":63684083,"shopName":"广州","shopLogopath":"http://testyogabook.hq-xl.com/static/images/logo/shop_1455076031.png","membership":[{"membershipId":2208,"categoryId":1,"categoryName":"期限卡","status":0,"cardName":"广州深圳一年卡","expireTime":1553914980,"startTime":1522378980,"hasTerm":12,"hasTime":0,"validTime":0,"price":"0.01","isChain":1},{"membershipId":2207,"categoryId":2,"categoryName":"次卡","status":0,"cardName":"广州深圳通用20次卡","expireTime":1527648360,"startTime":1522377960,"hasTerm":2,"hasTime":20,"validTime":19,"price":"0.01","isChain":1}]}]}
     */

    private String code;
    private String msg;
    private String time;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * shopInfo : {"id":63684083,"name":"广州","address":"123","logopath":"http://testyogabook.hq-xl.com/static/images/logo/shop_1455076031.png","hotline":"123","merid":0,"payinfos_id":33,"mobile":"13500000000","is_for_platform":0,"chain_id":214,"longitude":"0.0000000","latitude":"0.0000000","province":1,"city":17,"area":4}
         * userInfo : {"id":11379,"name":"domain","ui_id":11574,"mobile":"13097340262","sex":1,"nickname":"domain","is_deleted":0,"headpicUrl":null,"openid":null}
         * courseAppList : []
         * courseDetail : {"id":4325,"shop_id":63684083,"parent_shop_id":84172561,"lesson_id":377,"start_time":1526961600,"end_time":1526965200,"classroom_id":201,"number":10,"create_time":1521453274,"update_time":1521453274,"is_deleted":0,"cancel_use_time":0,"course_color":null,"limit_number":0,"limit_cencel_time":0,"is_pay":2,"price":"1000.00","is_recommend":0,"appointment_limit_time":0,"start":1526961600,"end":1526965200,"lessonName":"头痛缓解瑜伽","lessonId":377,"lessonTime":60,"lessonImg":"","introduce":"五官系列","lessonContent":"","classroomName":"私教课室","classroomId":201,"allAppNum":0,"appFromYueKeNum":0,"appFromQuanYiNum":0,"tutorList":[{"id":246,"name":"夏老师"}],"isExpired":0,"quanYiIsFull":1,"quanYiCanAppNum":0,"yueKeCanAppNum":10}
         * usingMembership : [{"shopId":63684083,"shopName":"广州","shopLogopath":"http://testyogabook.hq-xl.com/static/images/logo/shop_1455076031.png","membership":[{"membershipId":2208,"categoryId":1,"categoryName":"期限卡","status":0,"cardName":"广州深圳一年卡","expireTime":1553914980,"startTime":1522378980,"hasTerm":12,"hasTime":0,"validTime":0,"price":"0.01","isChain":1},{"membershipId":2207,"categoryId":2,"categoryName":"次卡","status":0,"cardName":"广州深圳通用20次卡","expireTime":1527648360,"startTime":1522377960,"hasTerm":2,"hasTime":20,"validTime":19,"price":"0.01","isChain":1}]}]
         */

        private ShopInfoBean shopInfo;
        private UserInfoBean userInfo;
        private CourseDetailBean courseDetail;
        private List<?> courseAppList;
        private List<UsingMembershipBean> usingMembership;

        public ShopInfoBean getShopInfo() {
            return shopInfo;
        }

        public void setShopInfo(ShopInfoBean shopInfo) {
            this.shopInfo = shopInfo;
        }

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public CourseDetailBean getCourseDetail() {
            return courseDetail;
        }

        public void setCourseDetail(CourseDetailBean courseDetail) {
            this.courseDetail = courseDetail;
        }

        public List<?> getCourseAppList() {
            return courseAppList;
        }

        public void setCourseAppList(List<?> courseAppList) {
            this.courseAppList = courseAppList;
        }

        public List<UsingMembershipBean> getUsingMembership() {
            return usingMembership;
        }

        public void setUsingMembership(List<UsingMembershipBean> usingMembership) {
            this.usingMembership = usingMembership;
        }

        public static class ShopInfoBean {
            /**
             * id : 63684083
             * name : 广州
             * address : 123
             * logopath : http://testyogabook.hq-xl.com/static/images/logo/shop_1455076031.png
             * hotline : 123
             * merid : 0
             * payinfos_id : 33
             * mobile : 13500000000
             * is_for_platform : 0
             * chain_id : 214
             * longitude : 0.0000000
             * latitude : 0.0000000
             * province : 1
             * city : 17
             * area : 4
             */

            private int id;
            private String name;
            private String address;
            private String logopath;
            private String hotline;
            private int merid;
            private int payinfos_id;
            private String mobile;
            private int is_for_platform;
            private int chain_id;
            private String longitude;
            private String latitude;
            private int province;
            private int city;
            private int area;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getLogopath() {
                return logopath;
            }

            public void setLogopath(String logopath) {
                this.logopath = logopath;
            }

            public String getHotline() {
                return hotline;
            }

            public void setHotline(String hotline) {
                this.hotline = hotline;
            }

            public int getMerid() {
                return merid;
            }

            public void setMerid(int merid) {
                this.merid = merid;
            }

            public int getPayinfos_id() {
                return payinfos_id;
            }

            public void setPayinfos_id(int payinfos_id) {
                this.payinfos_id = payinfos_id;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public int getIs_for_platform() {
                return is_for_platform;
            }

            public void setIs_for_platform(int is_for_platform) {
                this.is_for_platform = is_for_platform;
            }

            public int getChain_id() {
                return chain_id;
            }

            public void setChain_id(int chain_id) {
                this.chain_id = chain_id;
            }

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            public int getProvince() {
                return province;
            }

            public void setProvince(int province) {
                this.province = province;
            }

            public int getCity() {
                return city;
            }

            public void setCity(int city) {
                this.city = city;
            }

            public int getArea() {
                return area;
            }

            public void setArea(int area) {
                this.area = area;
            }
        }

        public static class UserInfoBean {
            /**
             * id : 11379
             * name : domain
             * ui_id : 11574
             * mobile : 13097340262
             * sex : 1
             * nickname : domain
             * is_deleted : 0
             * headpicUrl : null
             * openid : null
             */

            private int id;
            private String name;
            private int ui_id;
            private String mobile;
            private int sex;
            private String nickname;
            private int is_deleted;
            private String headpicUrl;
            private String openid;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getUi_id() {
                return ui_id;
            }

            public void setUi_id(int ui_id) {
                this.ui_id = ui_id;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public int getIs_deleted() {
                return is_deleted;
            }

            public void setIs_deleted(int is_deleted) {
                this.is_deleted = is_deleted;
            }

            public String getHeadpicUrl() {
                return headpicUrl;
            }

            public void setHeadpicUrl(String headpicUrl) {
                this.headpicUrl = headpicUrl;
            }

            public String getOpenid() {
                return openid;
            }

            public void setOpenid(String openid) {
                this.openid = openid;
            }
        }

        public static class CourseDetailBean {
            /**
             * id : 4325
             * shop_id : 63684083
             * parent_shop_id : 84172561
             * lesson_id : 377
             * start_time : 1526961600
             * end_time : 1526965200
             * classroom_id : 201
             * number : 10
             * create_time : 1521453274
             * update_time : 1521453274
             * is_deleted : 0
             * cancel_use_time : 0
             * course_color : null
             * limit_number : 0
             * limit_cencel_time : 0
             * is_pay : 2
             * price : 1000.00
             * is_recommend : 0
             * appointment_limit_time : 0
             * start : 1526961600
             * end : 1526965200
             * lessonName : 头痛缓解瑜伽
             * lessonId : 377
             * lessonTime : 60
             * lessonImg : 
             * introduce : 五官系列
             * lessonContent : 
             * classroomName : 私教课室
             * classroomId : 201
             * allAppNum : 0
             * appFromYueKeNum : 0
             * appFromQuanYiNum : 0
             * tutorList : [{"id":246,"name":"夏老师"}]
             * isExpired : 0
             * quanYiIsFull : 1
             * quanYiCanAppNum : 0
             * yueKeCanAppNum : 10
             */

            private int id;
            private int shop_id;
            private int parent_shop_id;
            private int lesson_id;
            private int start_time;
            private int end_time;
            private int classroom_id;
            private int number;
            private int create_time;
            private int update_time;
            private int is_deleted;
            private int cancel_use_time;
            private String course_color;
            private int limit_number;
            private int limit_cencel_time;
            private int is_pay;
            private String price;
            private int is_recommend;
            private int appointment_limit_time;
            private int start;
            private int end;
            private String lessonName;
            private int lessonId;
            private int lessonTime;
            private String lessonImg;
            private String introduce;
            private String lessonContent;
            private String classroomName;
            private int classroomId;
            private int allAppNum;
            private int appFromYueKeNum;
            private int appFromQuanYiNum;
            private int isExpired;
            private int quanYiIsFull;
            private int quanYiCanAppNum;
            private int yueKeCanAppNum;
            private List<TutorListBean> tutorList;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getShop_id() {
                return shop_id;
            }

            public void setShop_id(int shop_id) {
                this.shop_id = shop_id;
            }

            public int getParent_shop_id() {
                return parent_shop_id;
            }

            public void setParent_shop_id(int parent_shop_id) {
                this.parent_shop_id = parent_shop_id;
            }

            public int getLesson_id() {
                return lesson_id;
            }

            public void setLesson_id(int lesson_id) {
                this.lesson_id = lesson_id;
            }

            public int getStart_time() {
                return start_time;
            }

            public void setStart_time(int start_time) {
                this.start_time = start_time;
            }

            public int getEnd_time() {
                return end_time;
            }

            public void setEnd_time(int end_time) {
                this.end_time = end_time;
            }

            public int getClassroom_id() {
                return classroom_id;
            }

            public void setClassroom_id(int classroom_id) {
                this.classroom_id = classroom_id;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public int getCreate_time() {
                return create_time;
            }

            public void setCreate_time(int create_time) {
                this.create_time = create_time;
            }

            public int getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(int update_time) {
                this.update_time = update_time;
            }

            public int getIs_deleted() {
                return is_deleted;
            }

            public void setIs_deleted(int is_deleted) {
                this.is_deleted = is_deleted;
            }

            public int getCancel_use_time() {
                return cancel_use_time;
            }

            public void setCancel_use_time(int cancel_use_time) {
                this.cancel_use_time = cancel_use_time;
            }

            public String getCourse_color() {
                return course_color;
            }

            public void setCourse_color(String course_color) {
                this.course_color = course_color;
            }

            public int getLimit_number() {
                return limit_number;
            }

            public void setLimit_number(int limit_number) {
                this.limit_number = limit_number;
            }

            public int getLimit_cencel_time() {
                return limit_cencel_time;
            }

            public void setLimit_cencel_time(int limit_cencel_time) {
                this.limit_cencel_time = limit_cencel_time;
            }

            public int getIs_pay() {
                return is_pay;
            }

            public void setIs_pay(int is_pay) {
                this.is_pay = is_pay;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public int getIs_recommend() {
                return is_recommend;
            }

            public void setIs_recommend(int is_recommend) {
                this.is_recommend = is_recommend;
            }

            public int getAppointment_limit_time() {
                return appointment_limit_time;
            }

            public void setAppointment_limit_time(int appointment_limit_time) {
                this.appointment_limit_time = appointment_limit_time;
            }

            public int getStart() {
                return start;
            }

            public void setStart(int start) {
                this.start = start;
            }

            public int getEnd() {
                return end;
            }

            public void setEnd(int end) {
                this.end = end;
            }

            public String getLessonName() {
                return lessonName;
            }

            public void setLessonName(String lessonName) {
                this.lessonName = lessonName;
            }

            public int getLessonId() {
                return lessonId;
            }

            public void setLessonId(int lessonId) {
                this.lessonId = lessonId;
            }

            public int getLessonTime() {
                return lessonTime;
            }

            public void setLessonTime(int lessonTime) {
                this.lessonTime = lessonTime;
            }

            public String getLessonImg() {
                return lessonImg;
            }

            public void setLessonImg(String lessonImg) {
                this.lessonImg = lessonImg;
            }

            public String getIntroduce() {
                return introduce;
            }

            public void setIntroduce(String introduce) {
                this.introduce = introduce;
            }

            public String getLessonContent() {
                return lessonContent;
            }

            public void setLessonContent(String lessonContent) {
                this.lessonContent = lessonContent;
            }

            public String getClassroomName() {
                return classroomName;
            }

            public void setClassroomName(String classroomName) {
                this.classroomName = classroomName;
            }

            public int getClassroomId() {
                return classroomId;
            }

            public void setClassroomId(int classroomId) {
                this.classroomId = classroomId;
            }

            public int getAllAppNum() {
                return allAppNum;
            }

            public void setAllAppNum(int allAppNum) {
                this.allAppNum = allAppNum;
            }

            public int getAppFromYueKeNum() {
                return appFromYueKeNum;
            }

            public void setAppFromYueKeNum(int appFromYueKeNum) {
                this.appFromYueKeNum = appFromYueKeNum;
            }

            public int getAppFromQuanYiNum() {
                return appFromQuanYiNum;
            }

            public void setAppFromQuanYiNum(int appFromQuanYiNum) {
                this.appFromQuanYiNum = appFromQuanYiNum;
            }

            public int getIsExpired() {
                return isExpired;
            }

            public void setIsExpired(int isExpired) {
                this.isExpired = isExpired;
            }

            public int getQuanYiIsFull() {
                return quanYiIsFull;
            }

            public void setQuanYiIsFull(int quanYiIsFull) {
                this.quanYiIsFull = quanYiIsFull;
            }

            public int getQuanYiCanAppNum() {
                return quanYiCanAppNum;
            }

            public void setQuanYiCanAppNum(int quanYiCanAppNum) {
                this.quanYiCanAppNum = quanYiCanAppNum;
            }

            public int getYueKeCanAppNum() {
                return yueKeCanAppNum;
            }

            public void setYueKeCanAppNum(int yueKeCanAppNum) {
                this.yueKeCanAppNum = yueKeCanAppNum;
            }

            public List<TutorListBean> getTutorList() {
                return tutorList;
            }

            public void setTutorList(List<TutorListBean> tutorList) {
                this.tutorList = tutorList;
            }

            public static class TutorListBean {
                /**
                 * id : 246
                 * name : 夏老师
                 */

                private int id;
                private String name;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class UsingMembershipBean {
            /**
             * shopId : 63684083
             * shopName : 广州
             * shopLogopath : http://testyogabook.hq-xl.com/static/images/logo/shop_1455076031.png
             * membership : [{"membershipId":2208,"categoryId":1,"categoryName":"期限卡","status":0,"cardName":"广州深圳一年卡","expireTime":1553914980,"startTime":1522378980,"hasTerm":12,"hasTime":0,"validTime":0,"price":"0.01","isChain":1},{"membershipId":2207,"categoryId":2,"categoryName":"次卡","status":0,"cardName":"广州深圳通用20次卡","expireTime":1527648360,"startTime":1522377960,"hasTerm":2,"hasTime":20,"validTime":19,"price":"0.01","isChain":1}]
             */

            private int shopId;
            private String shopName;
            private String shopLogopath;
            private List<MembershipBean> membership;

            public int getShopId() {
                return shopId;
            }

            public void setShopId(int shopId) {
                this.shopId = shopId;
            }

            public String getShopName() {
                return shopName;
            }

            public void setShopName(String shopName) {
                this.shopName = shopName;
            }

            public String getShopLogopath() {
                return shopLogopath;
            }

            public void setShopLogopath(String shopLogopath) {
                this.shopLogopath = shopLogopath;
            }

            public List<MembershipBean> getMembership() {
                return membership;
            }

            public void setMembership(List<MembershipBean> membership) {
                this.membership = membership;
            }

            public static class MembershipBean {
                /**
                 * membershipId : 2208
                 * categoryId : 1
                 * categoryName : 期限卡
                 * status : 0
                 * cardName : 广州深圳一年卡
                 * expireTime : 1553914980
                 * startTime : 1522378980
                 * hasTerm : 12
                 * hasTime : 0
                 * validTime : 0
                 * price : 0.01
                 * isChain : 1
                 */

                private int membershipId;
                private int categoryId;
                private String categoryName;
                private int status;
                private String cardName;
                private int expireTime;
                private int startTime;
                private int hasTerm;
                private int hasTime;
                private int validTime;
                private String price;
                private int isChain;

                public int getMembershipId() {
                    return membershipId;
                }

                public void setMembershipId(int membershipId) {
                    this.membershipId = membershipId;
                }

                public int getCategoryId() {
                    return categoryId;
                }

                public void setCategoryId(int categoryId) {
                    this.categoryId = categoryId;
                }

                public String getCategoryName() {
                    return categoryName;
                }

                public void setCategoryName(String categoryName) {
                    this.categoryName = categoryName;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getCardName() {
                    return cardName;
                }

                public void setCardName(String cardName) {
                    this.cardName = cardName;
                }

                public int getExpireTime() {
                    return expireTime;
                }

                public void setExpireTime(int expireTime) {
                    this.expireTime = expireTime;
                }

                public int getStartTime() {
                    return startTime;
                }

                public void setStartTime(int startTime) {
                    this.startTime = startTime;
                }

                public int getHasTerm() {
                    return hasTerm;
                }

                public void setHasTerm(int hasTerm) {
                    this.hasTerm = hasTerm;
                }

                public int getHasTime() {
                    return hasTime;
                }

                public void setHasTime(int hasTime) {
                    this.hasTime = hasTime;
                }

                public int getValidTime() {
                    return validTime;
                }

                public void setValidTime(int validTime) {
                    this.validTime = validTime;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public int getIsChain() {
                    return isChain;
                }

                public void setIsChain(int isChain) {
                    this.isChain = isChain;
                }
            }
        }
    }
}