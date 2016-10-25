package com.my.weatherapplication;

import java.util.List;

/**
 * Created by L on 16/9/8.
 */
public class Info {


    /**
     * reason : successed!
     * result : {"data":{"realtime":{"city_code":"101010100","city_name":"北京","date":"2016-09-08","time":"15:00:00","week":4,"moon":"八月初八","dataUptime":1473318661,"weather":{"temperature":"30","humidity":"27","info":"晴","img":"0"},"wind":{"direct":"北风","power":"2级","offset":null,"windspeed":null}},"life":{"date":"2016-9-8","info":{"chuanyi":["炎热","天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"wuran":["中","气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较适宜","天气较好，户外运动请注意防晒。推荐您进行室内运动。"],"ziwaixian":["很强","紫外线辐射极强，建议涂擦SPF20以上、PA++的防晒护肤品，尽量避免暴露于日光下。"]}},"weather":[{"date":"2016-09-08","info":{"day":["0","晴","31","","微风","05:49"],"night":["0","晴","18","","微风","18:34"]},"week":"四","nongli":"八月初八"},{"date":"2016-09-09","info":{"dawn":["0","晴","18","无持续风向","微风","18:34"],"day":["0","晴","31","","微风","05:50"],"night":["1","多云","19","","微风","18:33"]},"week":"五","nongli":"八月初九"},{"date":"2016-09-10","info":{"dawn":["1","多云","19","无持续风向","微风","18:33"],"day":["1","多云","29","","微风","05:51"],"night":["3","阵雨","18","","微风","18:31"]},"week":"六","nongli":"八月初十 "},{"date":"2016-09-11","info":{"dawn":["3","阵雨","18","无持续风向","微风","18:31"],"day":["3","阵雨","25","","微风","05:51"],"night":["1","多云","17","","微风","18:29"]},"week":"日","nongli":"八月十一"},{"date":"2016-09-12","info":{"dawn":["1","多云","17","无持续风向","微风","18:29"],"day":["1","多云","27","","微风","05:52"],"night":["2","阴","19","","微风","18:28"]},"week":"一","nongli":"八月十二"}],"pm25":{"key":"Beijing","show_desc":0,"pm25":{"curPm":"26","pm25":"12","pm10":"13","level":1,"quality":"优","des":"可正常活动。"},"dateTime":"2016年09月08日15时","cityName":"北京"},"jingqu":"","date":"","isForeign":"0"}}
     * error_code : 0
     */

    private String reason;
    /**
     * data : {"realtime":{"city_code":"101010100","city_name":"北京","date":"2016-09-08","time":"15:00:00","week":4,"moon":"八月初八","dataUptime":1473318661,"weather":{"temperature":"30","humidity":"27","info":"晴","img":"0"},"wind":{"direct":"北风","power":"2级","offset":null,"windspeed":null}},"life":{"date":"2016-9-8","info":{"chuanyi":["炎热","天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"wuran":["中","气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较适宜","天气较好，户外运动请注意防晒。推荐您进行室内运动。"],"ziwaixian":["很强","紫外线辐射极强，建议涂擦SPF20以上、PA++的防晒护肤品，尽量避免暴露于日光下。"]}},"weather":[{"date":"2016-09-08","info":{"day":["0","晴","31","","微风","05:49"],"night":["0","晴","18","","微风","18:34"]},"week":"四","nongli":"八月初八"},{"date":"2016-09-09","info":{"dawn":["0","晴","18","无持续风向","微风","18:34"],"day":["0","晴","31","","微风","05:50"],"night":["1","多云","19","","微风","18:33"]},"week":"五","nongli":"八月初九"},{"date":"2016-09-10","info":{"dawn":["1","多云","19","无持续风向","微风","18:33"],"day":["1","多云","29","","微风","05:51"],"night":["3","阵雨","18","","微风","18:31"]},"week":"六","nongli":"八月初十 "},{"date":"2016-09-11","info":{"dawn":["3","阵雨","18","无持续风向","微风","18:31"],"day":["3","阵雨","25","","微风","05:51"],"night":["1","多云","17","","微风","18:29"]},"week":"日","nongli":"八月十一"},{"date":"2016-09-12","info":{"dawn":["1","多云","17","无持续风向","微风","18:29"],"day":["1","多云","27","","微风","05:52"],"night":["2","阴","19","","微风","18:28"]},"week":"一","nongli":"八月十二"}],"pm25":{"key":"Beijing","show_desc":0,"pm25":{"curPm":"26","pm25":"12","pm10":"13","level":1,"quality":"优","des":"可正常活动。"},"dateTime":"2016年09月08日15时","cityName":"北京"},"jingqu":"","date":"","isForeign":"0"}
     */

    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * realtime : {"city_code":"101010100","city_name":"北京","date":"2016-09-08","time":"15:00:00","week":4,"moon":"八月初八","dataUptime":1473318661,"weather":{"temperature":"30","humidity":"27","info":"晴","img":"0"},"wind":{"direct":"北风","power":"2级","offset":null,"windspeed":null}}
         * life : {"date":"2016-9-8","info":{"chuanyi":["炎热","天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"wuran":["中","气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较适宜","天气较好，户外运动请注意防晒。推荐您进行室内运动。"],"ziwaixian":["很强","紫外线辐射极强，建议涂擦SPF20以上、PA++的防晒护肤品，尽量避免暴露于日光下。"]}}
         * weather : [{"date":"2016-09-08","info":{"day":["0","晴","31","","微风","05:49"],"night":["0","晴","18","","微风","18:34"]},"week":"四","nongli":"八月初八"},{"date":"2016-09-09","info":{"dawn":["0","晴","18","无持续风向","微风","18:34"],"day":["0","晴","31","","微风","05:50"],"night":["1","多云","19","","微风","18:33"]},"week":"五","nongli":"八月初九"},{"date":"2016-09-10","info":{"dawn":["1","多云","19","无持续风向","微风","18:33"],"day":["1","多云","29","","微风","05:51"],"night":["3","阵雨","18","","微风","18:31"]},"week":"六","nongli":"八月初十 "},{"date":"2016-09-11","info":{"dawn":["3","阵雨","18","无持续风向","微风","18:31"],"day":["3","阵雨","25","","微风","05:51"],"night":["1","多云","17","","微风","18:29"]},"week":"日","nongli":"八月十一"},{"date":"2016-09-12","info":{"dawn":["1","多云","17","无持续风向","微风","18:29"],"day":["1","多云","27","","微风","05:52"],"night":["2","阴","19","","微风","18:28"]},"week":"一","nongli":"八月十二"}]
         * pm25 : {"key":"Beijing","show_desc":0,"pm25":{"curPm":"26","pm25":"12","pm10":"13","level":1,"quality":"优","des":"可正常活动。"},"dateTime":"2016年09月08日15时","cityName":"北京"}
         * jingqu :
         * date :
         * isForeign : 0
         */

        private DataBean data;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * city_code : 101010100
             * city_name : 北京
             * date : 2016-09-08
             * time : 15:00:00
             * week : 4
             * moon : 八月初八
             * dataUptime : 1473318661
             * weather : {"temperature":"30","humidity":"27","info":"晴","img":"0"}
             * wind : {"direct":"北风","power":"2级","offset":null,"windspeed":null}
             */

            private RealtimeBean realtime;
            /**
             * date : 2016-9-8
             * info : {"chuanyi":["炎热","天气炎热，建议着短衫、短裙、短裤、薄型T恤衫等清凉夏季服装。"],"ganmao":["少发","各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。"],"kongtiao":["部分时间开启","天气热，到中午的时候您将会感到有点热，因此建议在午后较热时开启制冷空调。"],"wuran":["中","气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"],"xiche":["较适宜","较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"],"yundong":["较适宜","天气较好，户外运动请注意防晒。推荐您进行室内运动。"],"ziwaixian":["很强","紫外线辐射极强，建议涂擦SPF20以上、PA++的防晒护肤品，尽量避免暴露于日光下。"]}
             */

            private LifeBean life;
            /**
             * date : 2016-09-08
             * info : {"day":["0","晴","31","","微风","05:49"],"night":["0","晴","18","","微风","18:34"]}
             * week : 四
             * nongli : 八月初八
             */

            private List<WeatherBean> weather;

            public RealtimeBean getRealtime() {
                return realtime;
            }

            public void setRealtime(RealtimeBean realtime) {
                this.realtime = realtime;
            }

            public LifeBean getLife() {
                return life;
            }

            public void setLife(LifeBean life) {
                this.life = life;
            }

            public List<WeatherBean> getWeather() {
                return weather;
            }

            public void setWeather(List<WeatherBean> weather) {
                this.weather = weather;
            }

            public static class RealtimeBean {
                private String city_code;
                private String city_name;
                private String date;
                private String time;
                private int week;
                private String moon;
                private int dataUptime;
                /**
                 * temperature : 30
                 * humidity : 27
                 * info : 晴
                 * img : 0
                 */

                private WeatherBean weather;
                /**
                 * direct : 北风
                 * power : 2级
                 * offset : null
                 * windspeed : null
                 */

                private WindBean wind;

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public int getWeek() {
                    return week;
                }

                public void setWeek(int week) {
                    this.week = week;
                }

                public String getMoon() {
                    return moon;
                }

                public void setMoon(String moon) {
                    this.moon = moon;
                }

                public int getDataUptime() {
                    return dataUptime;
                }

                public void setDataUptime(int dataUptime) {
                    this.dataUptime = dataUptime;
                }

                public WeatherBean getWeather() {
                    return weather;
                }

                public void setWeather(WeatherBean weather) {
                    this.weather = weather;
                }

                public WindBean getWind() {
                    return wind;
                }

                public void setWind(WindBean wind) {
                    this.wind = wind;
                }

                public static class WeatherBean {
                    private String temperature;
                    private String humidity;
                    private String info;
                    private String img;

                    public String getTemperature() {
                        return temperature;
                    }

                    public void setTemperature(String temperature) {
                        this.temperature = temperature;
                    }

                    public String getHumidity() {
                        return humidity;
                    }

                    public void setHumidity(String humidity) {
                        this.humidity = humidity;
                    }

                    public String getInfo() {
                        return info;
                    }

                    public void setInfo(String info) {
                        this.info = info;
                    }

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }
                }

                public static class WindBean {
                    private String direct;
                    private String power;
                    private Object offset;
                    private Object windspeed;

                    public String getDirect() {
                        return direct;
                    }

                    public void setDirect(String direct) {
                        this.direct = direct;
                    }

                    public String getPower() {
                        return power;
                    }

                    public void setPower(String power) {
                        this.power = power;
                    }

                    public Object getOffset() {
                        return offset;
                    }

                    public void setOffset(Object offset) {
                        this.offset = offset;
                    }

                    public Object getWindspeed() {
                        return windspeed;
                    }

                    public void setWindspeed(Object windspeed) {
                        this.windspeed = windspeed;
                    }
                }
            }

            public static class LifeBean {
                private String date;
                private InfoBean info;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public InfoBean getInfo() {
                    return info;
                }

                public void setInfo(InfoBean info) {
                    this.info = info;
                }

                public static class InfoBean {
                    private List<String> chuanyi;
                    private List<String> ganmao;
                    private List<String> kongtiao;
                    private List<String> wuran;
                    private List<String> xiche;
                    private List<String> yundong;
                    private List<String> ziwaixian;

                    public List<String> getChuanyi() {
                        return chuanyi;
                    }

                    public void setChuanyi(List<String> chuanyi) {
                        this.chuanyi = chuanyi;
                    }

                    public List<String> getGanmao() {
                        return ganmao;
                    }

                    public void setGanmao(List<String> ganmao) {
                        this.ganmao = ganmao;
                    }

                    public List<String> getKongtiao() {
                        return kongtiao;
                    }

                    public void setKongtiao(List<String> kongtiao) {
                        this.kongtiao = kongtiao;
                    }

                    public List<String> getWuran() {
                        return wuran;
                    }

                    public void setWuran(List<String> wuran) {
                        this.wuran = wuran;
                    }

                    public List<String> getXiche() {
                        return xiche;
                    }

                    public void setXiche(List<String> xiche) {
                        this.xiche = xiche;
                    }

                    public List<String> getYundong() {
                        return yundong;
                    }

                    public void setYundong(List<String> yundong) {
                        this.yundong = yundong;
                    }

                    public List<String> getZiwaixian() {
                        return ziwaixian;
                    }

                    public void setZiwaixian(List<String> ziwaixian) {
                        this.ziwaixian = ziwaixian;
                    }
                }
            }

            public static class WeatherBean {
                private String date;
                private InfoBean info;
                private String week;
                private String nongli;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public InfoBean getInfo() {
                    return info;
                }

                public void setInfo(InfoBean info) {
                    this.info = info;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getNongli() {
                    return nongli;
                }

                public void setNongli(String nongli) {
                    this.nongli = nongli;
                }

                public static class InfoBean {
                    private List<String> day;
                    private List<String> night;

                    public List<String> getDay() {
                        return day;
                    }

                    public void setDay(List<String> day) {
                        this.day = day;
                    }

                    public List<String> getNight() {
                        return night;
                    }

                    public void setNight(List<String> night) {
                        this.night = night;
                    }
                }
            }
        }
    }
}
