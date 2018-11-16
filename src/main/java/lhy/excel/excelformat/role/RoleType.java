package lhy.excel.excelformat.role;

/**
 * 设置POI Cell的数据类型
 *
 */
public class RoleType {
    /**
     * 非空  1
     */
    public static final int NOT_NULL = 1;
    /**
     * map 映射 10
     */
    public static final int MAP_TYPE = 1 << 1;
    /**
     *    数据库表映射 100
     */
    public static final int TB_TYPE = 1 << 2;
    /**
     *     字符串映射  1000
     */
    public static final int STR_TYPE = 1 << 3;
    /**
     *     int类型    1000
     */
    public static final int INT_TYPE = 1 << 4;

    /**
     *      float   类型
     */
    public static final int FLOAT_TYPE = 1 << 5;

    public static  final int DATE_TYPE = 1<<6;


    public static  Integer getTbType(){ return TB_TYPE; }

    public static Integer getStrType(){
        return STR_TYPE;
    }


    public static  Integer getMapType(){
        return MAP_TYPE;
    }

    public static  Integer getIntType(){
        return INT_TYPE;
    }

    public static  Integer getFlType(){
        return FLOAT_TYPE;
    }

    public static  Integer getDateType(){
        return DATE_TYPE;
    }

    public static Integer getDateTypeNotNull(){
        return DATE_TYPE | NOT_NULL;
    }

    public static Integer getStrTypeNotNull(){
        return STR_TYPE | NOT_NULL;
    }

    public static  Integer getMapTypeNotNull(){
        return MAP_TYPE | NOT_NULL;
    }

    public static  Integer getNotNullTypeNotNull(){
        return NOT_NULL | NOT_NULL;
    }

    public static  Integer getIntTypeNotNull(){
        return INT_TYPE | NOT_NULL;
    }

    public static  Integer getFlTypeNotNull(){
        return FLOAT_TYPE | NOT_NULL;
    }


}
