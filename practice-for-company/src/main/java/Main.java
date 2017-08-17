import com.huang.creator.CodeCreator;

/**
 * Created by huang_jiangling on 2017/8/16.
 */
public class Main {
    public static void main(String[] args) {
        CodeCreator.create(CxsCallRecordIndex.class).printFields().pringColumnChangeField().printColumnChangeJavaType();
    }
}
