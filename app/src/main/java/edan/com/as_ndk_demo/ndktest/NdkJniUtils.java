package edan.com.as_ndk_demo.ndktest;

/**
 * Created by ouyangshengduo on 2016/9/23.
 */
public class NdkJniUtils {

    static {
        System.loadLibrary("MyTestJniLib");   //defaultConfig.ndk.moduleName
    }
    public native String getCLanguageString();

}
