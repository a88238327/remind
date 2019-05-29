package com.remind.remind.entity;

public class reminddemo {
    public static void postremindnianshen(String openid,String enddate,String number){
        String str="{\r\n" +
                "	\"touser\":\"OPENID\",\r\n" +
                "	\"template_id\":\"TEMPLATE_ID\",\r\n" +
                "	\"url\":\"URL\",\r\n" +
                "	\"data\":{\r\n" +
                "		\"first\":{\r\n" +
                "			\"value\":\"FIRST\"\r\n" +
                "		},\r\n" +
                "		\"keyword1\":{\r\n" +
                "			\"value\":\"KEYWORD1\"\r\n" +
                "		},\r\n" +
                "		\"keyword2\":{\r\n" +
                "			\"value\":\"KEYWORD2\"\r\n" +
                "		},\"remark\":{\r\n" +
                "			\"value\":\"REMARK\"\r\n" +
                "		}\r\n" +
                "	}\r\n" +
                "}";
        System.out.println(str);
        String url="https://cloud.hnjtbf.com/CustomerLogin/userlogin?go=mianfeinianshen";
        str=str.replace("OPENID", openid);
        str=str.replace("FIRST", "尊敬的車家网会员您好，您的爱车年审即将到期!");
        str=str.replace("TEMPLATE_ID", "yae2FDAAb25faF6Mw_2zdpy2QPBxyS4OMtXUD596fEo");
        str=str.replace("KEYWORD1", number);
        str=str.replace("KEYWORD2", enddate.replace("/","年")+"月");
        str=str.replace("REMARK", "点击预约代办理年审事务");
        str=str.replace("URL", url);
        String urlString="https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
        String resultString=Util.post(urlString.replace("ACCESS_TOKEN", getToken.get_ACCESSTOKEN()), str);
        System.out.println(resultString);
    }
    public static void postremindbaoxian(String openid,String enddate,String number,String type){
        String str="{\r\n" +
                "	\"touser\":\"OPENID\",\r\n" +
                "	\"template_id\":\"TEMPLATE_ID\",\r\n" +
                "	\"url\":\"URL\",\r\n" +
                "	\"data\":{\r\n" +
                "		\"first\":{\r\n" +
                "			\"value\":\"FIRST\"\r\n" +
                "		},\r\n" +
                "		\"keyword1\":{\r\n" +
                "			\"value\":\"KEYWORD1\"\r\n" +
                "		},\r\n" +
                "		\"keyword2\":{\r\n" +
                "			\"value\":\"KEYWORD2\"\r\n" +
                "		},\"remark\":{\r\n" +
                "			\"value\":\"REMARK\"\r\n" +
                "		}\r\n" +
                "	}\r\n" +
                "}";
        System.out.println("时间"+enddate);
        System.out.println(str);
        String url="https://cloud.hnjtbf.com/CustomerLogin/userlogin?go=buybaoxian";
        str=str.replace("OPENID", openid);
        str=str.replace("FIRST", "尊敬的車家网会员您好，您的爱车的"+type+"即将到期!");
        str=str.replace("TEMPLATE_ID", "yae2FDAAb25faF6Mw_2zdpy2QPBxyS4OMtXUD596fEo");
        str=str.replace("KEYWORD1", number);
        str=str.replace("KEYWORD2", enddate);
        str=str.replace("REMARK", "点击申请保险续费，您提交工单后我们的工作人员会与您及时联系，感谢您的使用！");
        str=str.replace("URL", url);
        String urlString="https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
        String resultString=Util.post(urlString.replace("ACCESS_TOKEN", getToken.get_ACCESSTOKEN()), str);
        System.out.println(resultString);
    }
    public static void postjiazhaonianshen(String openid,String enddate,String name,String type,String first){
        String str="{\n" +
                "\t\"touser\": \"OPENID\",\n" +
                "\t\"template_id\": \"TEMPLATE_ID\",\n" +
                "\t\"url\": \"URL\",\n" +
                "\t\"data\": {\n" +
                "\t\t\"first\": {\n" +
                "\t\t\t\"value\": \"FIRST\"\n" +
                "\t\t},\n" +
                "\t\t\"keynote1\": {\n" +
                "\t\t\t\"value\": \"KEYWORD1\"\n" +
                "\t\t},\n" +
                "\t\t\"keynote2\": {\n" +
                "\t\t\t\"value\": \"KEYWORD2\"\n" +
                "\t\t},\n" +
                "\t\t\"keynote3\": {\n" +
                "\t\t\t\"value\": \"KEYWORD3\"\n" +
                "\t\t},\n" +
                "\t\t\"keynote4\": {\n" +
                "\t\t\t\"value\": \"KEYWORD4 \"\n" +
                "\t\t},\n" +
                "\t\t\"remark \": {\n" +
                "\t\t\t\"value\": \"REMARK\"\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}";
        System.out.println("时间"+enddate);
        System.out.println(str);
        String url="https://cloud.hnjtbf.com/CustomerLogin/userlogin";
        str=str.replace("OPENID", openid);
        str=str.replace("FIRST", "尊敬的車家网会员您好，您的驾照的即将到期!");
        str=str.replace("TEMPLATE_ID", "xWJgUtSiJ9zZ4OCbmo8PDc1PpkU8dWPDk3K4DQnyoNY");
        str=str.replace("KEYWORD1", enddate);
        str=str.replace("KEYWORD2", name);
        str=str.replace("KEYWORD3", type);
        str=str.replace("KEYWORD4", first);
        str=str.replace("REMARK", "感谢您的使用！");
        str=str.replace("URL", url);
        String urlString="https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
        String resultString=Util.post(urlString.replace("ACCESS_TOKEN", getToken.get_ACCESSTOKEN()), str);
        System.out.println(resultString);
    }
}
