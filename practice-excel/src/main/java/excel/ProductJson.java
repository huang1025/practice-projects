package excel;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by huang on 2017/6/16.
 */
public class ProductJson {

    public static String getClassType(String productName) {
        JSONArray jsonArray = JSON.parseArray(json);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject each = jsonArray.getJSONObject(i);
            String product_name = each.getString("PRODUCT_NAME");
            if (product_name.equals(productName)) {
                return each.getString("CLASS_TYPE");
            }
        }
        return null;
    }

    public static String getClassCode(String productCode) {
        JSONArray jsonArray = JSON.parseArray(json);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject each = jsonArray.getJSONObject(i);
            String product_name = each.getString("PRODUCT_NAME");
            if (product_name.equals(productCode)) {
                return each.getString("PRODUCT_CODE");
            }
        }
        return null;
    }

    public static String json = "";

}
