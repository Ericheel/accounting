package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 *
 * @author ericheel
 */
public class DateUtils {

    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    private DateUtils() {
    }

    /**
     * 今日日期
     *
     * @return
     */
    public static String getToday() {
        Date date = new Date();
        return format.format(date);
    }
}
