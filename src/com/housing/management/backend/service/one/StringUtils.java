package com.housing.management.backend.service.one;

import java.util.Random;

public class StringUtils {

    static StringBuffer buffer = new StringBuffer(
            "0123456789_abcdefghijklmno_pqrstuv_wxyzABCD_EFGHIJKLMNOP_QRSTUVWX_YZ");
    static StringBuffer bufferN = new StringBuffer("0123456789");

    public static boolean isNull(String s) {
        if (null == s || s.trim().equals("")) {
            return true;
        }
        return false;
    }

    public static String replaceCardNoByStar(String str, int suf) {
        if (null == str || str.length() < suf) {
            return str;
        }

        return "****" + str.substring(str.length() - suf);
    }

    public static String getRandomString(int length) {
        StringBuffer sb = new StringBuffer("");

        Random r = new Random();

        int range = buffer.length();

        for (int i = 0; i < length; i++) {

            sb.append(buffer.charAt(r.nextInt(range)));

        }
        return sb.toString();
    }

    public static String getRandomNumber(int length) {
        StringBuffer sb = new StringBuffer("");

        Random r = new Random();

        int range = bufferN.length();

        for (int i = 0; i < length; i++) {

            sb.append(bufferN.charAt(r.nextInt(range)));

        }
        return sb.toString();
    }

    /**
     * 把一个Internet 地址字符串包装成html形式的超链接
     * 
     * @param address
     * @param linkText
     * @return
     */
    public static StringBuilder appendHyperLink(StringBuilder address,
            String linkText) {
        StringBuilder sbn = new StringBuilder();
        sbn.append("<a href=\"");
        sbn.append(address.toString());
        sbn.append("\">");
        sbn.append(linkText);
        sbn.append("</a>");
        return sbn;
    }

    public static StringBuilder wrapWithHtml(StringBuilder sb) {
        StringBuilder sbn = new StringBuilder();
        sbn.append("<html><body>");
        sbn.append(sb.toString());
        sbn.append("</body></html>");
        return sb;
    }

    // 判断验证信息是否过期
    public boolean isExpired(String time) {
        long ctime = System.currentTimeMillis();
        long endTime = Long.parseLong(time);
        return ctime > endTime;
    }

    /**
     * 判断字符串是否为空.
     * 
     * @param src
     * @return
     */
    public static boolean isEmpty(final String src) {
        if (null == src || "".equals(src)) {
            return true;
        }
        return false;
    }

    /**
     * 把key=value追加到加密/签名字符串最后.
     * 
     * @param buf
     * @param key
     * @param value
     */
    public static void appendSignPara(StringBuffer buf, String key, String value) {
        if (!StringUtils.isEmpty(value)) {
            buf.append(key).append('=').append(value).append('&');
        }
    }

    /**
     * 把key=value追加到加密/签名字符串的末尾.字符串不再继续增加新的key=value.
     * 
     * @param buf
     * @param key
     * @param value
     */
    public static void appendLastSignPara(StringBuffer buf, String key,
            String value) {
        if (!StringUtils.isEmpty(value)) {
            buf.append(key).append('=').append(value);
        }
    }

}
